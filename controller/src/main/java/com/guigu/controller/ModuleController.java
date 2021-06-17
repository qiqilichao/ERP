package com.guigu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.pojo.Dfile;
import com.guigu.pojo.Module;
import com.guigu.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
