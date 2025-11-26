package com.xworkz.list.external;

import com.xworkz.list.dto.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRunner {
    public static void main(String[] args) {

        Product product  = new Product(true,  "Laptop", 'A', 50000);
        Product product1 = new Product(false, "Mobile", 'B', 30000);
        Product product2 = new Product(true,  "Tablet", 'C', 20000);
        Product product3 = new Product(true,  "Earbuds", 'D', 3000);
        Product product4 = new Product(false, "Headphones", 'E', 2500);
        Product product5 = new Product(true,  "Keyboard", 'F', 1500);
        Product product6 = new Product(true,  "Mouse", 'G', 800);
        Product product7 = new Product(false, "Monitor", 'H', 9000);
        Product product8 = new Product(true,  "Printer", 'I', 12000);
        Product product9 = new Product(true,  "SmartWatch", 'J', 3500);

        Product product10 = new Product(false, "Camera", 'K', 45000);
        Product product11 = new Product(true,  "Mixer", 'L', 3500);
        Product product12 = new Product(true,  "Grinder", 'M', 3300);
        Product product13 = new Product(false, "Fridge", 'N', 27000);
        Product product14 = new Product(true,  "AC", 'O', 35000);
        Product product15 = new Product(true,  "TV", 'P', 45000);
        Product product16 = new Product(false, "Charger", 'Q', 900);
        Product product17 = new Product(true,  "Pendrive", 'R', 600);
        Product product18 = new Product(false, "HardDisk", 'S', 4500);
        Product product19 = new Product(true,  "SSD", 'T', 3000);

        Product product20 = new Product(true,  "Shoes", 'U', 2000);
        Product product21 = new Product(false, "Shirt", 'V', 800);
        Product product22 = new Product(true,  "Jeans", 'W', 1500);
        Product product23 = new Product(false, "Jacket", 'X', 2000);
        Product product24 = new Product(true,  "Bag", 'Y', 1200);
        Product product25 = new Product(false, "Watch", 'Z', 5000);
        Product product26 = new Product(true,  "Wallet", 'P', 700);
        Product product27 = new Product(false, "Perfume", 'Q', 900);
        Product product28 = new Product(true,  "Socks", 'R', 200);
        Product product29 = new Product(false, "Belt", 'S', 300);
        Product product30 = new Product(true,  "Cap", 'T', 250);

        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);
        products.add(product11);
        products.add(product12);
        products.add(product13);
        products.add(product14);
        products.add(product15);
        products.add(product16);
        products.add(product17);
        products.add(product18);
        products.add(product19);
        products.add(product20);
        products.add(product21);
        products.add(product22);
        products.add(product23);
        products.add(product24);
        products.add(product25);
        products.add(product26);
        products.add(product27);
        products.add(product28);
        products.add(product29);
        products.add(product30);

        products.forEach(n -> System.out.println(n));
    }
}
