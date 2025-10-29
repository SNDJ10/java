package com.xworkz.electronicshop.internal;

public class MobileShop {
    private String brand;
    private String model;

    public MobileShop(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showDetails() {
        System.out.println("Mobile Brand: " + brand + " | Model: " + model);
    }
}
