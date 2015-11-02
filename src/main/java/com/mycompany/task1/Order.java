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
public class Order implements Comparable<Order>{
    
    private final Customer customer;
    private final int serialNum;

    public Order (Customer customer, int serialNum){
        this.customer = customer;
        this.serialNum = serialNum;
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public int getSerialNum() {
        return serialNum;
    }

    @Override
    public int compareTo(Order o) {
       if(serialNum > o.getSerialNum()){
           return 1;
       }else if(serialNum < o.getSerialNum()){
           return -1;
       } else {return 0;}
    }
  
    
}
