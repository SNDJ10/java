package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MobileNamesRunner {
    public static void main(String[] args) {
        List<String> mobileList = new ArrayList<>();
        mobileList.add("Samsung");
        mobileList.add("Apple");
        mobileList.add("OnePlus");
        mobileList.add("Vivo");
        mobileList.add("Oppo");
        mobileList.add("Xiaomi");
        mobileList.add("Realme");
        mobileList.add("Nothing");

        ListIterator<String> mobileIterator = mobileList.listIterator();
        while (mobileIterator.hasNext()) {
            Object object = mobileIterator.next();
            String mobile = (String) object;

            if (mobile.equals("Apple")) {
                mobileIterator.add("Pixel");
            }
            if (mobile.equals("Oppo")) {
                mobileIterator.add("Motorola");
            }

            System.out.println(mobile);
        }
        System.out.println("Final list of mobile names===" + mobileList);
    }
}

