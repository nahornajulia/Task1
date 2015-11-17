/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task1;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author julia
 */
public class Category {
    private String categoryName;
    private int id;
    private static int counter;
    private static Set<Category> categories = new TreeSet<Category>();
    
    public Category(String categoryName){
        this.categoryName = categoryName;
        this.id = counter++;
    }
    
    public String getName(){
        return categoryName;
}
    
    public void setName(String name){
         this.categoryName = name;        
    }
    
    public int getId(){
        return id;
    }   
    
}
