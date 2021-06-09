package com.guigu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.Dfile;

import java.util.List;

public interface DfileService extends IService<Dfile> {

    //添加
    boolean insDfile(Dfile dfile);

    //查询出所有通过审核的产品档案的商品
    List<Dfile> cpshenghetg();
}
