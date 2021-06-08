package com.guigu.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.guigu.pojo.Gather;
import com.guigu.service.GatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gather")
@CrossOrigin
public class GatherController {
    @Autowired
    GatherService gatherService;

    @RequestMapping("/Storagesboundscheduling")
    public IPage<Gather> Storagesboundscheduling(@RequestParam(value = "pageno",defaultValue = "1") Integer pageno,
                                                 @RequestParam(value = "pagesize",defaultValue = "5")Integer pagesize,
                                                 Integer id){
        return gatherService.Storagesboundscheduling(id,pageno,pagesize);
    }
}
