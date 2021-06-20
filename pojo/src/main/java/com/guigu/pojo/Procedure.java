package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("m_procedure")
public class Procedure {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String procedureId;

    private String procedureName;

    private float labourHourAmount;

    private float realLabourHourAmount;

    private float subtotal;

    private float realSubtotal;

    private float moduleSubtotal;

    private float realModuleSubtotal;

    private float costPrice;

    private float demandAmount;

    private float realAmount;

    private String procedureFinishTag;

    private String procedureTransferTag;


}
