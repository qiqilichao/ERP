package com.guigu.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author shijianghua
 * @date 2021/6/15.
 */
@Data
public class ModuleDto {
    @TableField(exist = false)
    private String productid;
    @TableField(exist = false)
    private String register;
    @TableField(exist = false)
    private String productname;
    @TableField(exist = false)
    private String personalValue;
    @TableField(exist = false)
    private String amountUnit;
    @TableField(exist = false)
    private Integer amount;
    @TableField(exist = false)
    private Integer residualAmount;
    @TableField(exist = false)
    private Float costPrice;
    @TableField(exist = false)
    private String type;
    @TableField(exist = false)
    private Float subtotal;
    @TableField(exist = false)
    private Float realCostPrice;
    @TableField(exist = false)
    private Float hh;
    @TableField(exist = false)
    private Integer did;
    @TableField(exist = false)
    private String personalUnit;
}
