package com.guigu.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.Manufacture;

import java.util.List;

public interface ManufactureService extends IService<Manufacture> {

    boolean addManufacture(Manufacture manufacture);


    IPage<Manufacture> manufacturelist(int pageno ,int pagesize,Manufacture manufacture);

    //改变审核状态
    boolean SubmitforReview(Manufacture manufacture);

    //生产派工单审核查询
    IPage<Manufacture>  queryallManufacture(int pageno,int pagesize,Manufacture manufacture);


}
