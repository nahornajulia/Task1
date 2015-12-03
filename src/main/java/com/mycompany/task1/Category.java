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
    private static int counter = 0;
    private static List<Category> categories = new ArrayList<>();
    private List<Item> item = new ArrayList<>();    
    
    public Category(String catName){
        this.categoryName = catName;
        this.id = counter+=1;
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
   
    public static List<Category> getCategories(){
        return categories;
    } 

    
    @Override
    public String toString(){
        return categoryName;
    }
    
     
    public List<Item> getItems(){
    return item;
    }
    
    public void addItem(Item it){
        item.add(it);
    }

    public void deleteItem(Item it){
        item.remove(it);
    }

    
    
    
}
