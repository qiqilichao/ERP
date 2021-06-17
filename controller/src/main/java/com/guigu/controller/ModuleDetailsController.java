package com.guigu.controller;

import com.guigu.pojo.Module;
import com.guigu.pojo.ModuleDetails;
import com.guigu.service.ModuleDetailsService;
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

    @RequestMapping("/moduleDetailadd.action")
    public String modulesave(){
        return " ";
    }
}
