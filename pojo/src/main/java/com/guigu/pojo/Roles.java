package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sys_roles")
public class Roles {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String code;
    @TableField("descn")
    private String descn;
    private Integer status;

    @TableField(exist = false)
    private boolean checked;
}
