package com.xworkz.stream.external;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingOrder {

    public static void main(String[] args) {

        List<String> alphabets = new ArrayList<>(Arrays.asList("D", "A", "F", "B", "E", "C").stream().sorted().collect(Collectors.toList()));

        alphabets.forEach(n-> System.out.println(n));
    }
}


