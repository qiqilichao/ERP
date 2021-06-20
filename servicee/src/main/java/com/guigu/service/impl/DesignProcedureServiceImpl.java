package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.DesignProcedureDetailsMapper;
import com.guigu.mapper.DesignProcedureMapper;
import com.guigu.mapper.DfileMapper;
import com.guigu.pojo.*;
import com.guigu.service.*;
import com.guigu.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DesignProcedureServiceImpl extends ServiceImpl<DesignProcedureMapper, DesignProcedure> implements DesignProcedureService {
    @Autowired
    DesignProcedureDetailsService designProcedureDetailsService;

    @Autowired
    DfileMapper dfileMapper;

    @Autowired
    DfileService dfileService;

    @Autowired
    ModuleService moduleService;

    @Autowired
    ModuleDetailsService moduleDetailsService;

    @Autowired
    DesignProcedureModuleService designProcedureModuleService;

    @Autowired
    DesignProcedureDetailsMapper designProcedureDetailsMapper;

    @Transactional
    @Override
    public boolean insdesignProceduure(List<ProcedureList> procedureLists) {
        DesignProcedure updstu = procedureLists.get(0).getUpdstu();
        List<DesignProcedure> list = this.list();
        if (list.size() > 0) {
            updstu.setDesignId(new IdUtil().DesignProcedureId(list.get(list.size() - 1)));
        } else {
            Date dt = new Date();
            SimpleDateFormat matter1 = new SimpleDateFormat("yyyyMMdd");
            String date = matter1.format(dt);
            updstu.setDesignId("201" + date + "0001");
        }
        updstu.setCheckTag("S001-0");
        updstu.setChangeTag("B002-0");
        updstu.setDesignModuleTag("G002-0");
        boolean disprosave = this.save(updstu);
        List<DesignProcedureDetails> dpd = new ArrayList<DesignProcedureDetails>();
        //修改状态
        dfileMapper.upddfilegx(updstu.getProductId());

        int index = 1;
        for (ProcedureList p : procedureLists) {
            DesignProcedureDetails details = new DesignProcedureDetails();
            details.setParentId(updstu.getId());
            details.setDetailsNumber(index);
            index++;
            details.setProcedureId(p.getTypeId());
            details.setProcedureName(p.getTypeName());
            details.setLabourHourAmount(p.getLabourHourAmount());
            details.setAmountUnit(p.getAmountUnit());
            details.setCostPrice(p.getCostPrice());
            details.setSubtotal(p.getSubtotal());
            details.setRegister(updstu.getRegister1());
            details.setRegisterTime(updstu.getRegisterTime1());
            details.setDesignModuleTag("D002-0");
            details.setDesignModuleChangeTag("D003-0");
            dpd.add(details);
        }
        boolean b = designProcedureDetailsService.saveBatch(dpd);
        if (disprosave && b) {
            return true;
        }
        return false;
    }

    @Override
    public List<DesignProcedure> seltoiexmal() {
        QueryWrapper<DesignProcedure> wrapper = new QueryWrapper<DesignProcedure>();
        wrapper.eq("CHECK_TAG", "S001-0");
        List<DesignProcedure> list = this.list(wrapper);
        return list;
    }

    @Override
    public boolean toexamine(DesignProcedure designProcedure, Integer radios) {
        //通过
        if (radios == 2) {
            //设置他的审核状态，修改为通过
            designProcedure.setCheckTag("S001-1");
        }
        //不通过
        return this.updateById(designProcedure);
    }

    @Override
    public IPage<DesignProcedure> listAll(Integer pageno, Integer pagesize, DesignProcedure designProcedure) {
        QueryWrapper<DesignProcedure> wrapper = new QueryWrapper<DesignProcedure>();
        if (!StringUtils.isEmpty(designProcedure)) {
            if (!StringUtils.isEmpty(designProcedure.getFirstKindId())) {
                wrapper.eq("FIRST_KIND_ID", designProcedure.getFirstKindId());
            }
            if (!StringUtils.isEmpty(designProcedure.getSecondKindId())) {
                wrapper.eq("SECOND_KIND_ID", designProcedure.getSecondKindId());
            }
            if (!StringUtils.isEmpty(designProcedure.getThirdKindId())) {
                wrapper.eq("THIRD_KIND_ID", designProcedure.getThirdKindId());
            }
            if (!StringUtils.isEmpty(designProcedure.getDate1())) {
                wrapper.ge("REGISTER_TIME", designProcedure.getDate1());
            }
            if (!StringUtils.isEmpty(designProcedure.getDate2())) {
                wrapper.le("REGISTER_TIME", designProcedure.getDate2());
            }
            if (!StringUtils.isEmpty(designProcedure.getChecktags())) {
                wrapper.eq("CHECK_TAG", designProcedure.getChecktags());
            }
        }
        IPage<DesignProcedure> page = this.page(new Page<DesignProcedure>(pageno, pagesize), wrapper);


        for (DesignProcedure d : page.getRecords()) {
            QueryWrapper<Dfile> dfw = new QueryWrapper<Dfile>();
            System.out.println(d.getProductId());
            dfw.eq("PRODUCT_ID", d.getProductId());
            d.setDfile(dfileService.getOne(dfw));
        }
        return page;
    }

    @Override
    public IPage<DesignProcedure> seloexmaldeprook(Integer pageno, Integer pagesize, DesignProcedure designProcedure) {
        QueryWrapper<DesignProcedure> wrapper = new QueryWrapper<DesignProcedure>();
        wrapper.eq("CHECK_TAG", "S001-1");
        if (!StringUtils.isEmpty(designProcedure)) {
            if (!StringUtils.isEmpty(designProcedure.getFirstKindId())) {
                wrapper.eq("FIRST_KIND_ID", designProcedure.getFirstKindId());
            }
            if (!StringUtils.isEmpty(designProcedure.getSecondKindId())) {
                wrapper.eq("SECOND_KIND_ID", designProcedure.getSecondKindId());
            }
            if (!StringUtils.isEmpty(designProcedure.getThirdKindId())) {
                wrapper.eq("THIRD_KIND_ID", designProcedure.getThirdKindId());
            }
            if (!StringUtils.isEmpty(designProcedure.getDate1())) {
                wrapper.ge("REGISTER_TIME", designProcedure.getDate1());
            }
            if (!StringUtils.isEmpty(designProcedure.getDate2())) {
                wrapper.le("REGISTER_TIME", designProcedure.getDate2());
            }
//            if (!StringUtils.isEmpty(designProcedure.getProductName())){
//                wrapper.eq("PRODUCT_NAME",designProcedure.getProductName());
//            }
        }
        return this.page(new Page<DesignProcedure>(pageno, pagesize), wrapper);
    }

    @Transactional
    @Override
    public boolean insnewdesignProceduur(List<ProcedureList> procedureLists) {
        //获取数据并进行修改设计单的数据
        DesignProcedure updstu = procedureLists.get(0).getUpdstu();
        updstu.setCheckTag("S001-0");
        updstu.setChangeTag("B002-1");
        boolean b = this.updateById(updstu);
        //修改成功
        List<DesignProcedureDetails> dpd = new ArrayList<DesignProcedureDetails>();
        if (!StringUtils.isEmpty(procedureLists.get(0).getId())) {

            //查询出这个设计单的最后一个工序编号，以方便增加
            QueryWrapper<DesignProcedureDetails> wrapper = new QueryWrapper<DesignProcedureDetails>();
            wrapper.eq("PARENT_ID", updstu.getId());
            List<DesignProcedureDetails> list = designProcedureDetailsService.list(wrapper);
            DesignProcedureDetails de = list.get(list.size() - 1);
            int index = de.getDetailsNumber();
            for (ProcedureList p : procedureLists) {
                DesignProcedureDetails details = new DesignProcedureDetails();
                details.setParentId(updstu.getId());
                details.setDetailsNumber(index + 1);
                index++;
                details.setProcedureId(p.getTypeId());
                details.setProcedureName(p.getTypeName());
                details.setLabourHourAmount(p.getLabourHourAmount());
                details.setAmountUnit(p.getAmountUnit());
                details.setCostPrice(p.getCostPrice());
                details.setSubtotal(p.getSubtotal());
                details.setRegister(updstu.getRegister1());
                details.setRegisterTime(updstu.getRegisterTime1());
                details.setDesignModuleTag("D002-0");
                details.setDesignModuleChangeTag("D003-0");
                dpd.add(details);
            }
        }
        return designProcedureDetailsService.saveBatch(dpd);
    }

    @Override
    public IPage<DesignProcedure> selrocesslist(Integer pageno, Integer pagesize) {
        QueryWrapper<DesignProcedure> wrapper = new QueryWrapper<DesignProcedure>();
        wrapper.eq("CHECK_TAG", "S001-1");
        wrapper.eq("DESIGN_MODULE_TAG", "G002-0");
        return this.page(new Page<DesignProcedure>(pageno, pagesize), wrapper);
    }

    @Override
    public List<ModuleDetails> selprocessById(String id) {
        //先查询出具体的组成设计单
        QueryWrapper<Module> wrapper = new QueryWrapper<Module>();
        wrapper.eq("PRODUCT_ID", id);
        Module one = moduleService.getOne(wrapper);

        //查询出组成商品所需的物料
        QueryWrapper<ModuleDetails> mdwrapper = new QueryWrapper<ModuleDetails>();
        mdwrapper.eq("PARENT_ID", one.getId());

        return moduleDetailsService.list(mdwrapper);
    }

    @Transactional
    @Override
    public boolean insprocess(List<ModuleDetails> moduleDetails) {
        boolean upddesprodetatag = designProcedureDetailsMapper.
                upddesprodetatag(moduleDetails.get(0).getParintid());

        List<DesignProcedureModule> list = new ArrayList<DesignProcedureModule>();

        int index=1;
        for (ModuleDetails m :moduleDetails){
            m.setResidualAmount((int) (m.getResidualAmount()-m.getAmount1()));
            DesignProcedureModule module = new DesignProcedureModule();
            module.setParentId(m.getParintid());
            module.setDetailsNumber(index);
            index++;
            module.setProductId(m.getProductId());
            module.setProductName(m.getProductName());
            module.setType(m.getType());
            module.setAmount(m.getAmount1());
            module.setProductDescribe(m.getProductDescribe());
            module.setAmountUnit(m.getAmountUnit());
            module.setCostPrice(m.getCostPrice());
            module.setSubtotal(m.getSubtotal1());
            list.add(module);
        }
        boolean b = designProcedureModuleService.saveBatch(list);
        boolean b1 = moduleDetailsService.updateBatchById(moduleDetails);
        if (upddesprodetatag && b && b1){
            return true;
        }
        return false;
    }

    @Override
    public boolean insnewprocess(List<ModuleDetails> moduleDetails) {
        QueryWrapper<DesignProcedureModule> wrapper = new QueryWrapper<DesignProcedureModule>();
        wrapper.eq("PARENT_ID",moduleDetails.get(0).getParintid());
        List<DesignProcedureModule> list1 = designProcedureModuleService.list(wrapper);

        int index=0;
        for (ModuleDetails m :moduleDetails){
//            list1.get(index).setAmount(Float.valueOf(m.getAmount1()));
            list1.get(index).setResidualAmount(m.getResidualAmount());
//            list1.get(index).setAmount1(m.getAmount());
            index++;
        }
        boolean b = designProcedureModuleService.updateBatchById(list1);
        boolean b1 = this.insprocess(moduleDetails);
        if ( b && b1){
            return true;
        }
        return false;
    }

    @Override
    public List<ModuleDetails> selnewprocessById(String id) {
        //查询出物料组成表中的数据
        DesignProcedureDetails byId = designProcedureDetailsService.getById(id);
        DesignProcedure byId1 = this.getById(byId.getParentId());
        List<ModuleDetails> moduleDetails = this.selprocessById(byId1.getProductId());

        //查询出工序物料的数据
        QueryWrapper<DesignProcedureModule> wrapper = new QueryWrapper<DesignProcedureModule>();
        wrapper.eq("PARENT_ID", id);
        List<DesignProcedureModule> list = designProcedureModuleService.list(wrapper);
        int index=0;
        for (DesignProcedureModule m :list){
            moduleDetails.get(index).setResidualAmount
                    ((int) (moduleDetails.get(index).getResidualAmount()+m.getAmount()));
            System.out.println(moduleDetails.get(index).getResidualAmount());
            moduleDetails.get(index).setAmount1(m.getAmount());
            index++;
        }
        //删除工序物料的数据
        designProcedureModuleService.remove(wrapper);

        //修改物料组成的数据
        moduleDetailsService.updateBatchById(moduleDetails);

        return moduleDetails;
    }
}
