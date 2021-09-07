package com.company;

import java.util.ArrayList;
import java.util.List;

public class HealthyBurger extends Burger implements AddItems{
    private List<AdditionalItem> additionalHealthyItems;
    private int price = 0;
    public HealthyBurger(String meatType, int basePrice) {
        super(meatType, basePrice);
        additionalHealthyItems = new ArrayList<>();
    }

    @Override
    public boolean addAdditionalBaseItems(AdditionalItem item) {
        return super.addAdditionalBaseItems(item);
    }

    @Override
    public boolean addAdditionalHealthyItems(AdditionalItem item) {
        if(additionalHealthyItems.size()<2) {
            additionalHealthyItems.add(item);
            price += item.getPrice();
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int getPrice() {
        return price + super.getPrice();
    }
}
