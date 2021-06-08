package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.GatherMapper;
import com.guigu.pojo.Gather;
import com.guigu.service.GatherService;
import org.springframework.stereotype.Service;

@Service
public class GatherServiceImpl extends ServiceImpl<GatherMapper, Gather> implements GatherService {

    @Override
    public IPage<Gather> Storagesboundscheduling(Integer pageno, Integer pagesize) {
        QueryWrapper<Gather> wrapper = new QueryWrapper<Gather>();
        wrapper.eq("checkTag","S001-1");
        wrapper.eq("gatherTag","K002-1");
        return this.page(new Page<Gather>(pageno,pagesize),wrapper);
    }
}
