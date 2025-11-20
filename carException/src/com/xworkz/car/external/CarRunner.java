package com.xworkz.car.external;

import com.xworkz.car.internal.Car;

public class CarRunner {
    public static void main(String[] args) {

        Car car = new Car();

        car.displayRam(0);
        car.displayPrice(1200000);
        car.displayBattery(12);
        car.displayBrand("Toyota");
        car.displayName("Innova");
    }
}

