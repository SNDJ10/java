package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class CityNameRunner {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Bangalore");
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Chennai");
        set.add("Delhi");
        set.forEach(n -> System.out.println(n));
        set.clear();
        System.out.println(set.size());
        set.add("Hyderabad");
        set.add("Pune");
        set.add("Mysore");
        set.add("Kolkata");
        set.add("Pune");
        System.out.println(set.toString());

        set.forEach(n -> System.out.println(n));
    }
}

