package com.xworkz.fridge.event;



public class FridgeRamException extends Exception {
    public FridgeRamException(){
        System.err.println("Fridge has no RAM");
    }
}

