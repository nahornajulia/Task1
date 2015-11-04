/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task1;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author julia
 */
public class Order implements Comparable<Order>{
    
    private final Customer customer;
    private final int serialNum;    
    private static Set<Order> orders = new TreeSet<Order>();
    
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

    public static void addOrder(Order order) {
        orders.add(order);
    }
    
    @Override
    public int compareTo(Order o) {
       if(serialNum > o.getSerialNum()){
           return 1;
       }else if(serialNum < o.getSerialNum()){
           return -1;
       } else {return 0;}
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.customer);
        hash = 53 * hash + this.serialNum;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (this.serialNum != other.serialNum) {
            return false;
        }
        return true;
    }
  
    
}
