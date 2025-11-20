package com.xworkz.mobileexception.internal;

import com.xworkz.mobileexception.events.*;
import com.xworkz.mobileexception.events.MobileRamException;

public class Mobile {

    public int displayRam(int ram){
        if (ram > 12){
            try {
                throw new MobileRamException();
            } catch (MobileRamException e){
                e.printStackTrace();
                System.out.println("RAM is above 12GB");
            }
        } else {
            System.out.println("RAM is normal");
        }
        return ram;
    }

    public int displayPrice(int price){
        if (price > 50000){
            try {
                throw new MobilePriceException();
            } catch (MobilePriceException e){
                e.printStackTrace();
                System.out.println("Price is high");
            }
        } else {
            System.out.println("Price is normal");
        }
        return price;
    }

    public int displayBattery(int battery){
        if (battery > 6000){
            try {
                throw new MobileBatteryException();
            } catch (MobileBatteryException e){
                e.printStackTrace();
                System.out.println("Battery is high capacity");
            }
        } else {
            System.out.println("Battery is normal");
        }
        return battery;
    }

    public String displayBrand(String brand){
        if (brand.equals("Samsung")){
            try {
                throw new MobileBrandException();
            } catch (MobileBrandException e){
                e.printStackTrace();
                System.out.println("Good mobile brand");
            }
        } else {
            System.out.println("Brand is unknown");
        }
        return brand;
    }

    public String displayName(String name){
        if (name.equals("Galaxy")){
            try {
                throw new MobileNameException();
            } catch (MobileNameException e){
                e.printStackTrace();
                System.out.println("Good model");
            }
        } else {
            System.out.println("Model is not good");
        }
        return name;
    }
}

