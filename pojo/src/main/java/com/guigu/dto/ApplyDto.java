package com.guigu.dto;



public class ApplyDto {

   private String  designer;
   private String  remark;
   private String  register;
   private String  registerTime;


    public ApplyDto(String designer, String remark, String register, String registerTime) {
        this.designer = designer;
        this.remark = remark;
        this.register = register;
        this.registerTime = registerTime;
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

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }
}
