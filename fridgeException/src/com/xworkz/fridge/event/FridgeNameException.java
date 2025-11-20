package com.xworkz.fridge.event;

public class FridgeNameException extends Exception {
    public FridgeNameException(){
        System.err.println("Invalid fridge model name");
    }
}

