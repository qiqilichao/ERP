package com.guigu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
    //查询所以入库数据
    @RequestMapping("/gatherselect.action")
    public IPage<Gather> gatherselect(@RequestParam(value = "pageno",defaultValue = "1") Integer pageno,
                                      @RequestParam(value = "pagesize",defaultValue = "5")Integer pagesize){
        QueryWrapper<Gather> gatherQueryWrapper = new QueryWrapper<>();
        gatherQueryWrapper.eq("CHECK_TAG","S001-1");
        gatherQueryWrapper.eq("STORE_TAG","K002-1");
        IPage<Gather> page = gatherService.page(new Page<Gather>(pageno, pagesize), gatherQueryWrapper);
        return page;
    }
    //查询单挑入库数据
    @RequestMapping("/gathertbyid.action")
    public Gather gathertbyid(int id){
        Gather byId = gatherService.getById(id);
        return byId;
    }
}
