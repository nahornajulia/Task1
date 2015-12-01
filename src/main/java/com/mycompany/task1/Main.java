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
public class Main {
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
        System.out.println(item1.getItemId());
        Item item2 = new Item("sofa", category3);
        System.out.println(item2.getItemId());
        Item item3 = new Item("oven", category2);
        System.out.println(item3.getItemId());
        Item item4 = new Item("glue", category1);
        System.out.println(item4.getItemId());
        item1 = new Item("table", category2);
        System.out.println(item1.getItemId());

        Customer.addCustomer(c2);
        Order.addOrder(order1);

        Item.addItem(item1);
        Item.addItem(item2);
        Item.addItem(item3);

        Order.addOrder(order2);
        Item.addItem(item4);
        
        order1.addItem(item4);
        order1.addItem(item2);
        
        order2.addItem(item3);
        order2.addItem(item1);

        System.out.println("Printing result: " + Order.getListOfItems());

    }
}
