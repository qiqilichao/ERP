package com.guigu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.ConfigFileKind;

import java.util.List;

public interface ConfigFileKindService extends IService<ConfigFileKind> {
    //查询出一到三级分类
    List<ConfigFileKind> querAll();
}
