package com.Debtly10.DTOS;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

public class MortgageRegistrationDTO {

    private String productName;

    private float marketValue;

    private float givenAmount;

    private float leftAmount;

    private Date issueDate;

    private Date lastPaid;

    public MortgageRegistrationDTO(

            @JsonProperty("productName") String productName,
            @JsonProperty("marketValue") float marketValue,
            @JsonProperty("givenAmount") float givenAmount,
            @JsonProperty("leftAmount") float leftAmount,
            @JsonProperty("issueDate") Date issueDate,
            @JsonProperty("lastPaid") Date lastPaid) {
        this.productName = productName;
        this.marketValue = marketValue;
        this.givenAmount = givenAmount;
        this.leftAmount = leftAmount;
        this.issueDate = issueDate;
        this.lastPaid = lastPaid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(float marketValue) {
        this.marketValue = marketValue;
    }

    public float getGivenAmount() {
        return givenAmount;
    }

    public void setGivenAmount(float givenAmount) {
        this.givenAmount = givenAmount;
    }

    public float getLeftAmount() {
        return leftAmount;
    }

    public void setLeftAmount(float leftAmount) {
        this.leftAmount = leftAmount;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getLastPaid() {
        return lastPaid;
    }

    public void setLastPaid(Date lastPaid) {
        this.lastPaid = lastPaid;
    }
}
