package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
    private ProceduringService proceduringService;

    @Autowired
    private  PayService payService;

    @Autowired
    private  PayDetailsService payDetailsService;

    @Autowired
    private ProcedureModulingService procedureModulingService;

    @Override
    @Transient
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
        manufacture.setModuleCostPriceSum(one.getModuleCostPriceSum()*manufacture.getAmount());
        manufacture.setLabourCostPriceSum(one.getCostPriceSum()*manufacture.getAmount());
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

    @Override
    public List<Procedure> queryManuById(Integer id) {
        QueryWrapper<Procedure> wrapper = new QueryWrapper<Procedure>();
        wrapper.eq("PARENT_ID",id);
        return procedureService.list(wrapper);
    }

    @Override
    public List<ProcedureModule> querypromoduleById(Integer id) {
        QueryWrapper<ProcedureModule> wrapper = new QueryWrapper<ProcedureModule>();
        wrapper.eq("PARENT_ID",id);
        return procedureModuleService.list(wrapper);
    }

    @Transactional
    @Override
    public boolean dengji(List<ProcedureModule> procedureModules) {
        ProcedureModule procedureModule = procedureModules.get(0);

        //查询生产工序表
        Procedure one1 = procedureService.getById(procedureModule.getParentId());

        //修改生产工序表的状态
        one1.setProcedureFinishTag("G004-1");
        boolean b = procedureService.updateById(one1);

        //查询生产工序过程是否有数据
        QueryWrapper<Proceduring> pringwrapper = new QueryWrapper<Proceduring>();
        pringwrapper.eq("PROCEDURE_ID",one1.getProcedureId());
        pringwrapper.eq("PARENT_ID",one1.getParentId());
        List<Proceduring> one = proceduringService.list(pringwrapper);

        //添加生产工序过程记录
        Procedure pro = procedureModules.get(0).getProceduring();
        Proceduring proceduring = new Proceduring();
        proceduring.setParentId(one1.getParentId());
        proceduring.setDetailsNumber(pro.getDetailsNumber());
        proceduring.setProcedureId(pro.getProcedureId());
        proceduring.setProcedureName(pro.getProcedureName());
        proceduring.setLabourHourAmount1(pro.getLabourHourAmount1());
        proceduring.setCostPrice(pro.getCostPrice());
        proceduring.setSubtotal(pro.getLabourHourAmount1()*pro.getCostPrice());
        //判断是否有数，没有则给1
        if(one.size()==0){
//            Float a=1f;
//            proceduring.setSubtotal(pro.getLabourHourAmount1()*pro.getCostPrice());
            proceduring.setRegCount(1f);
        }else {
//            proceduring.setSubtotal(one.get(one.size()-1).getSubtotal()+pro.getLabourHourAmount1()*pro.getCostPrice());
            proceduring.setRegCount(one.get(one.size()-1).getRegCount() + 1);
        }
        proceduring.setProcedureResponsiblePerson(pro.getProcedureResponsiblePerson());
        proceduring.setRegister(pro.getRegister());
        proceduring.setRegisterTime(new Date());

        //插入工序过程数据
        boolean save = proceduringService.save(proceduring);

        //添加生产工序物料过程记录
        List<ProcedureModuling> list = new ArrayList<>();
        for (ProcedureModule p : procedureModules){
            ProcedureModuling procedureModuling = new ProcedureModuling();
            procedureModuling.setParentId(proceduring.getId());
            procedureModuling.setDetailsNumber(p.getDetailsNumber());
            procedureModuling.setProductId(p.getProductId());
            procedureModuling.setProductName(p.getProductName());
            procedureModuling.setCostPrice(p.getCostPrice());
            procedureModuling.setAmount(p.getShuliang());
            procedureModuling.setSubtotal(p.getCostPrice()*p.getShuliang());
            list.add(procedureModuling);
        }
        //批量添加
        boolean b1 = procedureModulingService.saveBatch(list);

        boolean b2 = manufactureMapper.updmaprotag(one1.getParentId());
        if (b && b1 && b2){
            return true;
        }

        return false;
    }

    @Override
    public List<ProcedureModule> seltoexaproding(Integer id, String proid) {
        QueryWrapper<Procedure> prowrapper = new QueryWrapper<Procedure>();
        prowrapper.eq("PARENT_ID",id);
        prowrapper.eq("PROCEDURE_ID",proid);
        Procedure prolist = procedureService.getOne(prowrapper);
        //根据id查询出生产工序单的数据
        QueryWrapper<Proceduring> prdingwrapper = new QueryWrapper<Proceduring>();
        prdingwrapper.eq("PARENT_ID",id);
        prdingwrapper.eq("PROCEDURE_ID",proid);
        List<Proceduring> list = proceduringService.list(prdingwrapper);
        Proceduring proceduring = list.get(list.size() - 1);
        //查询出生产工序物料过程的数据
        QueryWrapper<ProcedureModuling> prdmodouingwrapper = new QueryWrapper<ProcedureModuling>();
        prdmodouingwrapper.eq("PARENT_ID",proceduring.getId());
        List<ProcedureModuling> list1 = procedureModulingService.list(prdmodouingwrapper);
//
        int index=0;
        //查询生产工序物料的数据
        List<ProcedureModule> procedureModules = this.querypromoduleById(prolist.getId());
        for (ProcedureModule pro:procedureModules){
            pro.setShuliang(list1.get(index).getAmount());
            index++;
        }
        procedureModules.get(0).setProceduring2(proceduring);
        return procedureModules;
    }

    @Transactional
    @Override
    public boolean toexmateok(List<ProcedureModule> procedureModules) {
        ProcedureModule procedureModule = procedureModules.get(0);
        Procedure procedure = procedureModule.getProceduring();
        //查询生产工序表
        Procedure one1 = procedureService.getById(procedureModule.getParentId());

        //查询生产工序过程表
        QueryWrapper<Proceduring> pringwrapper = new QueryWrapper<Proceduring>();
        pringwrapper.eq("PROCEDURE_ID",one1.getProcedureId());
        pringwrapper.eq("PARENT_ID",one1.getParentId());
        List<Proceduring> one = proceduringService.list(pringwrapper);
        Proceduring proceduring = one.get(one.size() - 1);
        proceduring.setChecker(procedure.getRegister());
        proceduring.setCheckTime(new Date());
        boolean b2 = proceduringService.updateById(proceduring);
        //工序总工时
        float realabamount=0;
        //工时总成本
        float reasubol=0;
        //物料成本
        float modulesubol=0;
        for (Proceduring p : one){
            realabamount+=p.getLabourHourAmount1();
            reasubol+=p.getSubtotal();
            //查询出工序物料过程数据
            QueryWrapper<ProcedureModuling> promoduing = new QueryWrapper<ProcedureModuling>();
            promoduing.eq("PARENT_ID",p.getId());
            List<ProcedureModuling> modulelist = procedureModulingService.list(promoduing);
            for (ProcedureModuling modu:modulelist){
                modulesubol+=modu.getSubtotal();
            }
        }
        one1.setRealLabourHourAmount(realabamount);
        one1.setRealSubtotal(reasubol);
        one1.setRealModuleSubtotal(modulesubol);

        //如果他的PROCEDURE_FINISH_TAG为G004-1则修改G004-3
        if(one1.getProcedureFinishTag()=="G004-1"){
            //修改生产工序表的状态(完成审核)
            one1.setProcedureFinishTag("G004-3");
        }
        //如果他的PROCEDURE_FINISH_TAG为G004-2则修改G004-0
        if (one1.getProcedureFinishTag()=="G004-2"){
            //修改生产工序表的状态(未开始)
            one1.setProcedureFinishTag("G004-0");
        }
        //修改生产工序表
        boolean b = procedureService.updateById(one1);

        QueryWrapper<Manufacture> manuwrapper = new QueryWrapper<Manufacture>();
        Manufacture mabufacture = this.getById(one1.getParentId());

        //查询生产工序过程表
        QueryWrapper<Procedure> proapper = new QueryWrapper<Procedure>();
        proapper.eq("PARENT_ID",mabufacture.getId());
        List<Procedure> procedurelist = procedureService.list(proapper);
        //工序的实际工时总成本
        float manusubol=0;
        //工序的实际物料总成本
        float manumodu=0;
        //是否完成
//        int tag=0;
        for (Procedure pro :procedurelist){
            manusubol+=pro.getRealSubtotal();
            manumodu+=pro.getRealModuleSubtotal();
//            if (!"G004-3".equals(pro.getProcedureFinishTag())){
//                tag++;
//            }
        }
        mabufacture.setRealLabourCostPriceSum(manusubol);
        mabufacture.setRealModuleCostPriceSum(manumodu);

        boolean b1 = this.updateById(mabufacture);
        if (b2 && b && b1){
            return true;
        }
/*        //tag 0 全部审核通过
//        if (tag==0){
//            mabufacture.setManufactureProcedureTag("S002-2");
//        }
        //tag >0 有工序未完成
//        else{
//
//        }
*/

        return false;
    }

}
