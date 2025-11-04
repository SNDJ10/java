package com.xworkz.alldatatypes;

import com.xworkz.alldatatypes.dto.AllDataTypes;


public class AllDataTypesRunner {

    public static void main(String[] args) {

        // Creating an object of AllDataTypes class
        AllDataTypes data = new AllDataTypes();

        // Setting values for all data types
        data.setQuantity((byte) 10);
        data.setWidth((short) 20);
        data.setPrice(150);
        data.setId(9876543210L);
        data.setWeight(2.5f);
        data.setCost(499.99);
        data.setGrade('A');
        data.setAvailable(true);
        data.setName("Premium Poster");

        // Getting values from AllDataTypes object
        byte quantity = data.getQuantity();
        short width = data.getWidth();
        int price = data.getPrice();
        long id = data.getId();
        float weight = data.getWeight();
        double cost = data.getCost();
        char grade = data.getGrade();
        boolean available = data.isAvailable();
        String name = data.getName();

        // Printing all values
        System.out.println("-------- Product Details --------");
        System.out.println("Product Name: " + name);
        System.out.println("Quantity (byte): " + quantity);
        System.out.println("Width (short): " + width);
        System.out.println("Price (int): " + price);
        System.out.println("ID (long): " + id);
        System.out.println("Weight (float): " + weight);
        System.out.println("Cost (double): " + cost);
        System.out.println("Grade (char): " + grade);
        System.out.println("Available (boolean): " + available);
        System.out.println("---------------------------------");
    }
}
