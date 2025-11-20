package com.xworkz.cameraexception.event;



public class CameraPriceException extends Exception {
    public CameraPriceException(){
        System.err.println("Camera price exceeded");
    }
}

