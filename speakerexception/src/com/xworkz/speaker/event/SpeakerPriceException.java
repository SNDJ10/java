package com.xworkz.speaker.event;

public class SpeakerPriceException extends Exception {
    public SpeakerPriceException(){
        System.err.println("Speaker price exceeded");
    }
}

