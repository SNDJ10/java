package com.xworkz.bikeexception.event;



public class BikeNameException extends Exception {
    public BikeNameException(){
        System.err.println("Invalid bike model name");
    }
}

