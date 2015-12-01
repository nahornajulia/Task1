/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author julia
 */
public class Customer {

    private final String customName;
    private final int customId;
    private static int counter; 
    private static List<Customer> customers = new ArrayList<>();
    private static List<Order> order = new LinkedList<>();
    
    public Customer(String customName){
        this.customId = counter++;
        this.customName = customName;
    }

    
    public String getCustomName() {
        return customName;
    }
    
    public int getCustomId() {
        return customId;
    }
    
    public static void addCustomer(Customer cus) {
        customers.add(cus);
    }

    public List<Order> getOrder(){
        return order;
    }
    
    public void addOrder(Order o){
        order.add(o);
    }
}
