package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.DesignProcedure;

public interface DesignProcedureMapper extends BaseMapper<DesignProcedure> {
    //删除之后修改设计单的状态
    int upddestag(Integer id);
}
