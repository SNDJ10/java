package com.xworkz.washingmachine.event;

public class WashingMachinePriceException extends Exception {
    public WashingMachinePriceException(){
        System.err.println("Washing machine price exceeded");
    }
}
