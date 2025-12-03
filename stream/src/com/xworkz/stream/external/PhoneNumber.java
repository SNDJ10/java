package com.xworkz.stream.external;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneNumber {


    public static void main(String[] args) {
        List<Long> phNumber=new ArrayList<>(Arrays.asList(9895554555L,9855224662L,7895462155L,8956245554L,9235467522L).stream().filter(n-> String.valueOf(n).startsWith("9")).collect(Collectors.toList()));
        phNumber.forEach(n-> System.out.println(n));
    }
}
