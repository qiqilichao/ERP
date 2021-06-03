package com.guigu.controller;

import com.guigu.pojo.Menu;
import com.guigu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
@CrossOrigin
public class MenuController {
    @Autowired
    MenuService menuService;

    @RequestMapping("/query")
    public List<Menu> query(){
        return menuService.queryAllMenus();
    }

}
