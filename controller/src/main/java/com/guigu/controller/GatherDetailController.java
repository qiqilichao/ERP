package com.guigu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.pojo.GatherDetails;
import com.guigu.service.GatherDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shijianghua
 * @date 2021/6/23.
 */
@RestController
@RequestMapping("gatherDetail")
@CrossOrigin
public class GatherDetailController {
    @Autowired
    GatherDetailService gatherDetailService;
    //查询订单里面的物料
    @RequestMapping("/gatherDetailByidList.action")
    public List<GatherDetails> gatherDetailByidList(int id){
        System.out.println("123467iuo");
        QueryWrapper<GatherDetails> gatherDetailsQueryWrapper = new QueryWrapper<>();
        gatherDetailsQueryWrapper.eq("PARENT_ID",id);
        List<GatherDetails> list = gatherDetailService.list(gatherDetailsQueryWrapper);

        return list;
    }

}
