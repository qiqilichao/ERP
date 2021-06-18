package com.guigu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.Dfile;

import java.util.List;

public interface DfileService extends IService<Dfile> {

    //添加
    boolean insDfile(Dfile dfile);

    boolean quertyBypid(String productId);


}
