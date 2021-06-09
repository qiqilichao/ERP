package com.guigu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.dto.ApplyDto;
import com.guigu.pojo.Apply;
import com.guigu.pojo.Dfile;

import java.util.List;

public interface ApplyService extends IService<Apply> {

    public IPage<Dfile> pageDfile(int pageno,int pagesize,Dfile dfile);

    public boolean addApply(List<Dfile> dfilelies);
}
