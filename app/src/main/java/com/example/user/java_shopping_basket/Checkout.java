package com.example.user.java_shopping_basket;

import java.util.ArrayList;

/**
 * Created by user on 22/07/2017.
 */

public class Checkout {
    private ShoppingBasket basket;
    private Customer customer;
    private ElectricalGoods electricalGoods;

    public Checkout(ShoppingBasket _basket){
        this.basket = _basket;
    }

    public int totalBasketValue(){
        int counter = 0;
        for(Item item : basket.getContents()){
            counter += item.electricalGoodsValue();
        }
        return counter;
    }

    public int buyOneGetOneFree(Item item1, Item item2){
        int counter = 0;
        if(item1.electricalGoodsValue() == item2.electricalGoodsValue()){
            counter += item1.electricalGoodsValue() + item2.electricalGoodsValue();
            counter /= 2;
            return counter;
        }
        else return item1.electricalGoodsValue() + item2.electricalGoodsValue();
    }

    public float tenPercentOffWhenTotalIsTwentyOrOver(){
        float total = totalBasketValue();
        float totalWithDiscount = 0;
        if(totalBasketValue() >= 20){
            totalWithDiscount += totalBasketValue() * (10.0f/100.0f);
            return total -= totalWithDiscount;
        }
        else return total;
    }

    public float twoPercentOffWhenCustomerHasLoyaltyCard(){
        float total = totalBasketValue();
        float totalWithDiscount = 0;
        if(customer.hasLoyaltyCard() == true){
            totalWithDiscount += totalBasketValue() * (2.0f/100.0f);
            return total -= totalWithDiscount;
        }
        else return total;
    }


}