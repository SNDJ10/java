package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CountryNamesRunner {
    public static void main(String[] args) {
        List<String> countryList = new ArrayList<>();
        countryList.add("India");
        countryList.add("USA");
        countryList.add("UK");
        countryList.add("China");
        countryList.add("Japan");
        countryList.add("Germany");
        countryList.add("France");
        countryList.add("Italy");

        ListIterator<String> countryIterator = countryList.listIterator();
        while (countryIterator.hasNext()) {
            Object object = countryIterator.next();
            String country = (String) object;

            if (country.equals("USA")) {
                countryIterator.add("Canada");
            }
            if (country.equals("Japan")) {
                countryIterator.add("South Korea");
            }

            System.out.println(country);
        }
        System.out.println("Final list of country names===" + countryList);
    }
}

