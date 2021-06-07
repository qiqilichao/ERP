package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Proceduring {
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String procedureId;

    private String procedureName;

    private BigDecimal labourHourAmount;

    private BigDecimal costPrice;

    private BigDecimal subtotal;

    private String procedureDescribe;

    private BigDecimal regCount;

    private String procedureResponsiblePerson;

    private String register;

    private Date registerTime;

    private String checker;

    private Date checkTime;

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

    public String getProcedureDescribe() {
        return procedureDescribe;
    }

    public void setProcedureDescribe(String procedureDescribe) {
        this.procedureDescribe = procedureDescribe == null ? null : procedureDescribe.trim();
    }

    public BigDecimal getRegCount() {
        return regCount;
    }

    public void setRegCount(BigDecimal regCount) {
        this.regCount = regCount;
    }

    public String getProcedureResponsiblePerson() {
        return procedureResponsiblePerson;
    }

    public void setProcedureResponsiblePerson(String procedureResponsiblePerson) {
        this.procedureResponsiblePerson = procedureResponsiblePerson == null ? null : procedureResponsiblePerson.trim();
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

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }
}
