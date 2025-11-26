package com.xworkz.list.external;

import com.xworkz.list.dto.Website;

import java.util.ArrayList;
import java.util.List;

public class WebsiteRunner {
    public static void main(String[] args) {

        Website website  = new Website(true,  "Chrome",     'A', 1200);
        Website website1 = new Website(false, "Firefox",    'B', 1500);
        Website website2 = new Website(true,  "Edge",       'C',  980);
        Website website3 = new Website(true,  "Safari",     'D', 2100);
        Website website4 = new Website(false, "Opera",      'E',  870);
        Website website5 = new Website(true,  "Brave",      'F', 1650);
        Website website6 = new Website(true,  "Vivaldi",    'G',  760);
        Website website7 = new Website(false, "UC Browser", 'H',  430);
        Website website8 = new Website(true,  "Tor",        'I',  520);
        Website website9 = new Website(true,  "DuckDuckGo", 'J', 1320);

        Website website10 = new Website(false, "Bing",      'K',  910);
        Website website11 = new Website(true,  "Yahoo",     'L', 1400);
        Website website12 = new Website(true,  "Ask",       'M',  310);
        Website website13 = new Website(false, "AOL",       'N',  290);
        Website website14 = new Website(true,  "Yandex",    'O', 1600);
        Website website15 = new Website(true,  "Baidu",     'P', 2300);
        Website website16 = new Website(false, "Naver",     'Q', 1100);
        Website website17 = new Website(true,  "Reddit",    'R', 2500);
        Website website18 = new Website(false, "LinkedIn",  'S', 1750);
        Website website19 = new Website(true,  "GitHub",    'T', 2800);

        Website website20 = new Website(true,  "Instagram", 'U', 3200);
        Website website21 = new Website(false, "Facebook",  'V', 3500);
        Website website22 = new Website(true,  "Twitter",   'W', 2700);
        Website website23 = new Website(false, "YouTube",   'X', 5000);
        Website website24 = new Website(true,  "Flipkart",  'Y', 1400);
        Website website25 = new Website(false, "Amazon",    'Z', 4100);
        Website website26 = new Website(true,  "Snapchat",  'P', 2200);
        Website website27 = new Website(false, "Telegram",  'Q', 1800);
        Website website28 = new Website(true,  "WhatsApp",  'R', 4500);
        Website website29 = new Website(false, "Pinterest", 'S', 1300);
        Website website30 = new Website(true,  "Quora",     'T', 1250);

        List<Website> websites = new ArrayList<>();
        websites.add(website);
        websites.add(website1);
        websites.add(website2);
        websites.add(website3);
        websites.add(website4);
        websites.add(website5);
        websites.add(website6);
        websites.add(website7);
        websites.add(website8);
        websites.add(website9);
        websites.add(website10);
        websites.add(website11);
        websites.add(website12);
        websites.add(website13);
        websites.add(website14);
        websites.add(website15);
        websites.add(website16);
        websites.add(website17);
        websites.add(website18);
        websites.add(website19);
        websites.add(website20);
        websites.add(website21);
        websites.add(website22);
        websites.add(website23);
        websites.add(website24);
        websites.add(website25);
        websites.add(website26);
        websites.add(website27);
        websites.add(website28);
        websites.add(website29);
        websites.add(website30);

//        for (Website name:websites){
//            System.out.println(name);
//        }
        websites.forEach(n-> System.out.println(n));
    }
}

