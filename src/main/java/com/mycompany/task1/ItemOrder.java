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
public class ItemOrder {

    private final Item item;
    private final Order order;
    private static List<ItemOrder> io = new ArrayList<ItemOrder>();

    public ItemOrder(Item item, Order order) {
        this.item = item;
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public Order getOrder() {
        return order;
    }

    public static void addItemOrder(Item item, Order order) {
        ItemOrder itemOrder = new ItemOrder(item, order);
        io.add(itemOrder);
    }
    public static List<ItemOrder> getItemOrderList(){
        return io;
    }
}
