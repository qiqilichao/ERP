package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
@Data
@TableName("S_PAY_DETAILS")
public class PayDetails {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer parentId;

    private String productId;

    private String productName;

    private String productDescribe;

    private float amount;

    private String amountUnit;

    private float costPrice;

    private float subtotal;

    private float paidAmount;

    private String payTag;

}
