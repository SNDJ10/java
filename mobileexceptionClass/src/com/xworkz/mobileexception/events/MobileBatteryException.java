package com.xworkz.mobileexception.events;

public class MobileBatteryException extends Exception {
    public MobileBatteryException(){
        System.err.println("High Battery Capacity");
    }
}
