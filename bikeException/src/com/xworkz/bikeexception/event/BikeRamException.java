package com.xworkz.bikeexception.event;

public class BikeRamException extends Exception {
    public BikeRamException(){
        System.err.println("Bike has no RAM");
    }
}

