package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LaptopNamesRunner {
    public static void main(String[] args) {
        List<String> laptopList = new ArrayList<>();
        laptopList.add("Dell");
        laptopList.add("HP");
        laptopList.add("Lenovo");
        laptopList.add("Acer");
        laptopList.add("Asus");
        laptopList.add("Apple");
        laptopList.add("Samsung");
        laptopList.add("MSI");

        ListIterator<String> laptopIterator = laptopList.listIterator();
        while (laptopIterator.hasNext()) {
            Object object = laptopIterator.next();
            String laptop = (String) object;

            if (laptop.equals("HP")) {
                laptopIterator.add("Sony");
            }
            if (laptop.equals("Asus")) {
                laptopIterator.add("Toshiba");
            }

            System.out.println(laptop);
        }
        System.out.println("Final list of laptop names===" + laptopList);
    }
}

