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
public class Main {


    public List<Order> getOrdersByItem(Item i) {
        List<Order> result = new LinkedList<Order>();
        for (ItemOrder myIo : ItemOrder.getItemOrderList()) {
            if (myIo.getItem().equals(i)) {
                result.add(myIo.getOrder());
            }
        }
        return result;
    }

    public List<Item> getItemsByCustomer(Customer c) {
        List<Item> result = new LinkedList<Item>();
        for (ItemOrder myIo : ItemOrder.getItemOrderList()) {
            if (myIo.getOrder().getCustomer().equals(c)) {
                result.add(myIo.getItem());
            }
        }
        return result;

    }

    public List<Item> getItemsByCategory(Category cat) {
        List<Item> result = new ArrayList<Item>();
        for (Item myIo : Item.getItems()) {
            if (myIo.getCategory().equals(cat)){
                result.add(myIo);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Merry");

        Order order1 = new Order(c1);
        Order order2 = new Order(c1);

        Category category1 = new Category("Building materials");
        Category category2 = new Category("Electricity");
        Category category3 = new Category("Furniture");

        Item item1 = new Item("brick", category1);
        Item item2 = new Item("sofa", category3);
        Item item3 = new Item("oven", category2);
        Item item4 = new Item("glue", category1);

        Customer.addCustomer(c2);
        Order.addOrder(order1);

        Item.addItem(item1);
        Item.addItem(item2);
        Item.addItem(item3);

        Order.addOrder(order2);
        Item.addItem(item4);

        System.out.println("Printing result of the current customer: " + c1.getCustomName());
        List<Item> itemsByCustomer = m.getItemsByCustomer(c1);
        for (Item printAll : itemsByCustomer) {
            System.out.println(printAll.getItemName());
        }

    }
}
