package com.xworkz.mobileexception.events;
public class MobileRamException extends Exception {
    public MobileRamException(){
        System.err.println("Invalid RAM");
    }
}
