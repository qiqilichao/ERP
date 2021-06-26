package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
@TableName("m_design_procedure_details")
public class DesignProcedureDetails {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    @TableField(exist = false)
    private String designId;

    private String procedureId;

    private String procedureName;

    private Float labourHourAmount;

    private String procedureDescribe;

    private String amountUnit;

    private Float costPrice;

    private Float subtotal;

    private Float moduleSubtotal;

    private String register;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date registerTime;

    private String designModuleTag;

    private String designModuleChangeTag;
}
