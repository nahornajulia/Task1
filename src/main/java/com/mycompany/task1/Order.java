/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task1;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author julia
 */
public class Order {
    
    private final Customer customer;
    private final int serialNum;    
    private static int counter;
    private static Set<Order> orders = new TreeSet<Order>();
    
    public Order (Customer customer){
        this.customer = customer;
        this.serialNum = counter++;
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
  
    
}
