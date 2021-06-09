package com.guigu.controller;

import com.guigu.pojo.Procedure;
import com.guigu.pojo.ProcedureList;
import com.guigu.service.ProcedureListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 这是产品生产工序设计
 */
@RestController
@RequestMapping("gx")
@CrossOrigin
public class ProcedureController {
    @Autowired
    ProcedureListService procedureListService;

    /**
     * 这是是查询工序
     * @return
     */
    @RequestMapping("queryprolist")
    public List<ProcedureList> queryprolist(){
        return procedureListService.list();
    }

}
