package com.xworkz.watch.internal;

;

import com.xworkz.watch.event.*;

public class Watch {

    public int displayRam(int ram){
        if (ram > 2){
            try {
                throw new WatchRamException();
            } catch (WatchRamException e){
                e.printStackTrace();
                System.out.println("Watch RAM too high");
            }
        } else {
            System.out.println("Watch RAM normal");
        }
        return ram;
    }

    public int displayPrice(int price){
        if (price > 20000){
            try {
                throw new WatchPriceException();
            } catch (WatchPriceException e){
                e.printStackTrace();
                System.out.println("Watch price too high");
            }
        } else {
            System.out.println("Watch price normal");
        }
        return price;
    }

    public int displayBattery(int battery){
        if (battery > 48){
            try {
                throw new WatchBatteryException();
            } catch (WatchBatteryException e){
                e.printStackTrace();
                System.out.println("Battery backup too high");
            }
        } else {
            System.out.println("Watch battery normal");
        }
        return battery;
    }

    public String displayBrand(String brand){
        if (brand.equals("Fastrack")){
            try {
                throw new WatchBrandException();
            } catch (WatchBrandException e){
                e.printStackTrace();
                System.out.println("Good watch brand");
            }
        } else {
            System.out.println("Unknown watch brand");
        }
        return brand;
    }

    public String displayName(String name){
        if (name.equals("Reflex")){
            try {
                throw new WatchNameException();
            } catch (WatchNameException e){
                e.printStackTrace();
                System.out.println("Good watch model");
            }
        } else {
            System.out.println("Bad watch model");
        }
        return name;
    }
}

