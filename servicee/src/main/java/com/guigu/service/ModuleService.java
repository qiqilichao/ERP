package com.guigu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.pojo.Module;

public interface ModuleService extends IService<Module> {

    //查询出审核通过的设计单
    PageInfo<Module> queryAllmodule(Integer pageno, Integer pagesize, Module module);
}
