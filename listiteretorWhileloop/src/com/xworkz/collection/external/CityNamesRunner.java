package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CityNamesRunner {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        cityList.add("Bangalore");
        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Chennai");
        cityList.add("Kolkata");
        cityList.add("Hyderabad");
        cityList.add("Pune");
        cityList.add("Mysore");

        ListIterator<String> cityIterator = cityList.listIterator();
        while (cityIterator.hasNext()) {
            Object object = cityIterator.next();
            String city = (String) object;

            if (city.equals("Delhi")) {
                cityIterator.add("Noida");
            }
            if (city.equals("Kolkata")) {
                cityIterator.add("Howrah");
            }

            System.out.println(city);
        }
        System.out.println("Final list of city names===" + cityList);
    }
}

