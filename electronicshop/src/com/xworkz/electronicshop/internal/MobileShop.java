
package com.xworkz.electronicshop.internal;

public abstract class MobileShop {
    protected String mobileName;
    protected int price;
    protected String mobileBranch;

    public MobileShop(String mobileName, int price, String mobileBranch) {
        this.mobileName = mobileName;
        this.price = price;
        this.mobileBranch = mobileBranch;
    }

    public void displayDetails() {
        System.out.println("Mobile Name: " + mobileName);
        System.out.println("Price: " + price);
        System.out.println("Branch: " + mobileBranch);
    }
}
