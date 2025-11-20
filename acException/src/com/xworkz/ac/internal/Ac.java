package com.xworkz.ac.internal;



import com.xworkz.ac.events.*;

public class Ac {

    public int displayRam(int ram){
        if (ram > 0){
            try {
                throw new AcRamException();
            } catch (AcRamException e){
                e.printStackTrace();
                System.out.println("AC does not have RAM");
            }
        } else {
            System.out.println("Correct, AC has no RAM");
        }
        return ram;
    }

    public int displayPrice(int price){
        if (price > 60000){
            try {
                throw new AcPriceException();
            } catch (AcPriceException e){
                e.printStackTrace();
                System.out.println("AC price too high");
            }
        } else {
            System.out.println("AC price normal");
        }
        return price;
    }

    public int displayBattery(int battery){
        if (battery > 0){
            try {
                throw new AcBatteryException();
            } catch (AcBatteryException e){
                e.printStackTrace();
                System.out.println("AC does not work on battery");
            }
        } else {
            System.out.println("Correct, AC uses electricity");
        }
        return battery;
    }

    public String displayBrand(String brand){
        if (brand.equals("LG")){
            try {
                throw new AcBrandException();
            } catch (AcBrandException e){
                e.printStackTrace();
                System.out.println("Good AC brand");
            }
        } else {
            System.out.println("Unknown AC brand");
        }
        return brand;
    }

    public String displayName(String name){
        if (name.equals("DualCool")){
            try {
                throw new AcNameException();
            } catch (AcNameException e){
                e.printStackTrace();
                System.out.println("Good AC model");
            }
        } else {
            System.out.println("Bad AC model");
        }
        return name;
    }
}

