package com.guigu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.PayDetailsMapper;
import com.guigu.pojo.PayDetails;
import com.guigu.service.PayDetailsService;
import org.springframework.stereotype.Service;

@Service
public class PayDetailsServiceImpl extends ServiceImpl<PayDetailsMapper, PayDetails>
        implements PayDetailsService {
}
