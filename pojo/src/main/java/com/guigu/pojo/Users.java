package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
@TableName("sys_users")
public class Users {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("LOGIN_ID")
    private String loginId;
    @TableField("PASSWORD")
    private String password;
    @TableField("PHOTO_PATH")
    private String photo;
    @TableField("STATUS")
    private Integer status;

}
