package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.mapper.ModuleMapper;
import com.guigu.pojo.Dfile;
import com.guigu.pojo.Module;
import com.guigu.service.ConfigFileKindService;
import com.guigu.service.DfileService;
import com.guigu.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModuleServiceImpl extends ServiceImpl<ModuleMapper, Module> implements ModuleService {
    @Autowired
    DfileService dfileService;

    @Autowired
    ConfigFileKindService configFileKindService;

    @Override
    public PageInfo<Module> queryAllmodule(Integer pageno, Integer pagesize, Module module) {

        QueryWrapper<Dfile> dfwrapper = new QueryWrapper<Dfile>();
        dfwrapper.eq("DESIGN_PROCEDURE_TAG","G001-0");
        dfwrapper.eq("TYPE","Y001-1");
        List<Dfile> list2 = dfileService.list(dfwrapper);
        System.out.println(list2);
        if (list2.size()>0) {
            QueryWrapper<Module> wrapper = new QueryWrapper<Module>();
            wrapper.eq("CHECK_TAG", "S001-1");
            if (module.getFirstKindId() != null) {
                wrapper.eq("FIRST_KIND_ID", module.getFirstKindId());
            }
            if (module.getSecondKindId() != null) {
                wrapper.eq("SECOND_KIND_ID", module.getSecondKindId());
            }
            if (module.getThirdKindId() != null) {
                wrapper.eq("THIRD_KIND_ID", module.getThirdKindId());
            }
            if (module.getDate1() != null) {
                wrapper.ge("REGISTER_TIME", module.getDate1());
            }
            if (module.getDate2() != null) {
                wrapper.le("REGISTER_TIME", module.getDate2());
            }
            PageHelper.startPage(pageno, pagesize);
            List<Module> list = this.list(wrapper);
            for (Module m : list) {
                dfwrapper.eq("PRODUCT_ID", m.getProductId());
                Dfile one = dfileService.getOne(dfwrapper);
                m.setDfile(one);
            }
            return new PageInfo<Module>(list);
        }
        return new PageInfo<Module>();
    }
}
