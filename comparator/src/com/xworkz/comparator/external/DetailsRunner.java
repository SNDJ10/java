package com.xworkz.comparator.external;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DetailsRunner {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(36);
        list.add(42);
        list.add(35);
        list.add(25);
        Collections.sort(list);
        System.out.println(list);
    }

}
