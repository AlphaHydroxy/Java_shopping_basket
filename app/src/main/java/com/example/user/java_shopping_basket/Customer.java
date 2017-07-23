package com.example.user.java_shopping_basket;

/**
 * Created by user on 23/07/2017.
 */

public class Customer {

    public Customer(boolean _hasLoyaltyCard) {
        this.hasLoyaltyCard = _hasLoyaltyCard;
    }

    private boolean hasLoyaltyCard;

    public Customer() {

    }

    public boolean hasLoyaltyCard(){
       return this.hasLoyaltyCard;
    }

    public void setHasLoyaltyCard(boolean hasLoyaltyCard) {
        this.hasLoyaltyCard = hasLoyaltyCard;
    }
}

