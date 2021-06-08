package com.guigu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.Gather;
import com.guigu.pojo.Pay;

public interface GatherService extends IService<Gather> {
    //查询出审核通过且未作调度的入库单
    IPage<Gather> Storagesboundscheduling(Integer pageno, Integer pagesize);
}
