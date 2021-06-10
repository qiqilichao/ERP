package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName("sys_menus")
public class Menu extends Dfile{
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer id;

//    @TableField("PARENT_ID")
    private int parentId;

    @TableField("SEQ")
    private int seq;

    @TableField("NAME")
    private String name;

    @TableField("TIP")
    private String tip;

    @TableField("DESCN")
    private String descn;

//    @TableField("IMAGE_URL")
    private String imageUrl;

//    @TableField("LINK_URL")
    private String linkUrl;

    @TableField("TARGET")
    private String target;

    @TableField("STATUS")
    private String status;

    @TableField(exist = false)
    private List<Menu> childMenu;
}
