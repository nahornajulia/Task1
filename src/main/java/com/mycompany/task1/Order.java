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
public class Order {
    
    private final Customer customer;
    private final int serialNum;    
    private static int counter = 0;
    private String itemName;
    private static List<Order> orders = new LinkedList<>();
    private static List<Item> item = new ArrayList<>();
     
    public Order (Customer customer){
        this.customer = customer;
        this.serialNum = counter += 1;
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
  
    public static List<Item> getListOfItems(){
        return item;
    }
    
    @Override
    public String toString(){
        return itemName;
    }
    
    public void addItem(Item i){
        item.add(i);
    }
    
    public void deleteItem(Item i){
        item.remove(i);
    }
}

