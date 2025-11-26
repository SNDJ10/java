package com.xworkz.list.external;

import com.xworkz.list.dto.Laptop;

import java.util.ArrayList;
import java.util.List;

public class LaptopRunner {
    public static void main(String[] args) {

        Laptop laptop  = new Laptop(true,  "Dell", 'A', 1200);
        Laptop laptop1 = new Laptop(false, "HP", 'B', 1500);
        Laptop laptop2 = new Laptop(true,  "Lenovo", 'C',  980);
        Laptop laptop3 = new Laptop(true,  "Acer", 'D', 2100);
        Laptop laptop4 = new Laptop(false, "Asus", 'E',  870);
        Laptop laptop5 = new Laptop(true,  "Samsung", 'F', 1650);
        Laptop laptop6 = new Laptop(true,  "Apple", 'G',  760);
        Laptop laptop7 = new Laptop(false, "MSI", 'H',  430);
        Laptop laptop8 = new Laptop(true,  "Sony", 'I',  520);
        Laptop laptop9 = new Laptop(true,  "Toshiba", 'J', 1320);

        Laptop laptop10 = new Laptop(false, "LG", 'K',  910);
        Laptop laptop11 = new Laptop(true,  "Realme", 'L', 1400);
        Laptop laptop12 = new Laptop(true,  "Huawei", 'M',  310);
        Laptop laptop13 = new Laptop(false, "Avita", 'N',  290);
        Laptop laptop14 = new Laptop(true,  "Infinix", 'O', 1600);
        Laptop laptop15 = new Laptop(true,  "Xiaomi", 'P', 2300);
        Laptop laptop16 = new Laptop(false, "Honor", 'Q', 1100);
        Laptop laptop17 = new Laptop(true,  "Microsoft", 'R', 2500);
        Laptop laptop18 = new Laptop(false, "Iball", 'S', 1750);
        Laptop laptop19 = new Laptop(true,  "Panasonic", 'T', 2800);

        Laptop laptop20 = new Laptop(true,  "Gateway", 'U', 3200);
        Laptop laptop21 = new Laptop(false, "Chuwi", 'V', 3500);
        Laptop laptop22 = new Laptop(true,  "Fujitsu", 'W', 2700);
        Laptop laptop23 = new Laptop(false, "Alienware", 'X', 5000);
        Laptop laptop24 = new Laptop(true,  "Razer", 'Y', 1400);
        Laptop laptop25 = new Laptop(false, "Clevo", 'Z', 4100);
        Laptop laptop26 = new Laptop(true,  "Predator", 'P', 2200);
        Laptop laptop27 = new Laptop(false, "Nitro", 'Q', 1800);
        Laptop laptop28 = new Laptop(true,  "Strix", 'R', 4500);
        Laptop laptop29 = new Laptop(false, "ThinkPad", 'S', 1300);
        Laptop laptop30 = new Laptop(true,  "IdeaPad", 'T', 1250);

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop);
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);
        laptops.add(laptop8);
        laptops.add(laptop9);
        laptops.add(laptop10);
        laptops.add(laptop11);
        laptops.add(laptop12);
        laptops.add(laptop13);
        laptops.add(laptop14);
        laptops.add(laptop15);
        laptops.add(laptop16);
        laptops.add(laptop17);
        laptops.add(laptop18);
        laptops.add(laptop19);
        laptops.add(laptop20);
        laptops.add(laptop21);
        laptops.add(laptop22);
        laptops.add(laptop23);
        laptops.add(laptop24);
        laptops.add(laptop25);
        laptops.add(laptop26);
        laptops.add(laptop27);
        laptops.add(laptop28);
        laptops.add(laptop29);
        laptops.add(laptop30);

        laptops.forEach(n -> System.out.println(n));
    }
}

