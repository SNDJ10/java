package com.xworkz.nature.external;

import java.util.ArrayList;
import java.util.Collection;

public class Places {
    public static void main(String[] args) {
        Collection<Boolean> collection=new ArrayList<>();
        collection.add(true);
        collection.add(false);
        collection.add(true);
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());
    }
}
