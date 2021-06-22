package com.guigu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.DesignProcedure;
import com.guigu.pojo.DesignProcedureModule;

import java.util.List;

public interface DesignProcedureModuleService extends IService<DesignProcedureModule> {

    //根据PARENT_ID查询物料明细
    public List<DesignProcedureModule> queryByid(int id);

    //根据dp表的id和name查询物料明细
    public List<DesignProcedureModule> queryByidandname(int id,String productName);
}
