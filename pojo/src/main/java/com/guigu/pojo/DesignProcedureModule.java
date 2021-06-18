package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("m_design_procedure_module")
public class DesignProcedureModule {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String productId;

    private String productName;

    private String type;

    private Float amount;

    private String productDescribe;

    private String amountUnit;

    private Float costPrice;

    private Float subtotal;

}
