package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("m_design_procedure_details")
public class DesignProcedureDetails {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String procedureId;

    private String procedureName;

    private Float labourHourAmount;

    private String procedureDescribe;

    private String amountUnit;

    private Float costPrice;

    private Float subtotal;

    private Float moduleSubtotal;

    private String register;

    private Date registerTime;

    private String designModuleTag;

    private String designModuleChangeTag;
}
