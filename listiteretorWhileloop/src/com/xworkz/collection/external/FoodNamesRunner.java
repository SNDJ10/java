package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FoodNamesRunner {
    public static void main(String[] args) {
        List<String> foodList = new ArrayList<>();
        foodList.add("Pizza");
        foodList.add("Burger");
        foodList.add("Pasta");
        foodList.add("Idli");
        foodList.add("Dosa");
        foodList.add("Biryani");
        foodList.add("Fried Rice");
        foodList.add("Noodles");

        ListIterator<String> foodIterator = foodList.listIterator();
        while (foodIterator.hasNext()) {
            Object object = foodIterator.next();
            String food = (String) object;

            if (food.equals("Burger")) {
                foodIterator.add("Sandwich");
            }
            if (food.equals("Dosa")) {
                foodIterator.add("Vada");
            }

            System.out.println(food);
        }
        System.out.println("Final list of food names===" + foodList);
    }
}
