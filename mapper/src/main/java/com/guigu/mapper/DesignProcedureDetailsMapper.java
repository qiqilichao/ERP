package com.guigu.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.DesignProcedure;
import com.guigu.pojo.DesignProcedureDetails;
import org.apache.ibatis.annotations.Param;
import com.guigu.pojo.DesignProcedureModule;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DesignProcedureDetailsMapper extends BaseMapper<DesignProcedureDetails> {


    //根据成品id查询工序
    @Select("SELECT mdpd.*,mdp.`DESIGN_ID` FROM  `d_file` df INNER JOIN  `m_design_procedure` mdp ON mdp.`PRODUCT_ID`=df.`PRODUCT_ID`\n" +
            "\n" +
            "INNER JOIN `m_design_procedure_details` mdpd ON mdp.`ID`=mdpd.`PARENT_ID` \n" +
            "\n" +
            "WHERE df.`PRODUCT_ID`= #{productId} ;")
    List<DesignProcedureDetails> selectByproduct_id(String productId);

    @Select("SELECT * FROM `m_design_procedure` dp INNER JOIN \n" +
            "`m_design_procedure_details` dpd  ON dp.`ID`=dpd.`PARENT_ID`\n" +
            "WHERE  dp.`PRODUCT_ID`=#{id}")
    List<DesignProcedureDetails> seletWrapper(String id);





    @Update("UPDATE `m_design_procedure_details` SET DESIGN_MODULE_TAG = 'D002-1' WHERE id=#{ids}")
    boolean upddesprodetatag(Integer ids);

    @Update("UPDATE `m_design_procedure_details` SET MODULE_SUBTOTAL=#{subcos} where id=#{id}")
    boolean updsubcost(@Param("subcos") float subcos, @Param("id") Integer id);
}
