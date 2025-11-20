package com.xworkz.bikeexception.event;



public class BikeBatteryException extends Exception {
    public BikeBatteryException(){
        System.err.println("Invalid bike battery capacity");
    }
}

