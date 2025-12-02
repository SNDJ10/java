package com.xworkz.listiterator.external;



import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StringRunner {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("Ajay");
        set.add("Vijay");
        set.add("Sujay");
        set.add("Ajay");
        set.add("Suresh");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            String string = (String) object;

            if (string == "Suresh") {
                iterator.remove();
            }
        }
        System.out.println(set);

    }

}
