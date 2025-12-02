package com.xworkz.listiterator.external;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ShortRunner {

    public static void main(String[] args) {

        Set<Short> set = new TreeSet<>();
        set.add((short) 1);
        set.add((short) 2);
        set.add((short) 3);
        set.add((short) 1);
        set.add((short) 4);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            Short number = (Short) object;

            if (number == 3) {
                iterator.remove();
            }
        }
        System.out.println(set);

    }

}
