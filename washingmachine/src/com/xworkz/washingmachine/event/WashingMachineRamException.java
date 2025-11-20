package com.xworkz.washingmachine.event;

public class WashingMachineRamException extends Exception {
    public WashingMachineRamException(){
        System.err.println("Washing machine has no RAM");
    }
}

