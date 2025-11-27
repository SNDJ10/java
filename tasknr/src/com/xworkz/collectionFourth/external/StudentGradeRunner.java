package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class StudentGradeRunner {
    public static void main(String[] args) {
        Set<Character> set = new TreeSet<>();
        set.add('A');
        set.add('C');
        set.add('B');
        set.add('A');
        set.add('D');
        set.forEach(n -> System.out.println(n));
        set.clear();
        System.out.println(set.size());
        set.add('E');
        set.add('B');
        set.add('A');
        set.add('F');
        set.add('B');
        System.out.println(set.toString());

        set.forEach(n -> System.out.println(n));
    }
}

