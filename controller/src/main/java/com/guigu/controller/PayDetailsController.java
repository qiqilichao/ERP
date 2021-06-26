package com.guigu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.pojo.PayDetails;
import com.guigu.pojo.Scell;
import com.guigu.service.PayDetailsService;
import com.guigu.service.ScellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.soap.Addressing;
import java.util.List;

@RestController
@RequestMapping("paydetails")
@CrossOrigin
public class PayDetailsController {

    @Autowired
    private PayDetailsService payDetailsService;

    @Autowired
    private ScellService scellService;


    //根据出库id查询出库明细
    @RequestMapping("queryBypidList")
    @ResponseBody
    public List<PayDetails> queryBypidList(int id){
        QueryWrapper<PayDetails> wrapper = new QueryWrapper<>();
        wrapper.eq("PARENT_ID",id);
        return payDetailsService.list(wrapper);
    }
    //根据产品编号在库存表查一条
    @RequestMapping("queryScaleByid")
    public Scell queryScaleByid(String id){
        QueryWrapper<Scell> wrapper = new QueryWrapper<>();
        wrapper.eq("PRODUCT_ID",id);
        Scell one = scellService.getOne(wrapper);
        one.setStr(one.getFirstKindId()+"-"+one.getSecondKindId()+"-"+one.getThirdKindId());
        return one;
    };

    //提交出库调度
    @RequestMapping("inventorySubmission")
    public boolean inventorySubmission(@RequestBody  List<Scell> scell){
        return payDetailsService.inventorySubmission(scell);
    }
}
