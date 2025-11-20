package com.xworkz.fridge.event;

public class FridgePriceException extends Exception {
    public FridgePriceException(){
        System.err.println("Fridge price exceeded");
    }
}

