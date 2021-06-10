package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("manufacture_config_procedure_list")
public class ProcedureList {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String kind;

    private String typeId;

    private String typeName;

    private String describe1;

    private String describe2;

    private String register;

    private String registerId;

    @TableField(exist = false)
    public boolean checked;
}
