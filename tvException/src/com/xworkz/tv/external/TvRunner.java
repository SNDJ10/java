package com.xworkz.tv.external;



import com.xworkz.tv.internal.Tv;

public class TvRunner {
    public static void main(String[] args) {

        Tv tv = new Tv();

        tv.displayRam(8);
        tv.displayPrice(45000);
        tv.displayBattery(0);
        tv.displayBrand("Sony");
        tv.displayName("Bravia");
    }
}

