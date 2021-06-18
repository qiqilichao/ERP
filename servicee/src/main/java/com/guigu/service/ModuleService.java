package com.guigu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.pojo.Dfile;
import com.guigu.pojo.Module;;

import java.util.List;
public interface ModuleService extends IService<Module> {

    //查询出审核通过的设计单
    IPage<Dfile> queryAllmodule(Integer pageno, Integer pagesize, Dfile module);


    public boolean gobuy(List<Module> module);

}
