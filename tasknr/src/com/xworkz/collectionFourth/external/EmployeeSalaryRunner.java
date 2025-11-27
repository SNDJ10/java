package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeSalaryRunner {
    public static void main(String[] args) {
        Set<Double> set = new TreeSet<>();
        set.add(25000.50);
        set.add(32000.75);
        set.add(28000.00);
        set.add(29000.10);
        set.add(32000.75);
        set.forEach(n -> System.out.println(n));
        set.clear();
        System.out.println(set.size());
        set.add(35000.00);
        set.add(27000.50);
        set.add(42000.25);
        set.add(23000.00);
        set.add(27000.50);
        System.out.println(set.toString());

        set.forEach(n -> System.out.println(n));
    }
}

