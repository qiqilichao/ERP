package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName("d_file")
public class Dfile {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String productId;

    private String productName;

    private String factoryName;
    private String firstKindId;
    private String firstKindName;
    private String secondKindId;
    private String secondKindName;
    private String thirdKindId;
    private String thirdKindName;
    private String productNick;
    private String type;
    private String productClass;
    private String personalUnit;
    private String personalValue;
    private String providerGroup;
    private String warranty;
    private String twinName;
    private String twinId;
    private String lifecycle;
    private Float listPrice;
    private Float costPrice;
    private Float realCostPrice;
    private String amountUnit;
    private String productDescribe;
    private String responsiblePerson;
    private String register;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date registerTime;

    private String checker;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date checkTime;
    private String checkTag;
    private String changer;
    private Date changeTime;
    private String changeTag;
    private String priceChangeTag;
    private Integer fileChangeAmount;
    private String deleteTag;
    private String designModuleTag;
    private String designProcedureTag;
    private String designCellTag;

}
