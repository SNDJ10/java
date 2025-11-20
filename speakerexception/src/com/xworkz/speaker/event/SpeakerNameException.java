package com.xworkz.speaker.event;

public class SpeakerNameException extends Exception {
    public SpeakerNameException(){
        System.err.println("Invalid speaker model name");
    }
}

