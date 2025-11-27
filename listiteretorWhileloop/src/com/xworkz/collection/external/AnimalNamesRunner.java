package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AnimalNamesRunner {
    public static void main(String[] args) {
        List<String> animalList = new ArrayList<>();
        animalList.add("Lion");
        animalList.add("Tiger");
        animalList.add("Elephant");
        animalList.add("Giraffe");
        animalList.add("Zebra");
        animalList.add("Bear");
        animalList.add("Wolf");
        animalList.add("Fox");

        ListIterator<String> animalIterator = animalList.listIterator();
        while (animalIterator.hasNext()) {
            Object object = animalIterator.next();
            String animal = (String) object;

            if (animal.equals("Tiger")) {
                animalIterator.add("Leopard");
            }
            if (animal.equals("Bear")) {
                animalIterator.add("Panda");
            }

            System.out.println(animal);
        }
        System.out.println("Final list of animal names===" + animalList);
    }
}

