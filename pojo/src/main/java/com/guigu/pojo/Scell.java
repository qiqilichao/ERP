package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 注：
 * 1，AMOUNT用于记录产品目前的实际存储的数量
 */
@Data
@TableName("s_cell")
public class Scell {
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;/*序号*/

    @TableField("STORE_ID")
    private String storeId;/*库存编号*/

    @TableField("PRODUCT_ID")
    private String productId;/*产品编号*/
    @TableField(exist = false)
    private Dfile dFile;

    @TableField("PRODUCT_NAME")
    private String productName;/*产品名称*/

    @TableField("FIRST_KIND_ID")
    private String firstKindId;/*产品I级分类编号*/

    @TableField("FIRST_KIND_NAME")
    private String firstKindName;/*产品I级分类名称*/

    @TableField("SECOND_KIND_ID")
    private String secondKindId;/*产品II级分类编号*/

    @TableField("SECOND_KIND_NAME")
    private String secondKindName;/*产品II级分类名称*/

    @TableField("THIRD_KIND_ID")
    private String thirdKindId;/*产品III级分类编号*/

    @TableField("THIRD_KIND_NAME")
    private String thirdKindName;/*产品III级分类名称*/

    @TableField("MIN_AMOUNT")
    private Integer minAmount;/*库存报警下限数*/

    @TableField("MAX_AMOUNT")
    private Integer maxAmount;/*库存报警上限数*/

    @TableField("MAX_CAPACITY_AMOUNT")
    private Integer maxCapacityAmount;/*最大存储量*/

    @TableField("AMOUNT")
    private Integer amount;/*当前存储量*/

    @TableField("CONFIG")
    private String config;/*配置要求*/

    @TableField("REGISTER")
    private String register;/*登记人*/

    @TableField("REGISTER_TIME")

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date registerTime;/*登记时间*/

    @TableField("CHECKER")
    private String checker;/*复核人*/

    @TableField("CHECK_TIME")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
    private Date checkTime;/*复核时间*/

    @TableField("CHECK_TAG")
    private String checkTag;/*审核标志*/

    @TableField("STORAGE_UNIT")
    private String storageUnit;/*储存单元*/

    @TableField("STORAGE_UNIT_ABBREVIATION")
    private String storageUnitAbbreviation;/*储存单元简称*/

    @TableField("THE_DESIGNER")
    private String theDesigner;/*设计人*/

    @TableField(exist = false)
    private String str;

    @TableField(exist = false)
    private Integer confirm;

    @TableField(exist = false)
    private String payid;

    @TableField(exist = false)
    private String mid;
}
