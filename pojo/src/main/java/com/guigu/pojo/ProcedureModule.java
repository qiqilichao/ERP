package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("m_procedure_module")
public class ProcedureModule {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String productId;

    private String productName;

    private float costPrice;

    private float amount;

    private float renewAmount;

    private float realAmount;

    private float subtotal;

    private float realSubtotal;

    @TableField(exist = false)
    private Float shuliang;

    @TableField(exist = false)
    private Procedure proceduring;

    @TableField(exist = false)
    private Proceduring proceduring2;
}
