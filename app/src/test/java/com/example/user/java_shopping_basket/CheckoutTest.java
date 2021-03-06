package com.example.user.java_shopping_basket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/07/2017.
 */

public class CheckoutTest {
    ShoppingBasket basket;
    Customer customer;

    @Before
    public void before(){
        this.basket = new ShoppingBasket();
        this.customer = new Customer();
    }

    @Test
    public void totalCostOfBasket(){
        this.basket.addItem(new Item(ElectricalGoods.LAPTOP));
        this.basket.addItem(new Item(ElectricalGoods.MONITOR));
        this.basket.addItem(new Item(ElectricalGoods.SPEAKERS));
        Checkout testCheckout = new Checkout(this.basket, this.customer);
        assertEquals(1133, testCheckout.totalBasketValue());
    }

    @Test
    public void sameItemsAreBOGOF(){
        this.basket.addItem(new Item(ElectricalGoods.LAPTOP));
        this.basket.addItem(new Item(ElectricalGoods.LAPTOP));
        Checkout testCheckout = new Checkout(this.basket, this.customer);
        assertEquals(899, testCheckout.buyOneGetOneFree(this.basket.getContents().get(0), this.basket.getContents().get(1)));
    }

//    this test should pass - no differences between expected and actual?
    @Test
    public void shouldTakeTenPercentOff(){
        this.basket.addItem(new Item(ElectricalGoods.DESKTOP));
        Checkout testCheckout = new Checkout(this.basket, this.customer);
        assertEquals(989.1, testCheckout.tenPercentOffWhenTotalIsTwentyOrOver());
    }

//    this test should also pass - no difference between expected and actual!
    @Test
    public void shouldTakeTwoPercentOffIfCustomerHasLoyaltyCard(){
        this.basket.addItem(new Item(ElectricalGoods.DESKTOP));
        Checkout testCheckout = new Checkout(this.basket, this.customer);
        assertEquals(1077.02, testCheckout.twoPercentOffWhenCustomerHasLoyaltyCard());
    }

    @Test
    public void shouldApplyAllDiscounts(){
        this.basket.addItem(new Item(ElectricalGoods.MOUSE));
        this.basket.addItem(new Item(ElectricalGoods.MOUSE));
        Checkout testCheckout = new Checkout(this.basket, this.customer);
        assertEquals(19, testCheckout.buyOneGetOneFree(this.basket.getContents().get(0), this.basket.getContents().get(0)));
        this.basket.addItem((new Item(ElectricalGoods.KEYBOARD)));
        this.basket.addItem((new Item(ElectricalGoods.MONITOR)));
        assertEquals(236.7, testCheckout.tenPercentOffWhenTotalIsTwentyOrOver());
        assertEquals(231.97, testCheckout.twoPercentOffWhenCustomerHasLoyaltyCard());

    }

}
