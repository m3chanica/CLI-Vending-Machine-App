package com.techelevator;

public class VendingMachineItem {

    //Declare properties
    private String productCode; //Ex. A1, B2
    private String productName; //Ex. Yellow Duck, Black Cat
    private double productPrice;
    private int quantityInStock;

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

    public double getProductPrice() {
        return this.productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    private int getQuantityInStock() {
        return this.quantityInStock;
    }
    private void setQuantityInStock() {
        this.quantityInStock = quantityInStock;
    }


    //Constructors
    public VendingMachineItem() {}

    public VendingMachineItem(String productCode, double productPrice, String productName, int quantityInStock) {
        this.productCode = productCode;
        this.productPrice = productPrice;
        this.productName = productName;
        this.quantityInStock = quantityInStock;
    }


}
