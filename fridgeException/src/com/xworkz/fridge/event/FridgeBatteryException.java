package com.xworkz.fridge.event;

public class FridgeBatteryException extends Exception {
    public FridgeBatteryException(){
        System.err.println("Fridge cannot run on battery");
    }
}
