package com.xworkz.stream.external;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscDecAlphabetsRunner {
    public static void main(String[] args) {
        List<String> alph= Arrays.asList("a","A","D","B","E","b");
        List<String> stram=alph.stream()
                .filter(s->s.length()>0)
                .sorted((a,b)->a.toLowerCase().compareTo(b.toLowerCase()))
                .collect(Collectors.toList());

        List<String> stram1 =alph.stream()
                .filter(s->s.length()>0)
//                .sorted((a, b)->b.toLowerCase().compareTo(a.toLowerCase()))
                // .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        stram.forEach(n-> System.out.println(n));
        System.out.println("-------------------");
        stram1.forEach(n-> System.out.println(n));
    }
}
