package com.xworkz.washingmachine.external;

import com.xworkz.washingmachine.internal.WashingMachine;

public class WashingMachineRunner {
    public static void main(String[] args) {

        WashingMachine machine = new WashingMachine();

        machine.displayRam(0);
        machine.displayPrice(45000);
        machine.displayBattery(0);
        machine.displayBrand("Samsung");
        machine.displayName("FrontLoad");
    }
}
