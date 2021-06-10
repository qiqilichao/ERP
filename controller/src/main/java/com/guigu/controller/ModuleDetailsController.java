package com.guigu.controller;

import com.guigu.pojo.ModuleDetails;
import com.guigu.service.ModuleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shijianghua
 * @date 2021/6/10.
 */
@RestController
@CrossOrigin
public class ModuleDetailsController {
    @Autowired
    ModuleDetailsService moduleDetailsService;

    @RequestMapping("moduleDetailadd.action")
    public String modulesave(ModuleDetails moduleDetails){
        System.out.println(moduleDetails);
        return " ";
    }
}
