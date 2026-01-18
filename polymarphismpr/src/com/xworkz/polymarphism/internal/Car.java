package com.xworkz.polymarphism.internal;

public class Car {
    public String carNames;
    public int carPrice;
    public boolean isCar;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Car() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void carName(String carNames, int carPrice, boolean isCar){


    }
}
