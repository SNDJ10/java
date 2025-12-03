package com.xworkz.stream.external;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static void main(String[] args) {

        List<String> alphabets = new ArrayList<>(Arrays.asList("D", "A", "F", "B", "E", "C").stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        alphabets.forEach(n-> System.out.println(n));
    }

}
