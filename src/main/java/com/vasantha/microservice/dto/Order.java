package com.vasantha.microservice.dto;

import java.io.Serializable;

public class Order implements Serializable {
    private static final long serialVersionUID=1L;

    private int orderId;

    private String orderDate;

    private int purchaseAmt;

    private Person person;


    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getPurchaseAmt() {
        return purchaseAmt;
    }

    public void setPurchaseAmt(int purchaseAmt) {
        this.purchaseAmt = purchaseAmt;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


}
