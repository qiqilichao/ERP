package com.guigu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.DesignProcedure;
import com.guigu.pojo.DesignProcedureModule;
import com.guigu.pojo.ModuleDetails;
import com.guigu.pojo.ProcedureList;

import java.util.List;

public interface DesignProcedureService extends IService<DesignProcedure> {
    //添加工序的方法
    boolean insdesignProceduure(List<ProcedureList> procedureLists);

    //查询出要审核的数据
    List<DesignProcedure> seltoiexmal();

    //审核
    boolean toexamine(DesignProcedure designProcedure,Integer radios);

    //查询出全部的设计单
    IPage<DesignProcedure> listAll(Integer pageno,Integer pagesize,DesignProcedure designProcedure);

    //查询出审核通过的设计单
    IPage<DesignProcedure> seloexmaldeprook(Integer pageno,Integer pagesize,DesignProcedure designProcedure);

    //添加更改的工序数据
    boolean insnewdesignProceduur(List<ProcedureList> procedureLists);

    //查询出通过审核的设计单，并且工序物料未设计
    IPage<DesignProcedure> selrocesslist(Integer pageno, Integer pagesize);

    //根据物料查询出组成商品的物料
    List<ModuleDetails> selprocessById(String id);

    //添加这条工序所需的物料、
    boolean insprocess(List<ModuleDetails> moduleDetails);

    //添加这条工序所需的物料、(重新设计)
    boolean insnewprocess(List<ModuleDetails> moduleDetails);

    //根据物料查询出组成商品的物料（重新设计）
    List<ModuleDetails> selnewprocessById(String id);

    //提交设计完成的工序物料
    boolean processSubmit(Integer id);

    //查询出已经完成工序物料设计的设计单
    IPage<DesignProcedure> selrocesslistok(Integer pageno, Integer pagesize);

    //获取到当前工序的物料组成
    List<DesignProcedureModule> getprocesslist(Integer id);

    //审核
    boolean processtoexamineok(DesignProcedure designProcedure,Integer radio);

    //查询出全部的设计单
    IPage<DesignProcedure> queryProcess(Integer pageno,Integer pagesize,DesignProcedure designProcedure);

    //查询出审核通过的数据
    IPage<DesignProcedure> queryProcesstoexmainOk(Integer pageno,Integer pagesize,DesignProcedure designProcedure);

   //这是更改物料提交的方法
    boolean insnewpressdespro(List<ModuleDetails> moduleDetails);

    //工序物料更改
    boolean updprocessdespro(Integer id);

}
