package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DesignProcedureDetails {
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String procedureId;

    private String procedureName;

    private BigDecimal labourHourAmount;

    private String procedureDescribe;

    private String amountUnit;

    private BigDecimal costPrice;

    private BigDecimal subtotal;

    private BigDecimal moduleSubtotal;

    private String register;

    private Date registerTime;

    private String designModuleTag;

    private String designModuleChangeTag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getDetailsNumber() {
        return detailsNumber;
    }

    public void setDetailsNumber(Integer detailsNumber) {
        this.detailsNumber = detailsNumber;
    }

    public String getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(String procedureId) {
        this.procedureId = procedureId == null ? null : procedureId.trim();
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName == null ? null : procedureName.trim();
    }

    public BigDecimal getLabourHourAmount() {
        return labourHourAmount;
    }

    public void setLabourHourAmount(BigDecimal labourHourAmount) {
        this.labourHourAmount = labourHourAmount;
    }

    public String getProcedureDescribe() {
        return procedureDescribe;
    }

    public void setProcedureDescribe(String procedureDescribe) {
        this.procedureDescribe = procedureDescribe == null ? null : procedureDescribe.trim();
    }

    public String getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(String amountUnit) {
        this.amountUnit = amountUnit == null ? null : amountUnit.trim();
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getModuleSubtotal() {
        return moduleSubtotal;
    }

    public void setModuleSubtotal(BigDecimal moduleSubtotal) {
        this.moduleSubtotal = moduleSubtotal;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getDesignModuleTag() {
        return designModuleTag;
    }

    public void setDesignModuleTag(String designModuleTag) {
        this.designModuleTag = designModuleTag == null ? null : designModuleTag.trim();
    }

    public String getDesignModuleChangeTag() {
        return designModuleChangeTag;
    }

    public void setDesignModuleChangeTag(String designModuleChangeTag) {
        this.designModuleChangeTag = designModuleChangeTag == null ? null : designModuleChangeTag.trim();
    }
}
