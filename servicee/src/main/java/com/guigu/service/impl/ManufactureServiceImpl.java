package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.ManufactureMapper;
import com.guigu.pojo.*;
import com.guigu.service.*;
import com.guigu.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ManufactureServiceImpl extends ServiceImpl<ManufactureMapper,Manufacture>
        implements ManufactureService {

    @Autowired
    private DesignProcedureDetailsService designProcedureDetailsService;

    @Autowired
    private DesignProcedureModuleService designProcedureModuleService;

    @Autowired
    private DesignProcedureService designProcedureService;

    @Autowired
    private ApplyService applyService;

    @Autowired
    private ProcedureService procedureService;


    @Autowired
    private ProcedureModuleService procedureModuleService;


    @Autowired
    private ManufactureMapper manufactureMapper;


    @Autowired
    private  PayService payService;

    @Autowired
    private  PayDetailsService payDetailsService;

    @Override
    @Transient
    //插入生产总表的
    public boolean addManufacture(Manufacture manufacture) {

        //提交生产总表前修改生产计划派工标志

        String[] split = manufacture.getApplyIdGroup().split("-");
        List<Apply> applies =new ArrayList<>();
       for(int i=0;i<split.length;i++){
           Apply apply = applyService.queryByproductIdList(split[i]);
                 apply.setManufactureTag("P001-1");
                 applies.add(apply);
       }
       boolean updateApply =  applyService.updateBatchById(applies);



        //组装生产总表
        List<Manufacture> list = this.list();
        if(list.size()==0){
            manufacture.setManufactureId(IdUtil.manufactureId(null));
        }else{
            manufacture.setManufactureId(IdUtil.manufactureId(list.get(list.size()-1)));
        }

        QueryWrapper<DesignProcedure> wrapper = new QueryWrapper<>();
        wrapper.eq("PRODUCT_ID",manufacture.getProductId());
        DesignProcedure one = designProcedureService.getOne(wrapper);
        manufacture.setModuleCostPriceSum(one.getCostPriceSum());
        manufacture.setLabourCostPriceSum(one.getModuleCostPriceSum());
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

            procedure.setProcedureId  (d.getProcedureId());

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
                procedureModule.setProductId(dm.getProductId());
                procedureModule.setProductName(dm.getProductName());
                procedureModule.setCostPrice(dm.getCostPrice());
                procedureModule.setAmount(dm.getAmount()*manufacture.getAmount());
                procedureModule.setRealAmount(0);
                procedureModule.setRenewAmount(0);
                procedureModule.setSubtotal(dm.getSubtotal());
                procedureModule.setRealSubtotal(0);
                modules.add(procedureModule);
            }
        }
        boolean saveBatch = procedureModuleService.saveBatch(modules);
        if(save&&bool==details.size()&&saveBatch&&updateApply)
            return true;
        return false;
    }

    @Override
    //查询所有的能审核派工单的
    public IPage<Manufacture> manufacturelist(int pageno ,int pagesize,Manufacture manufacture) {
        QueryWrapper<Manufacture> wrapper=new QueryWrapper();
        wrapper.eq("CHECK_TAG","S001-0");
        wrapper.eq("MANUFACTURE_PROCEDURE_TAG","S002-0");
        return this.page(new Page<Manufacture>(pageno,pagesize),wrapper);
    }

    @Override
    @Transactional
    //审核派工单
    public boolean SubmitforReview(Manufacture manufacture) {

        if(!"S001-1".equals(manufacture.getCheckTag())){
             return false;
        }

        int i = manufactureMapper.updateTeg(manufacture);
        boolean j=false;
        boolean m=false;
        try {

        QueryWrapper<Procedure> wrapper = new QueryWrapper<>();
        wrapper.eq("PARENT_ID",manufacture.getId());
        List<Procedure> procedures = procedureService.list(wrapper);


        for (Procedure p:procedures) {
            List<Pay> list = payService.list();
            Pay pay = new Pay();
            if (list.size() == 0) {
                Date dt=new Date();
                SimpleDateFormat matter1=new SimpleDateFormat("yyyyMMdd");
                String date =  matter1.format(dt);
                pay.setPayId("401"+date+"0001");
            } else {
                pay.setPayId(IdUtil.PayId(list.get(list.size() - 1)));
            }
            pay.setReason("C002-1");
            pay.setChecker(manufacture.getChecker());
            pay.setReasonexact(manufacture.getManufactureId()+"-"+p.getProcedureName());
            pay.setAmountSum(p.getDemandAmount());
            pay.setCostPriceSum(p.getModuleSubtotal());
            pay.setRegister(manufacture.getChecker());
            pay.setRegisterTime(new Date());
            pay.setPaidAmountSum(0f);
            pay.setCheckTag("S001-1");
            pay.setPayTag("K002-1");

            j = this.payService.save(pay);


            QueryWrapper<ProcedureModule> wrapper1 = new QueryWrapper<>();
            wrapper1.eq("PARENT_ID", p.getId());
            //System.out.println("---------------------"+p.getId());
            List<ProcedureModule> list1 = this.procedureModuleService.list(wrapper1);
            List<PayDetails> payDetailsList=new ArrayList<>();

            for (ProcedureModule pm : list1) {
                PayDetails payDetails = new PayDetails();
                payDetails.setParentId(pay.getId());
                payDetails.setProductId(pm.getProductId());
                payDetails.setProductName(pm.getProductName());
                payDetails.setProductDescribe(manufacture.getProductDescribe());
                payDetails.setAmount(pm.getAmount());
                payDetails.setCostPrice(pm.getCostPrice());
                payDetails.setSubtotal(pm.getSubtotal());
                payDetails.setPaidAmount(0);
                payDetails.setPayTag("K002-1");
                //payDetailsList.add(payDetails);
                m = this.payDetailsService.save(payDetails);

            }
           // m = this.payDetailsService.saveBatch(payDetailsList);
        }
        }catch (Exception e){
           return  false;
        }
        if(i>0&&j&&m)
            return true;
        return false;
    }

    //生产派工单审核查询
    @Override
    public IPage<Manufacture>  queryallManufacture(int pageno, int pagesize, Manufacture manufacture) {

        QueryWrapper<Manufacture> wrapper=new QueryWrapper();
        if(!"-1".equals(manufacture.getCheckTag())){
            wrapper.eq("CHECK_TAG",manufacture.getCheckTag());
        }
        if(!StringUtils.isEmpty(manufacture.getManufactureId())){
            wrapper.eq("MANUFACTURE_ID",manufacture.getManufactureId());
        }
        if(!StringUtils.isEmpty(manufacture.getProductName())){
           wrapper.like("PRODUCT_NAME",manufacture.getProductName());
        }
        return this.page(new Page<Manufacture>(pageno,pagesize),wrapper);
    }


}
