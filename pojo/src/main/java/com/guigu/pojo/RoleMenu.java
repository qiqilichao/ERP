package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sys_menu_role")
public class RoleMenu {
    @TableId(type = IdType.AUTO)
    private int id;

    private  int role_id;

    private int menu_id;
}
