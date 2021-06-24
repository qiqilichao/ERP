package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Dfile;
import com.guigu.pojo.Scell;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ScellMapper extends BaseMapper<Scell> {
    @Select("select * from `d_file` df\n" +
            "left join s_cell sc on df.PRODUCT_ID = sc.PRODUCT_ID\n" +
            "where df.`CHECK_TAG`='S001-1' and sc.check_tag=#{tag} or sc.check_tag=#{tag2}")
    List<Dfile> queryAllSCll(@Param("tag") String tag, @Param("tag2") String tag2);

}
