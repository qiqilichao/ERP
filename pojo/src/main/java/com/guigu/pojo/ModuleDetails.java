package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;



@Data
@TableName("d_module_details")
public class ModuleDetails extends Module {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String productId;

    private String productName;

    private String type;

    private String productDescribe;

    private String amountUnit;

    private Integer amount;

    private Integer residualAmount;

    private Float costPrice;

    private Float subtotal;
}
