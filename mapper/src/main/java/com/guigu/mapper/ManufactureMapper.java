package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Manufacture;
import org.apache.ibatis.annotations.Update;

public interface ManufactureMapper extends BaseMapper<Manufacture> {


    @Update("UPDATE  `m_manufacture`  SET CHECKER=#{checker} ,CHECK_TIME=NOW(),CHECK_TAG=#{checkTag}\n" +
            "WHERE ID=#{id}")
    int  updateTeg(Manufacture manufacture);

    @Update("UPDATE `m_manufacture` SET MANUFACTURE_PROCEDURE_TAG='S002-1' WHERE id=#{id}")
    boolean updmaprotag(Integer id);

}
