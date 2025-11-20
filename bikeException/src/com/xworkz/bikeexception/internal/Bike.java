package com.xworkz.bikeexception.internal;

import com.xworkz.bikeexception.event.*;

public class Bike {

    public int displayRam(int ram){
        if (ram > 0){
            try {
                throw new BikeRamException();
            } catch (BikeRamException e){
                e.printStackTrace();
                System.out.println("Bike does not have RAM");
            }
        } else {
            System.out.println("Correct, bike has no RAM");
        }
        return ram;
    }

    public int displayPrice(int price){
        if (price > 200000){
            try {
                throw new BikePriceException();
            } catch (BikePriceException e){
                e.printStackTrace();
                System.out.println("Bike price too high");
            }
        } else {
            System.out.println("Bike price normal");
        }
        return price;
    }

    public int displayBattery(int battery){
        if (battery > 12){
            try {
                throw new BikeBatteryException();
            } catch (BikeBatteryException e){
                e.printStackTrace();
                System.out.println("High battery capacity");
            }
        } else {
            System.out.println("Bike battery normal");
        }
        return battery;
    }

    public String displayBrand(String brand){
        if (brand.equals("Yamaha")){
            try {
                throw new BikeBrandException();
            } catch (BikeBrandException e){
                e.printStackTrace();
                System.out.println("Good bike brand");
            }
        } else {
            System.out.println("Unknown bike brand");
        }
        return brand;
    }

    public String displayName(String name){
        if (name.equals("MT15")){
            try {
                throw new BikeNameException();
            } catch (BikeNameException e){
                e.printStackTrace();
                System.out.println("Good bike model");
            }
        } else {
            System.out.println("Bad bike model");
        }
        return name;
    }
}

