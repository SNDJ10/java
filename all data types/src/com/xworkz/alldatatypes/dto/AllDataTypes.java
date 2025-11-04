package com.xworkz.alldatatypes.dto;

public class AllDataTypes {

    private byte quantity;
    private short width;
    private int price;
    private long id;
    private float weight;
    private double cost;
    private char grade;
    private boolean available;
    private String name;

    public void setQuantity(byte quantity) {
        this.quantity = quantity;
    }

    public byte getQuantity() {
        return quantity;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    public short getWidth() {
        return width;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
