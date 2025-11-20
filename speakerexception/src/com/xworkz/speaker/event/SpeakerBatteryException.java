package com.xworkz.speaker.event;

public class SpeakerBatteryException extends Exception {
    public SpeakerBatteryException(){
        System.err.println("Invalid speaker battery capacity");
    }
}

