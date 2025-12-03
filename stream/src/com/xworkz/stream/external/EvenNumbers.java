package com.xworkz.stream.external;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> even=new ArrayList<>(Arrays.asList(55,25,40,88,98,18,70).stream().filter(n-> n%2==0).collect(Collectors.toList()));
        even.forEach(n-> System.out.println(n));
    }
}
