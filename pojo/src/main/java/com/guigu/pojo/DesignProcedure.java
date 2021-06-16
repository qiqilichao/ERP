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
@TableName("m_design_procedure")
public class DesignProcedure {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String designId;

    private String firstKindId;

    private String firstKindName;

    private String secondKindId;

    private String secondKindName;

    private String thirdKindId;

    private String thirdKindName;

    private String productId;

    private String productName;

    private String procedureDescribe;

    private Float costPriceSum;

    private Float moduleCostPriceSum;

    @TableField("designer")
    private String designer1;

    @TableField("register")
    private String register1;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @TableField("register_time")
    private Date registerTime1;

    private String checker;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date checkTime;

    private String checkSuggestion;

    private String checkTag;

    private String changer;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date changeTime;

    private String changeTag;

    private String designModuleTag;

    private String designModuleChangeTag;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @TableField(exist = false)
    private Date date1;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @TableField(exist = false)
    private Date date2;

    @TableField(exist = false)
    public Dfile dfile;

    @TableField(exist = false)
    public Module module;
}
