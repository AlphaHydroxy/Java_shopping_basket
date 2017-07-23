package com.example.user.java_shopping_basket;

/**
 * Created by user on 21/07/2017.
 */

public enum ElectricalGoods {

    PRINTER(79),
    KEYBOARD(45),
    MOUSE(19),
    MONITOR(199),
    LAPTOP(899),
    DESKTOP(1099),
    SPEAKERS(35);

    int value;

    ElectricalGoods(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
