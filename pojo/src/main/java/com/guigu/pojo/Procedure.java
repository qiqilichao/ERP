package com.guigu.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Procedure {
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
