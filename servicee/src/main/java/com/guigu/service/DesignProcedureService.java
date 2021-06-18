package com.guigu.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.DesignProcedure;
import com.guigu.pojo.DesignProcedureDetails;
import com.guigu.pojo.ProcedureList;
import org.springframework.web.bind.annotation.RequestParam;

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
}
