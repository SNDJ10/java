package com.xworkz.watch.event;

public class WatchBatteryException extends Exception {
    public WatchBatteryException(){
        System.err.println("Invalid watch battery level");
    }
}

