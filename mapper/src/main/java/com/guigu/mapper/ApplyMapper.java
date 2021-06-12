package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Apply;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface ApplyMapper extends BaseMapper<Apply> {

    @Update("UPDATE  m_apply SET  CHECK_TAG ='s001-1', CHECKER='yy',CHECK_TIME=NOW() WHERE id=78")
   int updateChecktag(Apply apply);
}
