package com.xworkz.car.event;

public class CarBatteryException extends Exception {
    public CarBatteryException(){
        System.err.println("Invalid car battery capacity");
    }
}

