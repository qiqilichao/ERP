package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName("m_manufacture")
public class Manufacture {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String manufactureId;

    private String productId;

    private String productName;

    private Float amount;

    private Float testedAmount;

    private String applyIdGroup;

    private String productDescribe;

    private Float moduleCostPriceSum;

    private Float realModuleCostPriceSum;

    private Float labourCostPriceSum;

    private Float realLabourCostPriceSum;

    private String designer;

    private String register;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date registerTime;

    private String checker;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date checkTime;

    private String remark;

    private String checkTag;

    private String manufactureProcedureTag;

    /*@TableField(exist = false)
    private List<DesignProcedureDetails> designProcedureDetailsList;
*/
}
