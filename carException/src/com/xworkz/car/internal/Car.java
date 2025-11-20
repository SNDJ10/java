package com.xworkz.car.internal;

import com.xworkz.car.event.*;

public class Car {

    public int displayRam(int ram){
        if (ram > 0){
            try {
                throw new CarRamException();
            } catch (CarRamException e){
                e.printStackTrace();
                System.out.println("Car does not have RAM");
            }
        } else {
            System.out.println("Correct, car has no RAM");
        }
        return ram;
    }

    public int displayPrice(int price){
        if (price > 1500000){
            try {
                throw new CarPriceException();
            } catch (CarPriceException e){
                e.printStackTrace();
                System.out.println("Car price too high");
            }
        } else {
            System.out.println("Car price normal");
        }
        return price;
    }

    public int displayBattery(int battery){
        if (battery > 12){
            try {
                throw new CarBatteryException();
            } catch (CarBatteryException e){
                e.printStackTrace();
                System.out.println("Battery capacity too high for car");
            }
        } else {
            System.out.println("Car battery normal");
        }
        return battery;
    }

    public String displayBrand(String brand){
        if (brand.equals("Toyota")){
            try {
                throw new CarBrandException();
            } catch (CarBrandException e){
                e.printStackTrace();
                System.out.println("Good car brand");
            }
        } else {
            System.out.println("Unknown car brand");
        }
        return brand;
    }

    public String displayName(String name){
        if (name.equals("Innova")){
            try {
                throw new CarNameException();
            } catch (CarNameException e){
                e.printStackTrace();
                System.out.println("Good car model");
            }
        } else {
            System.out.println("Bad car model");
        }
        return name;
    }
}

