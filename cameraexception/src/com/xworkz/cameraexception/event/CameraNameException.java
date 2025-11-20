package com.xworkz.cameraexception.event;



public class CameraNameException extends Exception {
    public CameraNameException(){
        System.err.println("Invalid Camera Model Name");
    }
}

