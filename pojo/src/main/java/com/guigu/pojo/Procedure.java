package com.guigu.pojo;

import java.math.BigDecimal;

public class Procedure {
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String procedureId;

    private String procedureName;

    private BigDecimal labourHourAmount;

    private BigDecimal realLabourHourAmount;

    private BigDecimal subtotal;

    private BigDecimal realSubtotal;

    private BigDecimal moduleSubtotal;

    private BigDecimal realModuleSubtotal;

    private BigDecimal costPrice;

    private BigDecimal demandAmount;

    private BigDecimal realAmount;

    private String procedureFinishTag;

    private String procedureTransferTag;

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

    public BigDecimal getRealLabourHourAmount() {
        return realLabourHourAmount;
    }

    public void setRealLabourHourAmount(BigDecimal realLabourHourAmount) {
        this.realLabourHourAmount = realLabourHourAmount;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getRealSubtotal() {
        return realSubtotal;
    }

    public void setRealSubtotal(BigDecimal realSubtotal) {
        this.realSubtotal = realSubtotal;
    }

    public BigDecimal getModuleSubtotal() {
        return moduleSubtotal;
    }

    public void setModuleSubtotal(BigDecimal moduleSubtotal) {
        this.moduleSubtotal = moduleSubtotal;
    }

    public BigDecimal getRealModuleSubtotal() {
        return realModuleSubtotal;
    }

    public void setRealModuleSubtotal(BigDecimal realModuleSubtotal) {
        this.realModuleSubtotal = realModuleSubtotal;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getDemandAmount() {
        return demandAmount;
    }

    public void setDemandAmount(BigDecimal demandAmount) {
        this.demandAmount = demandAmount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public String getProcedureFinishTag() {
        return procedureFinishTag;
    }

    public void setProcedureFinishTag(String procedureFinishTag) {
        this.procedureFinishTag = procedureFinishTag == null ? null : procedureFinishTag.trim();
    }

    public String getProcedureTransferTag() {
        return procedureTransferTag;
    }

    public void setProcedureTransferTag(String procedureTransferTag) {
        this.procedureTransferTag = procedureTransferTag == null ? null : procedureTransferTag.trim();
    }
}
