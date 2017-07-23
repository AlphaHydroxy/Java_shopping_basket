package com.example.user.java_shopping_basket;

import java.util.ArrayList;

/**
 * Created by user on 21/07/2017.
 */

public class ShoppingBasket {

    private ArrayList<Item> items;

    public ShoppingBasket(){
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getContents(){
        return this.items;
    }

    public int capacity(){
        return items.size();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void emptyBasket(){
        items.clear();
    }

    public int basketTotal(){
        int counter = 0;
        for(Item item : items){
            counter += item.electricalGoodsValue();
        }
        return counter;
    }
}
