package com.mycompany.task1;

import java.util.ArrayList;
import java.util.LinkedList;
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
//  private List<Item> item = new ArrayList<>();    
    
    public Category(String catName){
        this.categoryName = catName;
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
 
//dont create array    
//    public static Category[] getCategories(){
//        Category[] result = new Category[categories.size()];
//        for (int k = 0; k < categories.size(); k++){
//           result[k] = categories.get(k);     
//        }
//        return result;
//    } 
//    public static Category[] getCategories(){
//     
//    }
    
//Do not create temprorary array, just get Items from static List<Item>  field   
//    public Item[] getItems(){
//        List<Item> temprorary = new LinkedList<>();
//          for (Item i : Item.getItems()){
//              if(i.getCategory().getId() == id){
//                  temprorary.add(i);
//              }
//        }
//          Item[] result = new Item[temprorary.size()];
//          for (int u = 0; u < temprorary.size(); u++){
//              result[u] = temprorary.get(u);
//          }
//        return result;
//    }
    
    public void addItem(Item it){
        it.setCategory(this);
    }
//Delete items from the list
//    public void deleteItem(Item it){
//        if(it.getCategory().id == id) {
//            it.setCategory(null);
//        }
//    }
    
}
