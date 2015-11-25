/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task1;

import java.util.List;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author julia
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of addCustomer method, of class Main.
     */
    @org.junit.Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        Customer c3 = new Customer("Dan", 56);
        Customer.addCustomer(c3);
    }

    /**
     * Test of addOrder method, of class Main.
     */
    @org.junit.Test
    public void testAddOrder() {
        System.out.println("addOrder");
        Customer c3 = new Customer("Dan", 56);
        Customer.addCustomer(c3);
        Order order3 = new Order(c3, 12);
        Order.addOrder(order3);
    }

    /**
     * Test of addItem method, of class Main.
     */
    @org.junit.Test
    public void testAddItem() {
        System.out.println("addItem");
        Category category1 = new Category("Building materials", 0);
        Item item5 = new Item("brash", category1, 0);
        Item.addItem(item5);
    }

    /**
     * Test of addItemOrder method, of class Main.
     */
    @org.junit.Test
    public void testAddItemOrder() {
        System.out.println("addItemOrder");
        Category category1 = new Category("Building materials", 0);
        Item item5 = new Item("brash", category1, 0);
        Customer c3 = new Customer("Dan", 56);
        Order order3 = new Order(c3, 12);
        ItemOrder.addItemOrder(item5, order3);
    }
//
//    /**
//     * Test of getItemsByOrder method, of class Main.
//     */
//    @org.junit.Test
//    public void testGetItemsByOrder() {
//        System.out.println("getItemsByOrder");
//        Order o = null;
//        Main instance = new Main();
//        List<Item> expResult = null;
//        List<Item> result = instance.getItemsByOrder(o);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getOrdersByItem method, of class Main.
//     */
//    @org.junit.Test
//    public void testGetOrdersByItem() {
//        System.out.println("getOrdersByItem");
//        Item i = null;
//        Main instance = new Main();
//        List<Order> expResult = null;
//        List<Order> result = instance.getOrdersByItem(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getItemsByCustomer method, of class Main.
//     */
//    @org.junit.Test
//    public void testGetItemsByCustomer() {
//        System.out.println("getItemsByCustomer");
//        Customer c = null;
//        Main instance = new Main();
//        List<Item> expResult = null;
//        List<Item> result = instance.getItemsByCustomer(c);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getItemsByCategory method, of class Main.
//     */
//    @org.junit.Test
//    public void testGetItemsByCategory() {
//        System.out.println("getItemsByCategory");
//        Category cat = null;
//        Main instance = new Main();
//        List<Item> expResult = null;
//        List<Item> result = instance.getItemsByCategory(cat);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of main method, of class Main.
//     */
//    @org.junit.Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Main.main(args);
//    }
    
}
