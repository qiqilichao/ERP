package com.guigu.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.DesignProcedureDetails;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DesignProcedureDetailsMapper extends BaseMapper<DesignProcedureDetails> {


    //根据成品id查询工序
    @Select("SELECT mdpd.*,mdp.`DESIGN_ID` FROM  `d_file` df INNER JOIN  `m_design_procedure` mdp ON mdp.`PRODUCT_ID`=df.`PRODUCT_ID`\n" +
            "\n" +
            "INNER JOIN `m_design_procedure_details` mdpd ON mdp.`ID`=mdpd.`PARENT_ID` \n" +
            "\n" +
            "WHERE df.`PRODUCT_ID`= #{productId} ;")
    List<DesignProcedureDetails> selectByproduct_id(String productId);
}
