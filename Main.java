package com.company;

public class Main {

    public static void main(String[] args) {
        Burger b1 = new Burger("Chicken", 100);
        AdditionalItem a1 = new AdditionalItem("cheese", 200);
        AdditionalItem a2 = new AdditionalItem("Tomato", 50);
        AdditionalItem a3 = new AdditionalItem("Lettuce", 25);
        AdditionalItem a4 = new AdditionalItem("Egg", 75);
        AdditionalItem a5 = new AdditionalItem("Lentils", 5);
        for (int i = 0; i < 6; i++) {
            if(b1.addAdditionalBaseItems(a1)){
                System.out.println("Added Successfully");
            }else {
                System.out.println("Can`t Add More!!");
            }
        }
        System.out.println(b1.getPrice());
        HealthyBurger h1 = new HealthyBurger("Kobe", 500);
        for (int i = 0; i < 6; i++) {
            if(h1.addAdditionalBaseItems(a2)){
                System.out.println("Added Successfully");
            }else {
                System.out.println("Can`t Add More!!");
            }
        }
        for (int i = 0; i < 3; i++) {
            if(h1.addAdditionalHealthyItems(a3)){
                System.out.println("Added Successfully");
            }else {
                System.out.println("Can`t Add More!!");
            }
        }
        System.out.println(h1.getPrice());
    }
}
