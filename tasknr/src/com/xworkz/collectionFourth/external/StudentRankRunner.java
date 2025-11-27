package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class StudentRankRunner {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(3);
        set.forEach(n -> System.out.println(n));
        set.clear();
        System.out.println(set.size());
        set.add(5);
        set.add(2);
        set.add(6);
        set.add(1);
        set.add(2);
        System.out.println(set.toString());

        set.forEach(n -> System.out.println(n));
    }
}

