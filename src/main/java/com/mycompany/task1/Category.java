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
public class Category {
    private String categoryName = null;
    private int id;
    private static int counter;
    private static List<Category> categories = new ArrayList<>();
    
    public Category(String cn){
        this.categoryName = cn;
        this.id = counter++;
        categories.add(this);
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
    
    public static Category[] getCategories(){
        Category[] result = new Category[categories.size()];
        for (int k = 0; k < categories.size(); k++){
           result[k] = categories.get(k);     
        }
        return result;
    } 
}
