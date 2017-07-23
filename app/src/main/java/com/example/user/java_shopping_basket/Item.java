package com.example.user.java_shopping_basket;

/**
 * Created by user on 21/07/2017.
 */

public class Item {

    private ElectricalGoods electricalGoods;

    public Item(ElectricalGoods valueOfGoods){
        this.electricalGoods = valueOfGoods;
    }

    public ElectricalGoods getElectricalGoods() {
        return electricalGoods;
    }

    public int electricalGoodsValue(){
        return this.electricalGoods.getValue();
    }
}
