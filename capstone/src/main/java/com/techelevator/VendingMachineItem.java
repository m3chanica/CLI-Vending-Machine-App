package com.techelevator;

import java.math.BigDecimal;

public class VendingMachineItem {

    //Declare properties
    private String productCode; //Ex. A1, B2
    private String productName; //Ex. Yellow Duck, Black Cat
    private BigDecimal productPrice;
    public Integer quantityInStock;

    //Declare constant for max # of each product
    private final int MAX_QUANTITY = 5;

    //Getters and Setters
    public String getProductCode() {
        return this.productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return this.productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return this.productPrice;
    }
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getQuantityInStock() {
        return this.quantityInStock;
    }
    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }


    //Constructors
    public VendingMachineItem() {}

    public VendingMachineItem(String productCode, String productName, BigDecimal productPrice, Integer quantityInStock) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantityInStock = quantityInStock;
    }


}
