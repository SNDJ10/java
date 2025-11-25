package com.xworkz.nature.external;

import java.util.ArrayList;
import java.util.Collection;

public class Travel {
    public static void main(String[] args) {
        Collection<Long> collection=new ArrayList<>();
        collection.add(25462200221l);
        collection.add(2145496986l);
        collection.add(545441l);
        System.out.println(collection.toString());
        collection.clear();
        System.out.println(collection.size());


    }
}
