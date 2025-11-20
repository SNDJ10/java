package com.xworkz.ac.events;



public class AcPriceException extends Exception {
    public AcPriceException(){
        System.err.println("AC price exceeded");
    }
}

