package com.xworkz.watch.external;

import com.xworkz.watch.internal.Watch;

public class WatchRunner {
    public static void main(String[] args) {

        Watch watch = new Watch();

        watch.displayRam(0);
        watch.displayPrice(5000);
        watch.displayBattery(48);
        watch.displayBrand("Fastrack");
        watch.displayName("Reflex");
    }
}

