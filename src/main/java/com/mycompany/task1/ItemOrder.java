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
    private int itemId;
    private int orderId;
    
    public ItemOrder(int itemId, int orderId){
        this.itemId = itemId;
        this.orderId = orderId;
    }
    
    public int getItemId(){
        return itemId;
    }
    
    public int getOrderId(){
        return orderId;
    }
    
    
    
}
