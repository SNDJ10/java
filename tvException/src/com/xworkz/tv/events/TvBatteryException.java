package com.xworkz.tv.events;



public class TvBatteryException extends Exception {
    public TvBatteryException(){
        System.err.println("TV has no battery");
    }
}

