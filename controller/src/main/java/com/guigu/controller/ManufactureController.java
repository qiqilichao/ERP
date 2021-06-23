package com.guigu.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.pojo.DesignProcedureDetails;
import com.guigu.pojo.Manufacture;
import com.guigu.service.DesignProcedureDetailsService;
import com.guigu.service.ManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manufacture")
@CrossOrigin
public class ManufactureController {

    @Autowired
    private ManufactureService manufactureService;

    @Autowired
    private DesignProcedureDetailsService designProcedureDetailsService;


    @RequestMapping("savemanufacture")
    @ResponseBody
    public boolean savemanufacture(Manufacture manufacture){
        //return false;
        return manufactureService.addManufacture(manufacture);
    }

    //分页查询所有派工审核
    @RequestMapping("pageManufacture")
    @ResponseBody
    public IPage<Manufacture> pageManufacture(
           @RequestParam(defaultValue = "1") Integer pageno,
           @RequestParam(defaultValue = "10") Integer pagesize,
            Manufacture manufacture){
        return manufactureService.manufacturelist(pageno,pagesize,manufacture);
    }

    //查询3产品生产工序明细
    @RequestMapping("details")
    @ResponseBody
    public List<DesignProcedureDetails> details(String pid){

        return designProcedureDetailsService.queryWrapper(pid);
    }

    //改变生产总表审核状态
    @RequestMapping("SubmitforReview")
    @ResponseBody
    public  boolean SubmitforReview(Manufacture manufacture){

        return manufactureService.SubmitforReview(manufacture);
    }

    //分页查询生产派工单查询
    @RequestMapping("manufactureIPage")
    @ResponseBody
    public IPage<Manufacture> manufactureIPage( @RequestParam(defaultValue = "1") Integer pageno,
                                                @RequestParam(defaultValue = "10") Integer pagesize,
                                                Manufacture manufacture){
        return manufactureService.queryallManufacture(pageno,pagesize,manufacture);
    }
}
