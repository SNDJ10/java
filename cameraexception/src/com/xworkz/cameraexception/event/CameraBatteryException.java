package com.xworkz.cameraexception.event;



public class CameraBatteryException extends Exception {
    public CameraBatteryException(){
        System.err.println("Camera battery capacity error");
    }
}

