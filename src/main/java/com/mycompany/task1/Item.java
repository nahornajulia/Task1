/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task1;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author julia
 */
public class Item implements Comparable<Item> {

    private String itemName;
    private Category cat;
    private int itemId;
    private static Set<Item> items = new TreeSet<Item>();

    public Item(String itemName, Category cat, int itemId) {
        this.cat = cat;
        this.itemId = itemId;
        this.itemName = itemName;
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

    public void setCategory(Category cat) {
        this.cat = cat;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public static void addItem(Item item) {
        items.add(item);
    }
public static Set<Item> getItems(){
    return items;
}
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.itemName);
        hash = 53 * hash + this.itemId;
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
        final Item other = (Item) obj;
        if (this.itemId != other.itemId) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Item o) {
        if (itemId > o.getItemId()) {
            return 1;
        } else if (itemId < o.getItemId()) {
            return -1;
        } else {
            return 0;
        }
    }

}
