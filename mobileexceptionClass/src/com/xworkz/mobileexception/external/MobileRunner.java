package com.xworkz.mobileexception.external;


import com.xworkz.mobileexception.internal.Mobile;

public class MobileRunner {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        mobile.displayRam(16);

        mobile.displayPrice(60000);

        mobile.displayBattery(7000);

        mobile.displayBrand("Samsung");

        mobile.displayName("Galaxy");
    }
}

