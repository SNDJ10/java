package com.xworkz.wrapper.external;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel=new Hotel(100 ,25,"sanjay");
       int amount=hotel.displayPrice();
       double per=hotel.hashCode();
       String value=hotel.toString();
        System.out.println(amount);
        System.out.println(per);
        System.out.println(value);
    }
}
