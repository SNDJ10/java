package com.xworkz.listiterator.external;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IntegerRunner {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(4);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            Integer integer = (Integer) object;

            if (integer == 3) {
                iterator.remove();
            }
        }
        System.out.println(set);

    }

}

