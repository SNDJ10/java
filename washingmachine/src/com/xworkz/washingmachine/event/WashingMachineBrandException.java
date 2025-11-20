package com.xworkz.washingmachine.event;

public class WashingMachineBrandException extends Exception {
    public WashingMachineBrandException(){
        System.err.println("Invalid washing machine brand");
    }
}
