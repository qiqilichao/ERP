package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    public boolean gobuy(List<Module> module) {
        List<Module> list = this.list();
        Dfile dfile = new Dfile();
        Module module3 = new Module();
         ModuleDetails moduleDetails = new ModuleDetails();
        int i=0;
        Float hh=0F;
        for (Module module2 : module) {
             Float subtotal = module2.getSubtotal();
             hh+=subtotal;
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


                module3.setCostPriceSum(hh);
                 boolean save = moduleService.save(module3);

            }

            moduleDetails.setParentId(module3.getId());
            moduleDetails.setDetailsNumber(module2.getId());
            moduleDetails.setProductId(module2.getProductId());
            moduleDetails.setAmount(module2.getAmount());
            moduleDetails.setCostPrice(module2.getCostPrice());
            moduleDetails.setSubtotal(module2.getSubtotal());
            moduleDetails.setResidualAmount(module2.getResidualAmount());
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
