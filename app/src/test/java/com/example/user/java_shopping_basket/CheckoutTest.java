package com.example.user.java_shopping_basket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/07/2017.
 */

public class CheckoutTest {
    ShoppingBasket basket;

    @Before
    public void before(){
        this.basket = new ShoppingBasket();
    }

    @Test
    public void totalCostOfBasket(){
        this.basket.addItem(new Item(ElectricalGoods.LAPTOP));
        this.basket.addItem(new Item(ElectricalGoods.MONITOR));
        this.basket.addItem(new Item(ElectricalGoods.SPEAKERS));
        Checkout testCheckout = new Checkout(this.basket);
        assertEquals(1133, testCheckout.totalBasketValue());
    }

    @Test
    public void sameItemsAreBOGOF(){
        this.basket.addItem(new Item(ElectricalGoods.LAPTOP));
        this.basket.addItem(new Item(ElectricalGoods.LAPTOP));
        Checkout testCheckout = new Checkout(this.basket);
        assertEquals(899, testCheckout.buyOneGetOneFree(this.basket.getContents().get(0), this.basket.getContents().get(1)));
    }

//    @Test
//    public void shouldTakeTenPercentOff(){
//        this.basket.addItem(new Item(ElectricalGoods.DESKTOP));
//        Checkout testCheckout = new Checkout(this.basket);
//        assertEquals(989.1, testCheckout.tenPercentOffWhenTotalIsTwentyOrOver());
//    }

    @Test
    public void shouldTakeTwoPercentOffIfCustomerHasLoyaltyCard(){
        this.basket.addItem(new Item(ElectricalGoods.DESKTOP));
        Checkout testCheckout = new Checkout(this.basket);
        assertEquals(989.1, testCheckout.twoPercentOffWhenCustomerHasLoyaltyCard());
    }

}
