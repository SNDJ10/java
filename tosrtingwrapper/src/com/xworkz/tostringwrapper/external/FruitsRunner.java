package com.xworkz.tostringwrapper.external;

import com.xworkz.tostringwrapper.dto.Fruits;

public class FruitsRunner {
    public static void main(String[] args) {
        Fruits fruits=new Fruits();
        fruits.setAmount(200);
        fruits.setFruitName("apple");
        fruits.isThere(true);
        fruits.setWeight(200);
        System.out.println(fruits.toString());
    }
}
