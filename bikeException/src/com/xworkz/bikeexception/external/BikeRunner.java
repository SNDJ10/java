package com.xworkz.bikeexception.external;



import com.xworkz.bikeexception.internal.Bike;

public class BikeRunner {
    public static void main(String[] args) {

        Bike bike = new Bike();

        bike.displayRam(0);
        bike.displayPrice(150000);
        bike.displayBattery(5);
        bike.displayBrand("Yamaha");
        bike.displayName("MT15");
    }
}

