package com.xworkz.nature.external;

import java.util.ArrayList;
import java.util.Collection;

public class NatureRunner {
    public static void main(Company[] args) {
        Collection<Integer> colletion=new ArrayList<>();
        colletion.add(100);
        colletion.add(200);
        colletion.add(500);
        System.out.println(colletion.toString());
        System.out.println(colletion.size());
        colletion.clear();
        System.out.println(colletion.size());


    }
}
