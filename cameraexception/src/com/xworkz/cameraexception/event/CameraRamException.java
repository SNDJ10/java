package com.xworkz.cameraexception.event;



public class CameraRamException extends Exception {
    public CameraRamException(){
        System.err.println("Invalid Camera RAM");
    }
}

