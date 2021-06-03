package com.guigu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.Menu;

import java.util.List;

public interface MenuService extends IService<Menu> {

    //查询出全部的菜单，并分好父子级
    List<Menu> queryAllMenus();
}
