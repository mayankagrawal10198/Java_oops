package com.company;

import java.util.ArrayList;
import java.util.List;

public class Burger implements AddItems{
    private String breadType, meatType;
    private List<AdditionalItem> additionalItems;
    private int Price;

    public Burger(String meatType, int basePrice) {
        this.meatType = meatType;
        this.additionalItems = new ArrayList<>();
        this.Price = basePrice;
        this.breadType = "White Bread";
    }

    @Override
    public boolean addAdditionalBaseItems(AdditionalItem item) {
        if(additionalItems.size()<4) {
            additionalItems.add(item);
            this.Price += item.getPrice();
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean addAdditionalHealthyItems(AdditionalItem item) {
        return false;
    }

    public int getPrice() {
        return Price;
    }
}
