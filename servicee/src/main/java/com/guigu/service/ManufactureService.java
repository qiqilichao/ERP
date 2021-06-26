package com.guigu.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.Manufacture;
import com.guigu.pojo.Procedure;
import com.guigu.pojo.ProcedureModule;
import com.guigu.pojo.Proceduring;

import java.util.List;

import java.util.List;

public interface ManufactureService extends IService<Manufacture> {

    boolean addManufacture(Manufacture manufacture);

    //查询出工序
    List<Procedure> queryManuById(Integer id);

    //查询出物料
    List<ProcedureModule> querypromoduleById(Integer id);


    IPage<Manufacture> manufacturelist(int pageno ,int pagesize,Manufacture manufacture);

    //改变审核状态
    boolean SubmitforReview(Manufacture manufacture);

    //生产派工单审核查询
    IPage<Manufacture>  queryallManufacture(int pageno,int pagesize,Manufacture manufacture);

    //登记提交
    boolean dengji(List<ProcedureModule> procedureModules);

    //根据id查询出生产工序单的数据
    List<ProcedureModule> seltoexaproding(Integer id, String proid);

    //复核通过
    boolean toexmateok(List<ProcedureModule> procedureModules);

}
