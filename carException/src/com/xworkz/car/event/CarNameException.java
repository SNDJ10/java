package com.xworkz.car.event;

public class CarNameException extends Exception {
    public CarNameException(){
        System.err.println("Invalid car model name");
    }
}

