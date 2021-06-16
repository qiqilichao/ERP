package com.guigu.controller;

import com.guigu.pojo.ConfigFileKind;
import com.guigu.service.ConfigFileKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("conf")
@CrossOrigin
public class ConfigFileKindController {
    @Autowired
    ConfigFileKindService configFileKindService;

    @RequestMapping("queryAll")
    public List<ConfigFileKind> queryAll(){
        return configFileKindService.querAll();
    }
}
