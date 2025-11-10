package com.xworkz.methodsinjava.external;

import com.xworkz.methodsinjava.dto.MobileDto;

public class MobileRunner {

    public static void main(String[] args) {

        // ------------------------------------------------
        // Creating the first Mobile object
        // ------------------------------------------------
        MobileDto firstMobile = new MobileDto();

        firstMobile.setMobileId(201);
        firstMobile.setBrandName("Samsung");
        firstMobile.setModelName("Galaxy S24 Ultra");
        firstMobile.setMobilePrice(139999.00);
        firstMobile.setFiveGSupported(true);
        firstMobile.setPerformanceGrade('A');
        firstMobile.setImeiNumber(352093874561234L);
        firstMobile.setRamSize(12);
        firstMobile.setProcessorSpeed(3.2);
        firstMobile.setScreenSize(6.8f);
        firstMobile.setHasFingerprintLock(true);
        firstMobile.setWarrantyNumber(202511100201L);

        // ------------------------------------------------
        // Creating the second Mobile object (same data)
        // ------------------------------------------------
        MobileDto secondMobile = new MobileDto();

        secondMobile.setMobileId(201);
        secondMobile.setBrandName("Samsung");
        secondMobile.setModelName("Galaxy S24 Ultra");
        secondMobile.setMobilePrice(139999.00);
        secondMobile.setFiveGSupported(true);
        secondMobile.setPerformanceGrade('A');
        secondMobile.setImeiNumber(352093874561234L);
        secondMobile.setRamSize(12);
        secondMobile.setProcessorSpeed(3.2);
        secondMobile.setScreenSize(6.8f);
        secondMobile.setHasFingerprintLock(true);
        secondMobile.setWarrantyNumber(202511100201L);

        // ------------------------------------------------
        // Printing details of both mobiles
        // ------------------------------------------------
        System.out.println("---- FIRST MOBILE DETAILS ----");
        System.out.println(firstMobile);

        System.out.println("\n---- SECOND MOBILE DETAILS ----");
        System.out.println(secondMobile);

        // ------------------------------------------------
        // Comparing hashCodes and equality
        // ------------------------------------------------
        System.out.println("\nHashCode of first mobile = " + firstMobile.hashCode());
        System.out.println("HashCode of second mobile = " + secondMobile.hashCode());

        System.out.println("\nAre both mobiles equal? " + firstMobile.equals(secondMobile));
    }
}

