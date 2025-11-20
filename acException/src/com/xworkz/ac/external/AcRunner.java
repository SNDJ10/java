package com.xworkz.ac.external;



import com.xworkz.ac.internal.Ac;

public class AcRunner {
    public static void main(String[] args) {

        Ac ac = new Ac();

        ac.displayRam(0);
        ac.displayPrice(55000);
        ac.displayBattery(0);
        ac.displayBrand("LG");
        ac.displayName("DualCool");
    }
}
