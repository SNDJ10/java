package com.xworkz.watch.event;

public class WatchPriceException extends Exception {
    public WatchPriceException(){
        System.err.println("Watch price exceeded");
    }
}

