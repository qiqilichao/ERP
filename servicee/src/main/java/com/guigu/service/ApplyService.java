package com.guigu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.dto.ApplyDto;
import com.guigu.pojo.Apply;
import com.guigu.pojo.Dfile;

import java.util.List;

public interface ApplyService extends IService<Apply> {

    public IPage<Dfile> pageDfile(int pageno,int pagesize,Dfile dfile);

    public IPage<Apply> pageApply(int pageno,int pagesize,Apply apply);

    public IPage<Apply> pageApplyAll(int pageno,int pagesize,Apply apply);

    //制动生产调动查寻
    public List<Apply> formulatelist(Apply apply);

    public Apply queryByproductIdList(String pid);

    public boolean addApply(List<Dfile> dfilelies);

    public boolean updateCHECKER(Apply apply);
}
