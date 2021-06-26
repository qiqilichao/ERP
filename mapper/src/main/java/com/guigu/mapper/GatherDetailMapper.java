package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.GatherDetails;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author shijianghua
 * @date 2021/6/23.
 */
public interface GatherDetailMapper extends BaseMapper<GatherDetails> {
   /* @Select("SELECT g.GATHER_ID,g.REGISTER,gd.* FROM s_gather g \n" +
            "LEFT JOIN s_gather_details gd on\n" +
            "\n" +
            "g.ID=gd.PARENT_ID  where gd.PARENT_ID=#{parentId}")
    public List<GatherDetails> querylianjiaBy(int parentId);*/
}
