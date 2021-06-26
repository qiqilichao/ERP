package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.PayDetailsMapper;
import com.guigu.pojo.*;
import com.guigu.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayDetailsServiceImpl extends ServiceImpl<PayDetailsMapper, PayDetails>
        implements PayDetailsService {

    @Autowired
    private ScellService scellService;

    @Autowired
    private ManufactureService manufactureService;

    @Autowired
    private PayService payService;

    @Autowired
    private PayDetailsService payDetailsService;

    @Autowired
    private ProcedureService procedureService;


    @Autowired
    private ProcedureModuleService procedureModuleService;

    //提交出库调度业务
    @Override
    public boolean inventorySubmission(List<Scell> scell) {


        scell.get(0).setAmount( scell.get(0).getAmount()- scell.get(0).getConfirm());
         boolean uscell = scellService.updateById( scell.get(0));

        //修改出库表状态
        QueryWrapper<Pay> payQueryWrapper=new QueryWrapper<>();
        payQueryWrapper.eq("PAY_ID", scell.get(0).getPayid());
        Pay payServiceOne = payService.getOne(payQueryWrapper);
        payServiceOne.setPaidAmountSum( Float.valueOf( scell.get(0).getConfirm()));
        payServiceOne.setPayTag("K002-2");
        boolean payUpdateById = payService.updateById(payServiceOne);


        //拆分出库明细属性
        String reasonexact = payServiceOne.getReasonexact();
        String subId = reasonexact.substring(0,15);
        String subName = reasonexact.substring(16);

        //修改出库明细表
       QueryWrapper<PayDetails> payDetailsQueryWrapper=new QueryWrapper<>();
        payDetailsQueryWrapper.eq("PARENT_ID", payServiceOne.getId());
        payDetailsQueryWrapper.eq("PRODUCT_ID",scell.get(0).getMid());
        PayDetails payDetailsone = payDetailsService.getOne(payDetailsQueryWrapper);
        payDetailsone.setPaidAmount(scell.get(0).getConfirm());
        if(payDetailsone.getPaidAmount()==payDetailsone.getAmount()){
            payDetailsone.setPayTag("K002-2");
        }
        boolean updateById = payDetailsService.updateById(payDetailsone);


        //用派工ID查询
        QueryWrapper<Manufacture> manufactureQueryWrapper = new QueryWrapper<>();
        manufactureQueryWrapper.eq("MANUFACTURE_ID",subId);
        Manufacture manufacture = manufactureService.getOne(manufactureQueryWrapper);


        //查询生产工序表
        QueryWrapper<Procedure> procedureQueryWrapper =new QueryWrapper<>();
        procedureQueryWrapper.eq("PARENT_ID",manufacture.getId());
        procedureQueryWrapper.eq("PROCEDURE_NAME",subName);
        Procedure procedure = procedureService.getOne(procedureQueryWrapper);


        QueryWrapper<ProcedureModule> procedureModuleQueryWrapper=new QueryWrapper<>();
        procedureModuleQueryWrapper.eq("PARENT_ID",procedure.getId());
        procedureModuleQueryWrapper.eq("PRODUCT_ID",scell.get(0).getMid());

        ProcedureModule procedureModule = procedureModuleService.getOne(procedureModuleQueryWrapper);
        procedureModule.setRenewAmount(scell.get(0).getConfirm());

        boolean updateById1 = procedureModuleService.updateById(procedureModule);


        if(uscell&&payUpdateById&&updateById&&updateById1)
            return true;
        return false;
    }

}
