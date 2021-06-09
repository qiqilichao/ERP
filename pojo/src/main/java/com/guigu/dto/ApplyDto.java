package com.guigu.dto;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ApplyDto {

   private String  designer;
   private String  remark;
   private String  register;
   @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private Date registerTime;
   private String amount;
   private String id;


    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }


    public ApplyDto(String designer, String remark, String register, Date registerTime, String amount, String id) {
        this.designer = designer;
        this.remark = remark;
        this.register = register;
        this.registerTime = registerTime;
        this.amount = amount;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ApplyDto{" +
                "designer='" + designer + '\'' +
                ", remark='" + remark + '\'' +
                ", register='" + register + '\'' +
                ", registerTime=" + registerTime +
                ", amount='" + amount + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
