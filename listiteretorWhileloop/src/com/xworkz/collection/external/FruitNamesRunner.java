package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FruitNamesRunner {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Grapes");
        fruitList.add("Mango");
        fruitList.add("Orange");
        fruitList.add("Papaya");
        fruitList.add("Pineapple");
        fruitList.add("Strawberry");

        ListIterator<String> fruitIterator = fruitList.listIterator();
        while (fruitIterator.hasNext()) {
            Object object = fruitIterator.next();
            String fruit = (String) object;

            if (fruit.equals("Banana")) {
                fruitIterator.add("Watermelon");
            }
            if (fruit.equals("Orange")) {
                fruitIterator.add("Kiwi");
            }

            System.out.println(fruit);
        }
        System.out.println("Final list of fruit names===" + fruitList);
    }
}

