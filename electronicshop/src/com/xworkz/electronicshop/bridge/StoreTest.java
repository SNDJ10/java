// File: com/xworkz/electronicshop/bridge/StoreTest.java
package com.xworkz.electronicshop.bridge;

public class StoreTest implements Store {
    private String name;
    private int price;

    public StoreTest(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("StoreTest object created!");
    }

    @Override
    public void storeName(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Store Name: " + name);
        System.out.println("Store Price: " + price);
    }
}
