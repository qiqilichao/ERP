package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.DesignProcedure;
import org.apache.ibatis.annotations.Update;

public interface DesignProcedureMapper extends BaseMapper<DesignProcedure> {
    //删除之后修改设计单的状态
    int upddestag(Integer id);

    @Update("UPDATE `m_design_procedure` SET DESIGN_MODULE_TAG='G002-1' WHERE id=#{id}")
    boolean processSubmit(Integer id);
}
