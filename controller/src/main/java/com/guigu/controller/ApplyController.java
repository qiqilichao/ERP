package com.guigu.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.dto.ApplyDto;
import com.guigu.pojo.Apply;
import com.guigu.pojo.Dfile;
import com.guigu.service.ApplyService;
import com.guigu.service.DfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("apply")
@Controller
@CrossOrigin
public class ApplyController {


    @Autowired
    private ApplyService applyService;
    @Autowired
    private DfileService dfileService;


     //查询所有商品
     @RequestMapping("DfilePage")
     @ResponseBody
    public IPage<Dfile> dfilePage(@RequestParam(defaultValue = "1")int pageno,
                                  @RequestParam(defaultValue = "5")int pagesize,
                                  Dfile dfile){



         return applyService.pageDfile(pageno,pagesize,dfile);
    }


    //查询所有待审核商品
    @RequestMapping("applyIPage")
    @ResponseBody
    public IPage<Apply> applyIPage(@RequestParam(defaultValue = "1")int pageno,
                                   @RequestParam(defaultValue = "10")int pagesize,
                                   Apply apply){
         return applyService.pageApply(pageno,pagesize,apply);
    }
    //查询所有商品
    @RequestMapping("applyAllIPage")
    @ResponseBody
    public IPage<Apply> applyAllIPage(@RequestParam(defaultValue = "1")int pageno,
                                   @RequestParam(defaultValue = "10")int pagesize,
                                   Apply apply){
         System.out.println(apply);
        return applyService.pageApplyAll(pageno,pagesize,apply);
    }
    //查询所有通过审核为派工产品
    @RequestMapping("formulateList")
    @ResponseBody
    public List<Apply> formulateList(Apply apply){
         return applyService.formulatelist(apply);
    }

    //添加计划生产商品
    @RequestMapping("addApply")
    @ResponseBody
    public boolean addApply(@RequestBody List<Dfile> dfiles){

         return applyService.addApply(dfiles);
    }
    //查询一条apply记录
    @RequestMapping("getBApplyid")
    @ResponseBody
    public Apply getBApplyid(int id){
         return applyService.getById(id);
    }

    //生产商品的查寻
    @RequestMapping("getByDid")
    @ResponseBody
    public Dfile  getByDid(int id){

         return dfileService.getById(id);
    }

    //查询所有Apply
    @RequestMapping("applyList")
    @ResponseBody
    public List<Apply> applyList(){
         return applyService.list();
    }

    //改变apply的审核状态
    @RequestMapping("chenggApplychecker")
    @ResponseBody
    public boolean chenggApplychecker(Apply apply){
         return applyService.updateCHECKER(apply);
    }
}
