package com.guigu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.guigu.pojo.*;
import com.guigu.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    DesignProcedureService procedureService;

    @Autowired
    ModuleService moduleService;

    @Autowired
    DesignProcedureDetailsService designProcedureDetailsService;

    @Autowired
    DesignProcedureModuleService designmoduleService;

    @RequestMapping("selDesignsheet")
    public IPage<Dfile> selDesignsheet(@RequestParam(value = "pageno",defaultValue ="1") Integer pageno,
                                           @RequestParam(value = "pagesize",defaultValue ="5")Integer pagesize,
                                           Dfile module){
        IPage<Dfile> pageInfo = moduleService.queryAllmodule(pageno, pagesize, module);
        return pageInfo;
    }

    /**
     * 这是是查询工序
     * @return
     */
    @RequestMapping("queryprolist")
    public List<ProcedureList> queryprolist(){
        return procedureListService.list();
    }

    /**
     * 这是添加工序的方法
     * @param procedureLists
     * @return
     */
    @RequestMapping("tjgx")
    public boolean thgx(@RequestBody List<ProcedureList> procedureLists){
        System.out.println(procedureLists);
        return procedureService.insdesignProceduure(procedureLists);
    }

    /**
     * 查询出需要审核的设计单
     * @return
     */
    @RequestMapping("seloexmaldepro")
    public IPage<DesignProcedure> seloexmaldepro(@RequestParam(value = "pageno",defaultValue ="1") Integer pageno,
                                                 @RequestParam(value = "pagesize",defaultValue ="5")Integer pagesize){
        QueryWrapper<DesignProcedure> wrapper = new QueryWrapper<DesignProcedure>();
        wrapper.eq("CHECK_TAG","S001-0");
        return procedureService.page(new Page<DesignProcedure>(pageno,pagesize),wrapper);
    }

    /**
     * 根据设计单的id查询出具体的工序
     * @param id
     * @return
     */
    @RequestMapping("seldisproById")
    public List<DesignProcedureDetails> seldisproById(Integer id){
        return designProcedureDetailsService.seldisproById(id);
    }

    /**
     * 审核
     * @param designProcedure
     * @param radios
     * @return
     */
    @RequestMapping("toexamine")
    public boolean toexamine(DesignProcedure designProcedure,Integer radios){

        return procedureService.toexamine(designProcedure,radios);
    }

    /**
     * 查询出设计单的全部数据
     * @param pageno
     * @param pagesize
     * @param designProcedure
     * @return
     */
    @RequestMapping("querAll")
    public IPage<DesignProcedure> querAll(@RequestParam(value = "pageno",defaultValue ="1") Integer pageno,
                                          @RequestParam(value = "pagesize",defaultValue ="5")Integer pagesize,
                                          DesignProcedure designProcedure){
        return procedureService.listAll(pageno,pagesize,designProcedure);
    }

    /**
     * 查询出审核通过的设计单
     * @return
     */
    @RequestMapping("seloexmaldeprook")
    public IPage<DesignProcedure> seloexmaldeprook(@RequestParam(value = "pageno",defaultValue ="1") Integer pageno,
                                                   @RequestParam(value = "pagesize",defaultValue ="5")Integer pagesize,
                                                   DesignProcedure designProcedure){
        return procedureService.seloexmaldeprook(pageno,pagesize,designProcedure);
    }

    /**
     * 删除工序的方法
     * @param proid
     * @param id
     * @return
     */
    @RequestMapping("delprolist")
    public boolean delprolist(Integer proid,Integer id){
        return procedureListService.delprolist(proid,id);
    }

    /**
     * 更改
     * @param procedureLists
     * @return
     */
    @RequestMapping("upddispro")
    public boolean upddispro(@RequestBody List<ProcedureList> procedureLists){
        return procedureService.insnewdesignProceduur(procedureLists);
    }

    /**
     * 查询出通过审核的设计单，并且工序物料未设计
     * @param pageno
     * @param pagesize
     * @return
     */
    @RequestMapping("selrocesslist")
    public IPage<DesignProcedure> selrocesslist(@RequestParam(value = "pageno",defaultValue ="1") Integer pageno,
                                               @RequestParam(value = "pagesize",defaultValue ="5")Integer pagesize){


        return procedureService.selrocesslist(pageno,pagesize);
    }


    /**
     * 根据物料查询出组成商品的物料
     * @param proid
     * @return
     */
    @RequestMapping("selprocessById")
    public List<ModuleDetails> selprocessById(String proid){
        System.out.println(proid);
        return procedureService.selprocessById(proid);
    }
}
