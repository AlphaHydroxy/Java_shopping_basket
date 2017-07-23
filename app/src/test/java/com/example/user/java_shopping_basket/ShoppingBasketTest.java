package com.example.user.java_shopping_basket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 21/07/2017.
 */

public class ShoppingBasketTest {

    ShoppingBasket basket;

    @Before
    public void setup(){
        basket = new ShoppingBasket();
    }

    @Test
    public void basketIsEmptyy(){
        assertEquals(0, basket.capacity());
    }

    @Test
    public void basketShouldHaveOneItem(){
        this.basket.addItem(new Item(ElectricalGoods.KEYBOARD));
        assertEquals(1, basket.capacity());
    }

    @Test
    public void removeAllFromBasket(){
        this.basket.addItem(new Item(ElectricalGoods.DESKTOP));
        this.basket.addItem(new Item(ElectricalGoods.PRINTER));
        assertEquals(2, basket.capacity());
        this.basket.emptyBasket();
        assertEquals(0, basket.capacity());
    }

    @Test
    public void basketTotal_shouldBe1178(){
        this.basket.addItem(new Item(ElectricalGoods.DESKTOP));
        this.basket.addItem(new Item(ElectricalGoods.PRINTER));
        assertEquals(1178, basket.basketTotal());
    }

}
