package com.xworkz.bikeexception.event;



public class BikePriceException extends Exception {
    public BikePriceException(){
        System.err.println("Bike price exceeded");
    }
}

