package com.xworkz.listiterator.external;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LongRunner {

    public static void main(String[] args) {

        Set<Long> set = new TreeSet<>();
        set.add(123L);
        set.add(234L);
        set.add(345L);
        set.add(123L);
        set.add(456L);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            Long number = (Long) object;

            if (number == 345L) {
                iterator.remove();
            }
        }
        System.out.println(set);

    }

}
