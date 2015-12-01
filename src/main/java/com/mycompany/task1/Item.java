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

    public Item(String itemName, Category cat) {
        this.cat = cat;
        this.itemId = counter++;
        this.itemName = itemName;
        addItem(this);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Category getCategory() {
        return cat;
    }

    public void changeCategory(Category cat) {
        this.cat = cat;
    }

    public int getItemId() {
        return itemId;
    }

    public static void addItem(Item item) {
        items.add(item);
    }

    public static List<Item> getItems() {
        return items;
    }
    
    @Override
    public String toString(){
        return itemName;
    }
}
