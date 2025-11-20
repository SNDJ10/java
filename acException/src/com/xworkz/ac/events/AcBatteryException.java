package com.xworkz.ac.events;



public class AcBatteryException extends Exception {
    public AcBatteryException(){
        System.err.println("AC cannot run on battery");
    }
}

