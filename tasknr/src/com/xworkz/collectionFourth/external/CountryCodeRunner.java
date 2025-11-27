package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class CountryCodeRunner {
    public static void main(String[] args) {
        Set<Long> set = new TreeSet<>();
        set.add(91L);
        set.add(1L);
        set.add(44L);
        set.add(81L);
        set.add(1L);
        set.forEach(n -> System.out.println(n));
        set.clear();
        System.out.println(set.size());
        set.add(61L);
        set.add(49L);
        set.add(33L);
        set.add(7L);
        set.add(49L);
        System.out.println(set.toString());

        set.forEach(n -> System.out.println(n));
    }
}

