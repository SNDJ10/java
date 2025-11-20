package com.xworkz.watch.event;

public class WatchNameException extends Exception {
    public WatchNameException(){
        System.err.println("Invalid watch model name");
    }
}

