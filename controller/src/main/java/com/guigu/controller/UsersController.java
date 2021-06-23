package com.guigu.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.guigu.pojo.Users;
import com.guigu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/uers")
@CrossOrigin
public class UsersController {


    @Autowired
    private UsersService usersService;

    //查询登录用户是否存在
    @RequestMapping("/queryByLoginIdandPassword")
    @ResponseBody
    public boolean queryByLoginIdandPassword(Users users){
        QueryWrapper<Users> wrapper= new QueryWrapper<>();
        if(!StringUtils.isEmpty(users.getLoginId())){
            wrapper.eq("LOGIN_ID",users.getLoginId());
        }
        if(!StringUtils.isEmpty(users.getPassword())){
            wrapper.eq("PASSWORD",users.getPassword());
        }
        Users one = usersService.getOne(wrapper);
        if(one!=null)
            return true;
        return false;
    }

}
