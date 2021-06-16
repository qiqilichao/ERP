package com.guigu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.ProcedureList;

public interface ProcedureListService extends IService<ProcedureList> {
    //添加工序
    boolean insprolist(ProcedureList procedureList);
}
