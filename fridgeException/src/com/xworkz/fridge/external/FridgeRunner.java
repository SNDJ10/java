

package com.xworkz.fridge.external;

import com.xworkz.fridge.internal.Fridge;

public class FridgeRunner {
    public static void main(String[] args) {

        Fridge fridge = new Fridge();

        fridge.displayRam(0);
        fridge.displayPrice(30000);
        fridge.displayBattery(0);
        fridge.displayBrand("Whirlpool");
        fridge.displayName("IceMagic");
    }
}
