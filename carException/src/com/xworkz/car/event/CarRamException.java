package com.xworkz.car.event;

public class CarRamException extends Exception {
    public CarRamException(){
        System.err.println("Car has no RAM");
    }
}

