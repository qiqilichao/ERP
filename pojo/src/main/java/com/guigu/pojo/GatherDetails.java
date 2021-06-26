package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.guigu.dto.GatherDetailDto;
import lombok.Data;


@Data
@TableName("s_gather_details")
public class GatherDetails  {
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

    @TableField(exist = false)
    private float rukushu;
    @TableField(exist = false)
    private Integer gid;

}
