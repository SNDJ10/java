package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CarNamesRunner {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>();
        carList.add("BMW");
        carList.add("Audi");
        carList.add("Mercedes");
        carList.add("Toyota");
        carList.add("Ford");
        carList.add("Honda");
        carList.add("Kia");
        carList.add("Hyundai");

        ListIterator<String> carIterator = carList.listIterator();
        while (carIterator.hasNext()) {
            Object object = carIterator.next();
            String car = (String) object;

            if (car.equals("Audi")) {
                carIterator.add("Lexus");
            }
            if (car.equals("Ford")) {
                carIterator.add("Jeep");
            }

            System.out.println(car);
        }
        System.out.println("Final list of car names===" + carList);
    }
}

