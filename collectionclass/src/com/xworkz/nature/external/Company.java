package com.xworkz.nature.external;

import java.util.ArrayList;
import java.util.Collection;

public class Company {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("100");
        collection.add("sanjay");
        collection.add("bangalore");
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());
    }
}
