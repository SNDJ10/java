// File: com/xworkz/electronicshop/external/StoreRunner.java
package com.xworkz.electronicshop.external;

import com.xworkz.electronicshop.bridge.StoreTest;
import com.xworkz.electronicshop.internal.MobileShop;

public class StoreRunner {
    public static void main(String[] args) {
        StoreTest store = new StoreTest("Xworkz Mobiles", 15000);
        store.display();
    }
}
