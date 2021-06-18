package com.guigu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.Manufacture;

public interface ManufactureService extends IService<Manufacture> {

    boolean addManufacture(Manufacture manufacture);
}
