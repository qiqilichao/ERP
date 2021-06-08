package com.guigu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.Pay;

public interface PayService extends IService<Pay> {
    //查询出审核通过且未作调度的出库单
    IPage<Pay> Outboundscheduling(Integer pageno,Integer pagesize);
}
