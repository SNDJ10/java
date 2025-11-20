package com.xworkz.speaker.event;

public class SpeakerRamException extends Exception {
    public SpeakerRamException(){
        System.err.println("Speaker has no RAM");
    }
}

