package com.xworkz.functionalinterface.external;

import com.xworkz.functionalinterface.internal.Mobile;

public class MobileRunner {
    public static void main(String[] args) {
        // Lambda expression implementing the interface
        Mobile mobile = (a, b) -> (a + b);

        int totalPrice = mobile.price(5000, 3000);
        System.out.println("Total Price: " + totalPrice);
    }
}
