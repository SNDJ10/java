package com.xworkz.list.external;

import com.xworkz.list.dto.MobileApp;

import java.util.ArrayList;
import java.util.List;

public class MobileAppRunner {
    public static void main(String[] args) {

        MobileApp app  = new MobileApp(true,  "Instagram", 'A', 1200);
        MobileApp app1 = new MobileApp(false, "Snapchat",  'B', 1500);
        MobileApp app2 = new MobileApp(true,  "WhatsApp",  'C',  980);
        MobileApp app3 = new MobileApp(true,  "Telegram",  'D', 2100);
        MobileApp app4 = new MobileApp(false, "Facebook",  'E',  870);
        MobileApp app5 = new MobileApp(true,  "Twitter",   'F', 1650);
        MobileApp app6 = new MobileApp(true,  "YouTube",   'G',  760);
        MobileApp app7 = new MobileApp(false, "LinkedIn",  'H',  430);
        MobileApp app8 = new MobileApp(true,  "Pinterest", 'I',  520);
        MobileApp app9 = new MobileApp(true,  "Spotify",   'J', 1320);

        MobileApp app10 = new MobileApp(false, "Discord",   'K',  910);
        MobileApp app11 = new MobileApp(true,  "Reddit",    'L', 1400);
        MobileApp app12 = new MobileApp(true,  "Snapseed",  'M',  310);
        MobileApp app13 = new MobileApp(false, "Truecaller",'N',  290);
        MobileApp app14 = new MobileApp(true,  "Hotstar",   'O', 1600);
        MobileApp app15 = new MobileApp(true,  "PrimeVideo",'P', 2300);
        MobileApp app16 = new MobileApp(false, "Zomato",    'Q', 1100);
        MobileApp app17 = new MobileApp(true,  "Swiggy",    'R', 2500);
        MobileApp app18 = new MobileApp(false, "Paytm",     'S', 1750);
        MobileApp app19 = new MobileApp(true,  "PhonePe",   'T', 2800);

        MobileApp app20 = new MobileApp(true,  "Myntra",     'U', 3200);
        MobileApp app21 = new MobileApp(false, "Flipkart",   'V', 3500);
        MobileApp app22 = new MobileApp(true,  "Amazon",     'W', 2700);
        MobileApp app23 = new MobileApp(false, "Meesho",     'X', 5000);
        MobileApp app24 = new MobileApp(true,  "RedBus",     'Y', 1400);
        MobileApp app25 = new MobileApp(false, "BookMyShow", 'Z', 4100);
        MobileApp app26 = new MobileApp(true,  "OLA",        'P', 2200);
        MobileApp app27 = new MobileApp(false, "Uber",       'Q', 1800);
        MobileApp app28 = new MobileApp(true,  "Rapido",     'R', 4500);
        MobileApp app29 = new MobileApp(false, "Gaana",      'S', 1300);
        MobileApp app30 = new MobileApp(true,  "JioCinema",  'T', 1250);

        List<MobileApp> mobileApps = new ArrayList<>();
        mobileApps.add(app);
        mobileApps.add(app1);
        mobileApps.add(app2);
        mobileApps.add(app3);
        mobileApps.add(app4);
        mobileApps.add(app5);
        mobileApps.add(app6);
        mobileApps.add(app7);
        mobileApps.add(app8);
        mobileApps.add(app9);
        mobileApps.add(app10);
        mobileApps.add(app11);
        mobileApps.add(app12);
        mobileApps.add(app13);
        mobileApps.add(app14);
        mobileApps.add(app15);
        mobileApps.add(app16);
        mobileApps.add(app17);
        mobileApps.add(app18);
        mobileApps.add(app19);
        mobileApps.add(app20);
        mobileApps.add(app21);
        mobileApps.add(app22);
        mobileApps.add(app23);
        mobileApps.add(app24);
        mobileApps.add(app25);
        mobileApps.add(app26);
        mobileApps.add(app27);
        mobileApps.add(app28);
        mobileApps.add(app29);
        mobileApps.add(app30);

        mobileApps.forEach(n -> System.out.println(n));
    }
}

