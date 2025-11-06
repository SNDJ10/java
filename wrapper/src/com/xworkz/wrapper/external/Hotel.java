package com.xworkz.wrapper.external;

public class Hotel {
    public Integer price;
    public double percentage;
    public String name;
    public Hotel(Integer price,double percentage,String name) {

        this.price = price;


    }
    public int displayPrice() {
        System.out.println("this is wrraper");
return price;
    }
}
