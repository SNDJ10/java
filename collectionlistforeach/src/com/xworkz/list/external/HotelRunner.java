package com.xworkz.list.external;

import com.xworkz.list.dto.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelRunner {
    public static void main(String[] args) {

        Hotel hotel  = new Hotel(true,  "Taj", 'A', 5000);
        Hotel hotel1 = new Hotel(false, "Oberoi", 'B', 4500);
        Hotel hotel2 = new Hotel(true,  "ITC", 'C', 4700);
        Hotel hotel3 = new Hotel(true,  "Leela Palace", 'D', 6000);
        Hotel hotel4 = new Hotel(false, "JW Marriott", 'E', 4200);
        Hotel hotel5 = new Hotel(true,  "Hyatt", 'F', 3800);
        Hotel hotel6 = new Hotel(true,  "Novotel", 'G', 3500);
        Hotel hotel7 = new Hotel(false, "Trident", 'H', 3000);
        Hotel hotel8 = new Hotel(true,  "Radisson", 'I', 3300);
        Hotel hotel9 = new Hotel(true,  "Holiday Inn", 'J', 2800);

        Hotel hotel10 = new Hotel(false, "Sheraton", 'K', 4100);
        Hotel hotel11 = new Hotel(true,  "Hilton", 'L', 5200);
        Hotel hotel12 = new Hotel(true,  "Lemon Tree", 'M', 2000);
        Hotel hotel13 = new Hotel(false, "Royal Orchid", 'N', 1700);
        Hotel hotel14 = new Hotel(true,  "Sarovar", 'O', 1900);
        Hotel hotel15 = new Hotel(true,  "Four Seasons", 'P', 7500);
        Hotel hotel16 = new Hotel(false, "Zuri", 'Q', 2200);
        Hotel hotel17 = new Hotel(true,  "Meridian", 'R', 2600);
        Hotel hotel18 = new Hotel(false, "Park Plaza", 'S', 3000);
        Hotel hotel19 = new Hotel(true,  "Ritz Carlton", 'T', 8000);

        Hotel hotel20 = new Hotel(true,  "Green Park", 'U', 2400);
        Hotel hotel21 = new Hotel(false, "Crown Plaza", 'V', 4200);
        Hotel hotel22 = new Hotel(true,  "Ibis", 'W', 3500);
        Hotel hotel23 = new Hotel(false, "Ginger", 'X', 1500);
        Hotel hotel24 = new Hotel(true,  "Treebo", 'Y', 1800);
        Hotel hotel25 = new Hotel(false, "Fairfield", 'Z', 2600);
        Hotel hotel26 = new Hotel(true,  "Courtyard", 'P', 4100);
        Hotel hotel27 = new Hotel(false, "Blue Diamond", 'Q', 3900);
        Hotel hotel28 = new Hotel(true,  "Grand Hyatt", 'R', 6500);
        Hotel hotel29 = new Hotel(false, "The Park", 'S', 3100);
        Hotel hotel30 = new Hotel(true,  "Taj Vivanta", 'T', 5500);

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(hotel);
        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);
        hotels.add(hotel4);
        hotels.add(hotel5);
        hotels.add(hotel6);
        hotels.add(hotel7);
        hotels.add(hotel8);
        hotels.add(hotel9);
        hotels.add(hotel10);
        hotels.add(hotel11);
        hotels.add(hotel12);
        hotels.add(hotel13);
        hotels.add(hotel14);
        hotels.add(hotel15);
        hotels.add(hotel16);
        hotels.add(hotel17);
        hotels.add(hotel18);
        hotels.add(hotel19);
        hotels.add(hotel20);
        hotels.add(hotel21);
        hotels.add(hotel22);
        hotels.add(hotel23);
        hotels.add(hotel24);
        hotels.add(hotel25);
        hotels.add(hotel26);
        hotels.add(hotel27);
        hotels.add(hotel28);
        hotels.add(hotel29);
        hotels.add(hotel30);

        hotels.forEach(n -> System.out.println(n));
    }
}

