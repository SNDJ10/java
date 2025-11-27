package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FlowerNamesRunner {
    public static void main(String[] args) {
        List<String> flowerList = new ArrayList<>();
        flowerList.add("Rose");
        flowerList.add("Lily");
        flowerList.add("Tulip");
        flowerList.add("Jasmine");
        flowerList.add("Lotus");
        flowerList.add("Sunflower");
        flowerList.add("Orchid");
        flowerList.add("Daisy");

        ListIterator<String> flowerIterator = flowerList.listIterator();
        while (flowerIterator.hasNext()) {
            Object object = flowerIterator.next();
            String flower = (String) object;

            if (flower.equals("Lily")) {
                flowerIterator.add("Marigold");
            }
            if (flower.equals("Lotus")) {
                flowerIterator.add("Hibiscus");
            }

            System.out.println(flower);
        }
        System.out.println("Final list of flower names===" + flowerList);
    }
}

