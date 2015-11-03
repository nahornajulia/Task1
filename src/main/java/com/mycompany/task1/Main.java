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
        this.categories = new TreeSet<>();
        this.items = new TreeSet<>();
        this.io = new ArrayList<>();
        this.customers = new TreeSet<>();
        this.orders = new TreeSet<>();
        this.ic = new ArrayList<>();
    }

    Set<Category> categories;
    Set<Item> items;
    Set<Order> orders;
    Set<Customer> customers;
    ArrayList<ItemOrder> io;
    ArrayList<ItemCustomer> ic;

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

    public void addItemCustomer(int itemId, int customerId) {
        ItemCustomer itemCustomer = new ItemCustomer(itemId, customerId);
        ic.add(itemCustomer);
    }

    public List<Item> getItemsByOrder(Order o) {
        List<Item> result = new ArrayList<>();
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

    public List<Item> getItemsByCustomer(Customer c) {
        List<Item> resultByCustomers = new ArrayList<>();
        for (ItemCustomer myIc : ic) {
            if (myIc.getCustomId() == c.getCustomId()) {
                for (Item i : items) {
                    if (i.getItemId() == myIc.getItemId()) {
                        resultByCustomers.add(i);
                    }
                }
            }
        }
        return resultByCustomers;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Customer c1 = new Customer("Jennifer", 0);
        Customer c2 = new Customer("John", 1);

        Order order1 = new Order(c1, 1000);

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
        m.addItem(item4);
        
        m.addItemCustomer(item4.getItemId(), c1.getCustomId());
        m.addItemCustomer(item1.getItemId(), c1.getCustomId());
        m.addItemCustomer(item2.getItemId(), c1.getCustomId());

        //The list of items by Order
        System.out.println("Printing result of the order #1: " + order1.getSerialNum());
        List<Item> itemsByOrder = m.getItemsByOrder(order1);
        for (Item printAll : itemsByOrder) {
            System.out.println(printAll.getItemName());
        }

        //The List of items by Customers
        System.out.println("The list of items of customer: " + c1.getCustomName());
        List<Item> itemsByCustomer = m.getItemsByCustomer(c1);
        for (Item print : itemsByCustomer) {
            System.out.println(print.getItemName());
        }
    }
}
