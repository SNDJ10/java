package com.xworkz.brands.external;

import com.xworkz.brands.bridge.*;
import com.xworkz.electronicshop.internal.MobileShop;

public class StoreRunner {
    public static void main(String[] args) {

        Store samsung = new SamsungStore();
        Store apple = new AppleStore();
        Store oneplus = new OnePlusStore();
        Store vivo = new VivoStore();
        Store xiaomi = new XiaomiStore();

        samsung.storeName("Galaxy S25", 85000);
        apple.storeName("iPhone 16 Pro", 150000);
        oneplus.storeName("OnePlus 13", 72000);
        vivo.storeName("Vivo X200", 55000);
        xiaomi.storeName("Xiaomi 15 Ultra", 60000);

        samsung.display();
        apple.display();
        oneplus.display();
        vivo.display();
        xiaomi.display();

        System.out.println("\n--- Internal class example ---");
        MobileShop mobile = new MobileShop("Samsung", "Fold 6");
        mobile.showDetails();
    }
}
