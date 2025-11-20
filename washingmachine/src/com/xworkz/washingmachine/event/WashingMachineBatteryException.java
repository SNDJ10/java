package com.xworkz.washingmachine.event;

public class WashingMachineBatteryException extends Exception {
    public WashingMachineBatteryException(){
        System.err.println("Washing machine cannot run on battery");
    }
}
