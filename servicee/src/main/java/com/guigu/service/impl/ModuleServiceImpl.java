package com.guigu.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.ModuleMapper;
import com.guigu.pojo.Dfile;
import com.guigu.pojo.Module;
import com.guigu.pojo.ModuleDetails;
import com.guigu.service.DfileService;
import com.guigu.service.ModuleDetailsService;
import com.guigu.service.ModuleService;
import com.guigu.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author shijianghua
 * @date 2021/6/10.
 */
@Service
public class ModuleServiceImpl extends ServiceImpl<ModuleMapper, Module> implements ModuleService {
    @Autowired
    ModuleService moduleService;
    @Autowired
    ModuleDetailsService moduleDetailsService;
    @Autowired
    DfileService dfileService;

    @Override
    public IPage<Dfile> queryAllmodule(Integer pageno, Integer pagesize, Dfile module) {
        QueryWrapper<Dfile> wrapper = new QueryWrapper<Dfile>();
        wrapper.eq("CHECK_TAG","S001-1");
        wrapper.eq("TYPE","Y001-1");
        wrapper.eq("DESIGN_PROCEDURE_TAG","G001-0");
        wrapper.eq("DESIGN_MODULE_TAG","W001-1");
        if (!StringUtils.isEmpty(module)){
            if (!StringUtils.isEmpty(module.getFirstKindId())) {
                wrapper.eq("FIRST_KIND_ID", module.getFirstKindId());
            }
            if (!StringUtils.isEmpty(module.getSecondKindId())) {
                wrapper.eq("SECOND_KIND_ID", module.getSecondKindId());
            }
            if (!StringUtils.isEmpty(module.getThirdKindId())) {
                wrapper.eq("THIRD_KIND_ID", module.getThirdKindId());
            }
            if (!StringUtils.isEmpty(module.getDate1())) {
                wrapper.ge("REGISTER_TIME", module.getDate1());
            }
            if (!StringUtils.isEmpty(module.getDate2())) {
                wrapper.le("REGISTER_TIME", module.getDate2());
            }
        }

        return dfileService.page(new Page<Dfile>(pageno,pagesize),wrapper);
    }

    @Override
    public boolean gobuy(List<Module> module) {
        List<Module> list = this.list();
        Dfile dfile = new Dfile();
        Module module3 = new Module();
         ModuleDetails moduleDetails = new ModuleDetails();
        int i=0;
        for (Module module2 : module) {
             Float subtotal = module2.getSubtotal();
            i+=1;
            if(i==1){

                if (list.size()>0) {
                    module3.setDesignId(new IdUtil().ModuleId(list.get(list.size() - 1)));
                }else{
                    Date dt=new Date();
                    SimpleDateFormat matter1=new SimpleDateFormat("yyyyMMdd");
                    String date =  matter1.format(dt);
                    module3.setDesignId("200"+date+"0001");
                }
                module3.setProductId(module2.getProductid());
                module3.setProductName(module2.getProductname());
                module3.setCheckTag("S001-0");
                module3.setRegisterTime(new Date());
                module3.setChangeTag("B002-0");
                module3.setFirstKindId(module2.getFirstKindId());
                module3.setFirstKindName(module2.getFirstKindName());
                module3.setSecondKindId(module2.getSecondKindId());
                module3.setSecondKindName(module2.getSecondKindName());
                module3.setThirdKindId(module2.getThirdKindId());
                module3.setThirdKindName(module2.getThirdKindName());
                module3.setDesigner(module2.getDesigner());
                module3.setModuleDescribe(module2.getModuleDescribe());
                module3.setRegister(module2.getRegister());
                module3.setChecker(module2.getChecker());
                module3.setCheckTime(module2.getCheckTime());

                module3.setCostPriceSum(module2.getHh());
                 boolean save = moduleService.save(module3);

            }

            moduleDetails.setParentId(module3.getId());
            moduleDetails.setDetailsNumber(module2.getId());
            moduleDetails.setProductId(module2.getProductId());
            moduleDetails.setAmount(module2.getAmount());
            moduleDetails.setProductName(module2.getProductName());
            moduleDetails.setType(module2.getType());
            moduleDetails.setProductDescribe(module2.getModuleDescribe());
            moduleDetails.setAmountUnit(module2.getPersonalUnit());
            moduleDetails.setCostPrice(module2.getCostPrice());
            moduleDetails.setSubtotal(module2.getSubtotal());
            moduleDetails.setResidualAmount(module2.getAmount());
            moduleDetailsService.save(moduleDetails);

            Integer did = module2.getDid();
            Dfile byId = dfileService.getById(did);
                String designModuleTag = byId.getDesignModuleTag();
                designModuleTag="W001-1";
                byId.setDesignModuleTag(designModuleTag);
              dfileService.updateById(byId);

        }


        return true;
    }
}
