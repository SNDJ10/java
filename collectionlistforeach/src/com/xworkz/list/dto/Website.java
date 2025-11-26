package com.xworkz.list.dto;

import java.util.Objects;

public class Website {
    private String name;
    private int subscription;
    private boolean isWorks;
    private char rate;

    public Website(boolean isWorks, String name, char rate, int subscription) {
        this.isWorks = isWorks;
        this.name = name;
        this.rate = rate;
        this.subscription = subscription;
    }

    public boolean isWorks() {
        return isWorks;
    }

    public void setWorks(boolean works) {
        isWorks = works;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getRate() {
        return rate;
    }

    public void setRate(char rate) {
        this.rate = rate;
    }

    public int getSubscription() {
        return subscription;
    }

    public void setSubscription(int subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return "Website{" +
                "isWorks=" + isWorks +
                ", name='" + name + '\'' +
                ", subscription=" + subscription +
                ", rate=" + rate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Website website = (Website) o;
        return subscription == website.subscription && isWorks == website.isWorks && rate == website.rate && Objects.equals(name, website.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscription, isWorks, rate);
    }
}
