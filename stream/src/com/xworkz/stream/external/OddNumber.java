package com.xworkz.stream.external;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class OddNumber {
        public static void main(String[] args) {
            List<Integer> odd=new ArrayList<>(Arrays.asList(5,2,4,8,9,1,7).stream().filter(n-> n%2!=0).collect(Collectors.toList()));
            odd.forEach(n-> System.out.println(n));
        }
    }

