package com.xworkz.comparator.external;



import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Portfolio {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(22);
        list.add(64);
        list.add(10);

        Collections.sort(list);
        System.out.println(list);

    }


}
