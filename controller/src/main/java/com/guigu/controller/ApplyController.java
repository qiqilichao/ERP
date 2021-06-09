package com.guigu.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.pojo.Apply;
import com.guigu.pojo.Dfile;
import com.guigu.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("apply")
@Controller
@CrossOrigin
public class ApplyController {


    @Autowired
    private ApplyService applyService;


     //查询所有商品
     @RequestMapping("DfilePage")
     @ResponseBody
    public IPage<Dfile> dfilePage(@RequestParam(defaultValue = "1")int pageno,
                                  @RequestParam(defaultValue = "5")int pagesize,
                                  Dfile dfile){

         return applyService.pageDfile(pageno,pagesize,dfile);
    }
}
