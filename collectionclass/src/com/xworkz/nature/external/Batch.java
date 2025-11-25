package com.xworkz.nature.external;

import java.util.ArrayList;
import java.util.Collection;

public class Batch {
    public static void main(String[] args) {
        Collection<Byte> collection =new ArrayList<>();
        collection.add((byte)21);
        collection.add((byte) 451223);
        collection.add((byte) 14520);
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());
    }
}
