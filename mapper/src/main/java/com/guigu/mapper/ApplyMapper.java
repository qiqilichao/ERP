package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Apply;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ApplyMapper extends BaseMapper<Apply> {

    @Update("UPDATE  m_apply SET  CHECK_TAG =#{checkTag}, CHECKER=#{checker},CHECK_TIME=NOW() WHERE id=#{id}")
   int updateChecktag(Apply apply);

    @Select("SELECT * FROM  `d_file` df  INNER JOIN  `m_apply` ma   ON df.`PRODUCT_ID`=ma.`PRODUCT_ID`\n" +
            "\n" +
            "WHERE df.`PRODUCT_ID`=#{pid} AND ma.`CHECK_TAG`='S001-1'")
    List<Apply> ByproductId(String pid);
}
