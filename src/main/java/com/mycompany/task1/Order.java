/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task1;

/**
 *
 * @author julia
 */
public class Order {
    
    private final Customer customer;
    private String serialNum;

    public Order(Customer customer) {
        this.customer = customer;
    }

    
    
    public Customer getCustomer() {
        return customer;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }
    
    
}
