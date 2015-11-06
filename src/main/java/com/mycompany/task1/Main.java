/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author julia
 */
public class Main {

    public Main() {
        this.categories = new TreeSet<Category>();
        this.items = new TreeSet<Item>();
        this.io = new ArrayList<ItemOrder>();
        this.customers = new TreeSet<Customer>();
        this.orders = new TreeSet<Order>();
    }

    Set<Category> categories;
    Set<Item> items;
    Set<Order> orders;
    Set<Customer> customers;
    ArrayList<ItemOrder> io;

    public void addCustomer(Customer cus) {
        customers.add(cus);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItemOrder(int itemId, int orderId) {
        ItemOrder itemOrder = new ItemOrder(itemId, orderId);
        io.add(itemOrder);
    }

    public List<Item> getItemsByOrder(Order o) {
        List<Item> result = new ArrayList<Item>();
        for (ItemOrder myIo : io) {
            if (myIo.getOrderId() == o.getSerialNum()) {
                for (Item i : items) {
                    if (i.getItemId() == myIo.getItemId()) {
                        result.add(i);
                    }
                }
            }
        }
     return result;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Customer c1 = new Customer("Julia", 0);
        Customer c2 = new Customer("Maks", 1);

        Order order1 = new Order(c1, 1000);
        Order order2 = new Order(c1, 1001);

        Category category1 = new Category("Building materials", 0);
        Category category2 = new Category("Electricity", 1);
        Category category3 = new Category("Furniture", 2);

        Item item1 = new Item("brick", category1, 0);
        Item item2 = new Item("sofa", category3, 1);
        Item item3 = new Item("oven", category2, 2);
        Item item4 = new Item("glue", category1, 3);

        m.addCustomer(c2);
        m.addOrder(order1);
 
        m.addItemOrder(item1.getItemId(), order1.getSerialNum());
        m.addItemOrder(item2.getItemId(), order1.getSerialNum());
        m.addItemOrder(item3.getItemId(), order1.getSerialNum());
 
        m.addItem(item1);
        m.addItem(item2);
        m.addItem(item3);
        

        m.addOrder(order2);
        m.addItem(item4);
        m.addItemOrder(item4.getItemId(), order2.getSerialNum());
        m.addItemOrder(item1.getItemId(), order2.getSerialNum());
        m.addItemOrder(item2.getItemId(), order2.getSerialNum());
        
        
        
        
        System.out.println("Printing result of the current order: " + order1.getSerialNum());
        List<Item> itemsByOrder = m.getItemsByOrder(order1);
        for (Item printAll : itemsByOrder){
            System.out.println(printAll.getItemName());
        }
        
         System.out.println("Printing result of the current order: " + order2.getSerialNum());
        List<Item> itemsByOrder2 = m.getItemsByOrder(order2);
        for (Item printAll : itemsByOrder2){
            System.out.println(printAll.getItemName());
        }

    }
}
