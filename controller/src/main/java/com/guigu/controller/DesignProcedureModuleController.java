package com.guigu.controller;


import com.guigu.pojo.DesignProcedure;
import com.guigu.pojo.DesignProcedureModule;
import com.guigu.service.DesignProcedureModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dpm")
@CrossOrigin
public class DesignProcedureModuleController {

    @Autowired
    private DesignProcedureModuleService designProcedureModuleService;

    @RequestMapping("queryByidList")
    @ResponseBody
    public List<DesignProcedureModule> queryByidList(int id){
        return designProcedureModuleService.queryByid(id);
    }



    @RequestMapping("queryByidandname")
    @ResponseBody
    public List<DesignProcedureModule> queryByidandname(int id,String procedureName){

        return designProcedureModuleService.queryByidandname(id,procedureName);
    }
}
