package com.xworkz.speaker.external;

import com.xworkz.speaker.internal.Speaker;

public class SpeakerRunner {
    public static void main(String[] args) {

        Speaker speaker = new Speaker();

        speaker.displayRam(0);
        speaker.displayPrice(10000);
        speaker.displayBattery(20);
        speaker.displayBrand("JBL");
        speaker.displayName("GoPro");
    }
}

