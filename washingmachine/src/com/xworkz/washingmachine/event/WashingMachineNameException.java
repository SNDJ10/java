package com.xworkz.washingmachine.event;

public class WashingMachineNameException extends Exception {
    public WashingMachineNameException(){
        System.err.println("Invalid washing machine model name");
    }
}
