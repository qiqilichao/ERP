package com.guigu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.PayDetails;
import com.guigu.pojo.Scell;

import java.util.List;

public interface PayDetailsService extends IService<PayDetails> {


    //提交出库调度业务
    boolean inventorySubmission(List<Scell> scell);
}
