package com.example.user.java_shopping_basket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/07/2017.
 */

public class ItemTest {

    Item item;

    @Before
    public void before(){
        item = new Item(ElectricalGoods.MOUSE);
    }

    @Test
    public void getValue(){
        assertEquals(19, item.electricalGoodsValue());
    }
}
