/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task1;

/**
 *
 * @author ynahorna
 */
public class ItemCustomer {
    
    private int customId;
    private int itemId;
    
    public ItemCustomer(int itemId, int customerId){
        this.itemId = itemId;
        this.customId = customerId;
    }
    
    public int getCustomId(){
        return customId;
    }
    
    public int getItemId(){
        return itemId;
    }
}
