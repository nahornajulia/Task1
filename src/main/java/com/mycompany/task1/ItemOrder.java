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
public class ItemOrder {
    private final Item item;
    private final Order order;
    
    public ItemOrder(Item item, Order order){
        this.item = item;
        this.order = order;
    }
    
    public Item getItem(){
        return item;
    }
    
    public Order getOrder(){
        return order;
    }
    
    
    
}
