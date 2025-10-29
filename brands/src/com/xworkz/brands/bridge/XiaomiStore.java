package com.xworkz.brands.bridge;

public class XiaomiStore implements Store {
    private String name;
    private int price;

    @Override
    public void storeName(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Xiaomi Store → " + name + " | ₹" + price);
    }
}
