/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julia
 */
public class Item {

    private String itemName;
    private Category cat;
    private final int itemId;
    private static int counter;
    private static List<Item> items = new ArrayList<>();

//Okay
    public Item(String itemName, Category cat) {
        this.cat = cat;
        this.itemId = counter++;
        this.itemName = itemName;
        addItem(this);      
    } 

//Okay
    public String getItemName() {
        return itemName;
    }

//Okay
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    
//Okay
    public Category getCategory() {
        return cat;
    }
    
//setCategory -> changeCategory
//    public void setCategory(Category cat) {
//        this.cat = cat;
//    }

//Okay
    public int getItemId() {
        return itemId;
    }

//Okay
    public static void addItem(Item item) {
        items.add(item);
    }
    
//get Item from List directly, dont need to create an array
//    public static Item[] getItems(){
//    Item[] result = new Item[items.size()];
//    for (int h = 0; h < items.size();h++){
//       result[h] = items.get(h);
//    }
//    return result;
//}
    
    }
