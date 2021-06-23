package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("s_gather_detail")
public class GatherDetails {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer parentId;

    private String productId;

    private String productName;

    private String productDescribe;

    private Integer amount;

    private String amountUnit;

    private Integer costPrice;

    private Integer  subtotal;

    private Integer gatheredAmount;

    private String gatherTag;

}
