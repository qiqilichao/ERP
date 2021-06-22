package com.guigu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.pojo.Dfile;
import com.guigu.pojo.Module;
import com.guigu.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author shijianghua
 * @date 2021/6/10.
 */
@RestController
@RequestMapping("/module")
@CrossOrigin
public class ModuleController {
    @Autowired
    ModuleService moduleService;

    @RequestMapping("/moduleadd.action")
    public boolean modulesave(@RequestBody List<Module> module){
        System.out.println(module);
         boolean gobuy = moduleService.gobuy(module);
        return gobuy;
    }
    @RequestMapping("/moduleshenghe.action")
    public IPage<Module> queryallcartype(@RequestParam(value = "pageno", defaultValue = "1") int pageno,
                                        @RequestParam(value = "pagesize", defaultValue = "10") int pagesize,
                                        Module module) {
        System.out.println(1223);
        QueryWrapper<Module> queryWrapper = new QueryWrapper<Module>();

        queryWrapper.eq("CHECK_TAG", "S001-0");
        queryWrapper.eq("CHANGE_TAG", "B002-0");

        return moduleService.page(new Page<Module>(pageno, pagesize), queryWrapper);
    }
    //审核查询
    @RequestMapping("/moduleShenheByid.action")
    public Module moduleShenheByid(int id){
        Module byId = moduleService.getById(id);
        return byId;
    }

    //审核通过
    @RequestMapping("/moduleupdate.action")
    public boolean moduleupdate(Module module){
        System.out.println(module);
        module.setCheckTag("S001-1");
        module.setRegisterTime(new Date());
        boolean b = moduleService.updateById(module);

        return b;
    }

    //审核不通过
    @RequestMapping("/moduleupdateno.action")
    public boolean moduleupdateno(Module module){
        System.out.println( module);
        module.setCheckTag("S001-2");
        module.setRegisterTime(new Date());
        boolean b = moduleService.updateById(module);

        return b;
    }
    //查询所以呀审核通过的数据
    @RequestMapping("/moduleSelect.action")
    public IPage<Module> moduleSelect(@RequestParam(value = "pageno", defaultValue = "1") int pageno,
                                      @RequestParam(value = "pagesize", defaultValue = "10") int pagesize,
                                      Module module) {
        System.out.println(1223);




        return moduleService.page(new Page<Module>(pageno, pagesize), null);
    }
    //设计单变更
    @RequestMapping("/xinmoduleupdate.action")
    public boolean xinmoduleupdate(Module module){
        module.setChangeTime(new Date());
        module.setCheckTag("S001-0");
        module.setChangeTag("B002-0");
        boolean b = moduleService.updateById(module);
        return b;
    }
}
