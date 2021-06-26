package com.guigu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.pojo.*;
import com.guigu.service.DesignProcedureDetailsService;
import com.guigu.service.ManufactureService;
import javafx.scene.control.Alert;
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
    public boolean savemanufacture( Manufacture manufacture){
        /*System.out.println(manufacture);
        return false;*/
        return manufactureService.addManufacture(manufacture);
    }

    /**
     * 查询出工序
     * @param id
     * @return
     */
    @RequestMapping("queryManuById")
    public List<Procedure> queryManuById(Integer id){
        return manufactureService.queryManuById(id);
    }

    /**
     * 查询出物料
     * @param id
     * @return
     */
    @RequestMapping("querypromoduleById")
    public List<ProcedureModule> querypromoduleById(Integer id){
        return manufactureService.querypromoduleById(id);
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

    /**
     * 查询出要生产的数据
     * @param pageno
     * @param pagesize
     * @return
     */
    @RequestMapping("page")
    public IPage<Manufacture> page(@RequestParam(value = "pageno",defaultValue ="1") Integer pageno,
                                   @RequestParam(value = "pagesize",defaultValue ="5")Integer pagesize){
        QueryWrapper<Manufacture> wrapper = new QueryWrapper<Manufacture>();
        wrapper.eq("MANUFACTURE_PROCEDURE_TAG","S002-0");
        return manufactureService.page(new Page<Manufacture>(pageno,pagesize),wrapper);
    }

    /**
     * 登记提交(完成)
     * @param procedureModules
     * @return
     */
    @RequestMapping("dengji")
    public boolean dengji(@RequestBody List<ProcedureModule> procedureModules){
        return manufactureService.dengji(procedureModules);
    }

    @RequestMapping("toexpage")
    public IPage<Manufacture> toexpage(@RequestParam(value = "pageno",defaultValue ="1") Integer pageno,
                                   @RequestParam(value = "pagesize",defaultValue ="5")Integer pagesize){
        QueryWrapper<Manufacture> wrapper = new QueryWrapper<Manufacture>();
        wrapper.eq("MANUFACTURE_PROCEDURE_TAG","S002-1");
        return manufactureService.page(new Page<Manufacture>(pageno,pagesize),wrapper);
    }

    @RequestMapping("seltoexaproding")
    public List<ProcedureModule> seltoexaproding(Integer id,String proid){
        return manufactureService.seltoexaproding(id,proid);
    }

    @RequestMapping("toexmateok")
    public boolean toexmateok(@RequestBody List<ProcedureModule> procedureModules){

        return manufactureService.toexmateok(procedureModules);
    }
}
