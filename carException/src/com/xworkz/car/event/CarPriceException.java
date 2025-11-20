package com.xworkz.car.event;

public class CarPriceException extends Exception {
    public CarPriceException(){
        System.err.println("Car price exceeded");
    }
}

