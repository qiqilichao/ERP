package com.guigu.controller;

import com.guigu.pojo.DesignProcedureDetails;
import com.guigu.pojo.Manufacture;
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


    @RequestMapping("savemanufacture")
    @ResponseBody
    public boolean savemanufacture(Manufacture manufacture){

        //return false;
        return manufactureService.addManufacture(manufacture);
    }
}
