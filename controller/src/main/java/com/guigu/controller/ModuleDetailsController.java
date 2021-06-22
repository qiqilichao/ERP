package com.guigu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.pojo.Module;
import com.guigu.pojo.ModuleDetails;
import com.guigu.service.ModuleDetailsService;
import com.guigu.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shijianghua
 * @date 2021/6/10.
 */
@RestController
@RequestMapping("/moduleDetail")
@CrossOrigin
public class ModuleDetailsController {
    @Autowired
    ModuleDetailsService moduleDetailsService;
    @Autowired
    ModuleService moduleService;
    //查询单个商品的所以物料
    @RequestMapping("/moduleDetailByid.action")
    public List<ModuleDetails> modulesave(int id){
        System.out.println(id);
        QueryWrapper<ModuleDetails> queryWrapper = new QueryWrapper<ModuleDetails>();

        queryWrapper.eq("PARENT_ID",id);
        List<ModuleDetails> list = moduleDetailsService.list(queryWrapper);
        System.out.println(list);
        return list;
    }
    //删除商品的物料
    @RequestMapping("/moduleDetailDelect.action")
    public boolean moduleDetailDelect(int id){
        boolean b = moduleDetailsService.removeById(id);
        return b;
    }
    //修改商品的物料
    @RequestMapping("/moduleDetailsadd.action")
    public boolean  moduleDetailsadd(@RequestBody List<ModuleDetails> moduleDetails){
        boolean gobuy = moduleDetailsService.gobuy(moduleDetails);
        return gobuy;
    }
}
