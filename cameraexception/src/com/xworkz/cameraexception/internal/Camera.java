package com.xworkz.cameraexception.internal;



import com.xworkz.cameraexception.event.*;

public class Camera {

    public int displayRam(int ram){
        if (ram > 4){
            try {
                throw new CameraRamException();
            } catch (CameraRamException e){
                e.printStackTrace();
                System.out.println("Camera does not need this much RAM");
            }
        } else {
            System.out.println("Camera RAM normal");
        }
        return ram;
    }

    public int displayPrice(int price){
        if (price > 100000){
            try {
                throw new CameraPriceException();
            } catch (CameraPriceException e){
                e.printStackTrace();
                System.out.println("Camera price too high");
            }
        } else {
            System.out.println("Camera price normal");
        }
        return price;
    }

    public int displayBattery(int battery){
        if (battery > 6000){
            try {
                throw new CameraBatteryException();
            } catch (CameraBatteryException e){
                e.printStackTrace();
                System.out.println("Camera battery capacity too high");
            }
        } else {
            System.out.println("Camera battery normal");
        }
        return battery;
    }

    public String displayBrand(String brand){
        if (brand.equals("Canon")){
            try {
                throw new CameraBrandException();
            } catch (CameraBrandException e){
                e.printStackTrace();
                System.out.println("Good camera brand");
            }
        } else {
            System.out.println("Unknown camera brand");
        }
        return brand;
    }

    public String displayName(String name){
        if (name.equals("EOS")){
            try {
                throw new CameraNameException();
            } catch (CameraNameException e){
                e.printStackTrace();
                System.out.println("Good camera model");
            }
        } else {
            System.out.println("Bad camera model");
        }
        return name;
    }
}

