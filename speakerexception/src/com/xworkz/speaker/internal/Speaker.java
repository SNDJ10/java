package com.xworkz.speaker.internal;

import com.xworkz.speaker.event.*;

public class Speaker {

    public int displayRam(int ram){
        if (ram > 0){
            try {
                throw new SpeakerRamException();
            } catch (SpeakerRamException e){
                e.printStackTrace();
                System.out.println("Speaker does not have RAM");
            }
        } else {
            System.out.println("Correct, Speaker has no RAM");
        }
        return ram;
    }

    public int displayPrice(int price){
        if (price > 15000){
            try {
                throw new SpeakerPriceException();
            } catch (SpeakerPriceException e){
                e.printStackTrace();
                System.out.println("Speaker price too high");
            }
        } else {
            System.out.println("Speaker price normal");
        }
        return price;
    }

    public int displayBattery(int battery){
        if (battery > 24){
            try {
                throw new SpeakerBatteryException();
            } catch (SpeakerBatteryException e){
                e.printStackTrace();
                System.out.println("Battery backup too high");
            }
        } else {
            System.out.println("Speaker battery normal");
        }
        return battery;
    }

    public String displayBrand(String brand){
        if (brand.equals("JBL")){
            try {
                throw new SpeakerBrandException();
            } catch (SpeakerBrandException e){
                e.printStackTrace();
                System.out.println("Good speaker brand");
            }
        } else {
            System.out.println("Unknown speaker brand");
        }
        return brand;
    }

    public String displayName(String name){
        if (name.equals("GoPro")){
            try {
                throw new SpeakerNameException();
            } catch (SpeakerNameException e){
                e.printStackTrace();
                System.out.println("Good speaker model");
            }
        } else {
            System.out.println("Bad speaker model");
        }
        return name;
    }
}

