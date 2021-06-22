package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.DesignProcedure;
import com.guigu.pojo.DesignProcedureModule;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DesignProcedureModuleMapper extends BaseMapper<DesignProcedureModule> {


    @Select("\n" +
            "SELECT dpm.* FROM `m_design_procedure` dp INNER JOIN \n" +
            "`m_design_procedure_details` dpd  ON dp.`ID`=dpd.`PARENT_ID`\n" +
            "\n" +
            "INNER JOIN `m_design_procedure_module` dpm ON dpd.`ID` =dpm.`PARENT_ID`\n" +
            "\n" +
            "WHERE  dp.`ID`=#{id} AND dpd.`PROCEDURE_NAME`=#{productName}")
    List<DesignProcedureModule> seletBydpidanddpname(@Param("id") int id  ,@Param("productName") String productName);
}
