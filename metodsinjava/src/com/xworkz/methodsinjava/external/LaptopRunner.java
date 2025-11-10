package com.xworkz.methodsinjava.external;

import com.xworkz.methodsinjava.dto.LaptopDto;

public class LaptopRunner {

    public static void main(String[] args) {

        // ------------------------------------------------
        // Creating the first Laptop object
        // ------------------------------------------------
        LaptopDto firstLaptop = new LaptopDto();

        firstLaptop.setLaptopId(501);
        firstLaptop.setBrandName("Dell");
        firstLaptop.setModelName("Inspiron 15 Plus");
        firstLaptop.setLaptopPrice(74999.99);
        firstLaptop.setTouchScreen(false);
        firstLaptop.setPerformanceGrade('A');
        firstLaptop.setSerialNumber(1234567890123L);
        firstLaptop.setRamSize(16);
        firstLaptop.setProcessorSpeed(3.6);
        firstLaptop.setScreenSize(15.6f);
        firstLaptop.setHasBacklitKeyboard(true);
        firstLaptop.setWarrantyNumber(20251108001L);

        // ------------------------------------------------
        // Creating the second Laptop object (same values)
        // ------------------------------------------------
        LaptopDto secondLaptop = new LaptopDto();

        secondLaptop.setLaptopId(501);
        secondLaptop.setBrandName("Dell");
        secondLaptop.setModelName("Inspiron 15 Plus");
        secondLaptop.setLaptopPrice(74999.99);
        secondLaptop.setTouchScreen(false);
        secondLaptop.setPerformanceGrade('A');
        secondLaptop.setSerialNumber(1234567890123L);
        secondLaptop.setRamSize(16);
        secondLaptop.setProcessorSpeed(3.6);
        secondLaptop.setScreenSize(15.6f);
        secondLaptop.setHasBacklitKeyboard(true);
        secondLaptop.setWarrantyNumber(20251108001L);

        // ------------------------------------------------
        // Printing both laptop details
        // ------------------------------------------------
        System.out.println("---- FIRST LAPTOP DETAILS ----");
        System.out.println(firstLaptop);

        System.out.println("\n---- SECOND LAPTOP DETAILS ----");
        System.out.println(secondLaptop);

        // ------------------------------------------------
        // Comparing hashCodes and equality
        // ------------------------------------------------
        System.out.println("\nHashCode of first laptop = " + firstLaptop.hashCode());
        System.out.println("HashCode of second laptop = " + secondLaptop.hashCode());

        System.out.println("\nAre both laptops equal? " + firstLaptop.equals(secondLaptop));
    }
}

