package com.guigu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.GatherDetailMapper;
import com.guigu.pojo.GatherDetails;
import com.guigu.service.GatherDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shijianghua
 * @date 2021/6/23.
 */
@Service
public class GatherDetailServiceImpl extends ServiceImpl<GatherDetailMapper, GatherDetails> implements GatherDetailService {
   @Autowired
   GatherDetailMapper gatherDetailMapper;


}
