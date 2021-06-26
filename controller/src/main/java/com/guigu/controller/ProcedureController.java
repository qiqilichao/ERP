package com.guigu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
        return procedureService.selprocessById(proid);
    }

    /**
     * 根据物料查询出组成商品的物料
     * @param proid
     * @return
     */
    @RequestMapping("selnewprocessById")
    public List<ModuleDetails> selnewprocessById(String proid){
        return procedureService.selnewprocessById(proid);
    }

    /**
     * 添加这条工序所需的物料
     */
    @RequestMapping("insprocess")
    public boolean insprocess(@RequestBody List<ModuleDetails> moduleDetails){
        return procedureService.insprocess(moduleDetails);
    }

    /**
     * 重新设计添加这条工序所需的物料
     */
    @RequestMapping("insnewprocess")
    public boolean insnewprocess(@RequestBody List<ModuleDetails> moduleDetails){
        return procedureService.insnewprocess(moduleDetails);
    }

    /**
     * 提交设计完成的工序物料
     * @param id
     * @return
     */
    @RequestMapping("processSubmit")
    public boolean processSubmit(Integer id){
        return procedureService.processSubmit(id);
    }

    /**
     * 查询出通过审核的设计单，并且工序物料已经设计的数据
     * @param pageno
     * @param pagesize
     * @return
     */
    @RequestMapping("selrocesslistok")
    public IPage<DesignProcedure> selrocesslistok(@RequestParam(value = "pageno",defaultValue ="1") Integer pageno,
                                                @RequestParam(value = "pagesize",defaultValue ="5")Integer pagesize){
        return procedureService.selrocesslistok(pageno,pagesize);
    }

    /**
     *获取到当前工序的物料组成
     * @param id
     * @return
     */
    @RequestMapping("getprocesslist")
    public List<DesignProcedureModule> getprocesslist(Integer id){

        return procedureService.getprocesslist(id);
    }

    /**
     * 审核
     * @param designProcedure
     * @param radio
     * @return
     */
    @RequestMapping("processtoexamineok")
    public boolean processtoexamineok(DesignProcedure designProcedure,Integer radio){

        return procedureService.processtoexamineok(designProcedure,radio);
    }

    /**
     * 查询出全部的设计单
     * @param pageno
     * @param pagesize
     * @param designProcedure
     * @return
     */
    @RequestMapping("queryProcess")
    public IPage<DesignProcedure> queryProcess(@RequestParam(value = "pageno",defaultValue ="1") Integer pageno,
                                               @RequestParam(value = "pagesize",defaultValue ="5")Integer pagesize,
                                               DesignProcedure designProcedure){
        return procedureService.queryProcess(pageno,pagesize,designProcedure);
    }

    /**
     * 查询出审核通过了的数据
     * @param pageno
     * @param pagesize
     * @param designProcedure
     * @return
     */
    @RequestMapping("queryProcesstoexmainOk")
    public IPage<DesignProcedure> queryProcesstoexmainOk(@RequestParam(value = "pageno",defaultValue ="1") Integer pageno,
                                                         @RequestParam(value = "pagesize",defaultValue ="5")Integer pagesize,
                                                         DesignProcedure designProcedure){
        return procedureService.queryProcesstoexmainOk(pageno,pagesize,designProcedure);
    }

    /**
     * 这是更改物料提交的方法
     * @param moduleDetails
     * @return
     */
    @RequestMapping("insnewpressdespro")
    public boolean delpressdespro(@RequestBody List<ModuleDetails> moduleDetails){
        return procedureService.insnewpressdespro(moduleDetails);
    }

    //工序物料更改
    @RequestMapping("updprocessdespro")
    public boolean updprocessdespro(Integer id){
        System.out.println(id);
        return procedureService.updprocessdespro(id);
    }
}
