package com.guigu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.ProcedureList;

import java.util.List;

public interface ProcedureListService extends IService<ProcedureList> {
    //删除工序
    boolean delprolist(Integer proid,Integer id);
}
