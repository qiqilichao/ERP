package com.guigu.pojo;

import java.math.BigDecimal;

public class ProcedureModule {
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String productId;

    private String productName;

    private BigDecimal costPrice;

    private BigDecimal amount;

    private BigDecimal renewAmount;

    private BigDecimal realAmount;

    private BigDecimal subtotal;

    private BigDecimal realSubtotal;

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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRenewAmount() {
        return renewAmount;
    }

    public void setRenewAmount(BigDecimal renewAmount) {
        this.renewAmount = renewAmount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
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
}
