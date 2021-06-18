package com.guigu.controller;

import com.guigu.pojo.DesignProcedureDetails;
import com.guigu.service.DesignProcedureDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dpd")
@CrossOrigin
public class DesignProcedureDetailsController {

    @Autowired
    private DesignProcedureDetailsService designProcedureDetailsService;


    //根据产品id查询所有工序
    @RequestMapping("queryBypid")
    @ResponseBody
    public List<DesignProcedureDetails> queryBypid(String productId){
        return designProcedureDetailsService.listBypid(productId);
    }


}
