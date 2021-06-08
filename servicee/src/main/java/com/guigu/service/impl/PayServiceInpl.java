package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.PayMapper;
import com.guigu.pojo.Pay;
import com.guigu.service.PayService;
import org.springframework.stereotype.Service;

@Service
public class PayServiceInpl extends ServiceImpl<PayMapper, Pay> implements PayService {
    @Override
    public IPage<Pay> Outboundscheduling(Integer pageno, Integer pagesize) {
        QueryWrapper<Pay> wrapper = new QueryWrapper<Pay>();
        wrapper.eq("checkTag","S001-1");
        wrapper.eq("payTag","K002-1");
        return this.page(new Page<Pay>(pageno,pagesize),wrapper);
    }
}
