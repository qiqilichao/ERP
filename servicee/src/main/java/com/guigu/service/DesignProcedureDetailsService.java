package com.guigu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.DesignProcedureDetails;

import java.util.List;

public interface DesignProcedureDetailsService extends IService<DesignProcedureDetails> {

    //根据设计单的id查询出具体的工序
    List<DesignProcedureDetails> seldisproById(Integer id);
    List<DesignProcedureDetails> queryWrapper(String id);

    //根据成品id查询工序
    List<DesignProcedureDetails> listBypid(String productId);


}
