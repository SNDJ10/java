package com.xworkz.listdtocollection.external;

import java.util.ArrayList;
import java.util.List;

public class NatureRunner {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(300);
//       list.forEach(n-> System.out.println(n));
        for (Integer name:list){
            System.out.println(name);
        }
    }
}

