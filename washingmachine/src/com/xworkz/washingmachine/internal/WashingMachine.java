package com.xworkz.washingmachine.internal;

import com.xworkz.washingmachine.event.*;

public class WashingMachine {

    public int displayRam(int ram){
        if (ram > 0){
            try {
                throw new WashingMachineRamException();
            } catch (WashingMachineRamException e){
                e.printStackTrace();
                System.out.println("Washing machine does not have RAM");
            }
        } else {
            System.out.println("Correct, washing machine has no RAM");
        }
        return ram;
    }

    public int displayPrice(int price){
        if (price > 50000){
            try {
                throw new WashingMachinePriceException();
            } catch (WashingMachinePriceException e){
                e.printStackTrace();
                System.out.println("Washing machine price too high");
            }
        } else {
            System.out.println("Washing machine price normal");
        }
        return price;
    }

    public int displayBattery(int battery){
        if (battery > 0){
            try {
                throw new WashingMachineBatteryException();
            } catch (WashingMachineBatteryException e){
                e.printStackTrace();
                System.out.println("Washing machine does not use battery");
            }
        } else {
            System.out.println("Correct, washing machine uses electricity");
        }
        return battery;
    }

    public String displayBrand(String brand){
        if (brand.equals("Samsung")){
            try {
                throw new WashingMachineBrandException();
            } catch (WashingMachineBrandException e){
                e.printStackTrace();
                System.out.println("Good washing machine brand");
            }
        } else {
            System.out.println("Unknown washing machine brand");
        }
        return brand;
    }

    public String displayName(String name){
        if (name.equals("FrontLoad")){
            try {
                throw new WashingMachineNameException();
            } catch (WashingMachineNameException e){
                e.printStackTrace();
                System.out.println("Good washing machine model");
            }
        } else {
            System.out.println("Bad washing machine model");
        }
        return name;
    }
}

