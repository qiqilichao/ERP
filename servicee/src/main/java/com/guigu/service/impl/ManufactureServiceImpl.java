package com.guigu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.ManufactureMapper;
import com.guigu.pojo.*;
import com.guigu.service.*;
import com.guigu.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

@Service
public class ManufactureServiceImpl extends ServiceImpl<ManufactureMapper,Manufacture>
        implements ManufactureService {

    @Autowired
    private DesignProcedureDetailsService designProcedureDetailsService;

    @Autowired
    private DesignProcedureModuleService designProcedureModuleService;


    @Autowired
    private ApplyService applyService;

    @Autowired
    private ProcedureService procedureService;


    @Autowired
    private ProcedureModuleService procedureModuleService;

    @Override
    @Transient
    public boolean addManufacture(Manufacture manufacture) {

        //提交生产总表前修改生产计划派工标志
        List<Apply> applies = applyService.queryByproductIdList(manufacture.getProductId());
        for (Apply a : applies) {
              a.setManufactureTag("P001-1");
        }
        boolean b = applyService.updateBatchById(applies);


        //组装生产总表
        List<Manufacture> list = this.list();
        if(list.size()==0){
            manufacture.setManufactureId(IdUtil.manufactureId(null));
        }else{
            manufacture.setManufactureId(IdUtil.manufactureId(list.get(list.size()-1)));
        }
        manufacture.setCheckTag("S001-0");
        manufacture.setManufactureProcedureTag("S002-0");
        boolean save = this.save(manufacture);

        //添加生产工序物料
        List<DesignProcedureDetails> details = designProcedureDetailsService.listBypid(manufacture.getProductId());

        int bool=0;
        List<ProcedureModule> modules=new ArrayList<ProcedureModule>();
        List<Procedure> procedureArrayList = new ArrayList<Procedure>();
        for (DesignProcedureDetails d: details){
            Procedure procedure = new Procedure();
            procedure.setParentId(manufacture.getId());
            procedure.setDetailsNumber(d.getDetailsNumber());
            procedure.setProcedureId(d.getProcedureId());
            procedure.setProcedureName(d.getProcedureName());
            procedure.setLabourHourAmount(d.getLabourHourAmount());
            procedure.setRealLabourHourAmount(0);
            procedure.setSubtotal(d.getSubtotal());
            procedure.setRealSubtotal(0);
            procedure.setModuleSubtotal(d.getModuleSubtotal());
            procedure.setRealModuleSubtotal(0);
            procedure.setCostPrice(d.getCostPrice());
            procedure.setDemandAmount (manufacture.getAmount());
            procedure.setRealAmount(0);
            procedure.setProcedureFinishTag("G004-0");
            procedure.setProcedureTransferTag("G005-0");

            boolean save1 = procedureService.save(procedure);
            if(save1){
                bool++;
            }else{
                bool--;
            }
            List<DesignProcedureModule> designProcedureModules = designProcedureModuleService.queryByid(d.getId());

            for (DesignProcedureModule dm :designProcedureModules){
                ProcedureModule procedureModule= new ProcedureModule();
                procedureModule.setParentId(procedure.getId());
                procedureModule.setDetailsNumber(dm.getDetailsNumber());
                procedureModule.setProductId(manufacture.getProductId());
                procedureModule.setProductName(manufacture.getProductName());
                procedureModule.setCostPrice(dm.getCostPrice());
                procedureModule.setAmount(dm.getAmount());
                procedureModule.setRealAmount(dm.getAmount()*manufacture.getAmount());
                procedureModule.setRenewAmount(0);
                procedureModule.setSubtotal(dm.getSubtotal());
                procedureModule.setRealSubtotal(0);
                modules.add(procedureModule);
            }
        }
        boolean saveBatch = procedureModuleService.saveBatch(modules);

        if(save&&bool==details.size()&&saveBatch)
            return true;
        return false;
    }
}
