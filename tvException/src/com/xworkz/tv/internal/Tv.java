package com.xworkz.tv.internal;



import com.xworkz.tv.events.*;

public class Tv {

    public int displayRam(int ram){
        if (ram > 8){
            try {
                throw new TvRamException();
            } catch (TvRamException e){
                e.printStackTrace();
                System.out.println("RAM above limit");
            }
        } else {
            System.out.println("RAM is normal");
        }
        return ram;
    }

    public int displayPrice(int price){
        if (price > 80000){
            try {
                throw new TvPriceException();
            } catch (TvPriceException e){
                e.printStackTrace();
                System.out.println("TV price is high");
            }
        } else {
            System.out.println("TV price is normal");
        }
        return price;
    }

    public int displayBattery(int battery){
        if (battery > 0){
            try {
                throw new TvBatteryException();
            } catch (TvBatteryException e){
                e.printStackTrace();
                System.out.println("TV does not use battery");
            }
        } else {
            System.out.println("Correct, no battery");
        }
        return battery;
    }

    public String displayBrand(String brand){
        if (brand.equals("Sony")){
            try {
                throw new TvBrandException();
            } catch (TvBrandException e){
                e.printStackTrace();
                System.out.println("Good TV brand");
            }
        } else {
            System.out.println("Unknown TV brand");
        }
        return brand;
    }

    public String displayName(String name){
        if (name.equals("Bravia")){
            try {
                throw new TvNameException();
            } catch (TvNameException e){
                e.printStackTrace();
                System.out.println("Good TV model");
            }
        } else {
            System.out.println("Bad model");
        }
        return name;
    }
}

