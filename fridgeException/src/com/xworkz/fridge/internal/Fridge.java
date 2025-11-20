package com.xworkz.fridge.internal;



import com.xworkz.fridge.event.*;

public class Fridge {

    public int displayRam(int ram){
        if (ram > 0){
            try {
                throw new FridgeRamException();
            } catch (FridgeRamException e){
                e.printStackTrace();
                System.out.println("Fridge does not have RAM");
            }
        } else {
            System.out.println("Correct, fridge has no RAM");
        }
        return ram;
    }

    public int displayPrice(int price){
        if (price > 40000){
            try {
                throw new FridgePriceException();
            } catch (FridgePriceException e){
                e.printStackTrace();
                System.out.println("Fridge price too high");
            }
        } else {
            System.out.println("Fridge price normal");
        }
        return price;
    }

    public int displayBattery(int battery){
        if (battery > 0){
            try {
                throw new FridgeBatteryException();
            } catch (FridgeBatteryException e){
                e.printStackTrace();
                System.out.println("Fridge does not use battery");
            }
        } else {
            System.out.println("Correct, fridge works on electricity");
        }
        return battery;
    }

    public String displayBrand(String brand){
        if (brand.equals("Whirlpool")){
            try {
                throw new FridgeBrandException();
            } catch (FridgeBrandException e){
                e.printStackTrace();
                System.out.println("Good fridge brand");
            }
        } else {
            System.out.println("Unknown fridge brand");
        }
        return brand;
    }

    public String displayName(String name){
        if (name.equals("IceMagic")){
            try {
                throw new FridgeNameException();
            } catch (FridgeNameException e){
                e.printStackTrace();
                System.out.println("Good fridge model");
            }
        } else {
            System.out.println("Bad fridge model");
        }
        return name;
    }
}

