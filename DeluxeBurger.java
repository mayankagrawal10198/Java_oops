package com.company;

public class DeluxeBurger extends Burger implements AddItems {
    public DeluxeBurger(String meatType, int basePrice) {
        super(meatType, basePrice);
        super.addAdditionalBaseItems(new AdditionalItem("chips", 45));
        super.addAdditionalBaseItems(new AdditionalItem("cold drink", 195));
    }

    @Override
    public boolean addAdditionalBaseItems(AdditionalItem item) {
        return false;
    }

    @Override
    public boolean addAdditionalHealthyItems(AdditionalItem item) {
        return false;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
