package com.xworkz.stream.external;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DecendingOrder{
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(9,8,6,7,5,4,3,1,2,10);
        List<Integer> stream=data.stream()
                .filter(n->n>0)
                .sorted()
                .collect(Collectors.toList());
        List<Integer> stream1=data.stream()
                .filter(n->n>0)
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());
        stream.forEach(n-> System.out.println(n));
        System.out.println("-----------------------");
        stream1.forEach(n-> System.out.println(n));
    }
}
