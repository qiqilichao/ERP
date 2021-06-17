package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

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

    @TableField(exist = false)
    public DesignProcedure updstu;


    @TableField(exist = false)
    private Float labourHourAmount;
    @TableField(exist = false)
    private String amountUnit;
    @TableField(exist = false)
    private Float costPrice;
    @TableField(exist = false)
    private Float subtotal;
}
