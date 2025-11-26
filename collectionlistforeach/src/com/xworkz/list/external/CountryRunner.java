package com.xworkz.list.external;

import com.xworkz.list.dto.Country;

import java.util.ArrayList;
import java.util.List;

public class CountryRunner {
    public static void main(String[] args) {

        Country country  = new Country(true,  "India", 'A', 1400000);
        Country country1 = new Country(false, "China", 'B', 1500000);
        Country country2 = new Country(true,  "USA", 'C', 350000);
        Country country3 = new Country(true,  "Russia", 'D', 145000);
        Country country4 = new Country(false, "Japan", 'E', 125000);
        Country country5 = new Country(true,  "Germany", 'F', 83000);
        Country country6 = new Country(true,  "UK", 'G', 68000);
        Country country7 = new Country(false, "France", 'H', 67000);
        Country country8 = new Country(true,  "Brazil", 'I', 210000);
        Country country9 = new Country(true,  "Italy", 'J', 60000);

        Country country10 = new Country(false, "Canada", 'K', 40000);
        Country country11 = new Country(true,  "Australia", 'L', 26000);
        Country country12 = new Country(true,  "Spain", 'M', 47000);
        Country country13 = new Country(false, "Mexico", 'N', 120000);
        Country country14 = new Country(true,  "Indonesia", 'O', 273000);
        Country country15 = new Country(true,  "South Korea", 'P', 52000);
        Country country16 = new Country(false, "Saudi Arabia", 'Q', 35000);
        Country country17 = new Country(true,  "Turkey", 'R', 85000);
        Country country18 = new Country(false, "Thailand", 'S', 70000);
        Country country19 = new Country(true,  "South Africa", 'T', 59000);

        Country country20 = new Country(true,  "Argentina", 'U', 45000);
        Country country21 = new Country(false, "Colombia", 'V', 50000);
        Country country22 = new Country(true,  "Egypt", 'W', 110000);
        Country country23 = new Country(false, "Vietnam", 'X', 98000);
        Country country24 = new Country(true,  "Philippines", 'Y', 110000);
        Country country25 = new Country(false, "Ukraine", 'Z', 41000);
        Country country26 = new Country(true,  "Poland", 'P', 38000);
        Country country27 = new Country(false, "Netherlands", 'Q', 17000);
        Country country28 = new Country(true,  "Chile", 'R', 19000);
        Country country29 = new Country(false, "Malaysia", 'S', 32000);
        Country country30 = new Country(true,  "UAE", 'T', 10000);

        List<Country> countries = new ArrayList<>();
        countries.add(country);
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);
        countries.add(country5);
        countries.add(country6);
        countries.add(country7);
        countries.add(country8);
        countries.add(country9);
        countries.add(country10);
        countries.add(country11);
        countries.add(country12);
        countries.add(country13);
        countries.add(country14);
        countries.add(country15);
        countries.add(country16);
        countries.add(country17);
        countries.add(country18);
        countries.add(country19);
        countries.add(country20);
        countries.add(country21);
        countries.add(country22);
        countries.add(country23);
        countries.add(country24);
        countries.add(country25);
        countries.add(country26);
        countries.add(country27);
        countries.add(country28);
        countries.add(country29);
        countries.add(country30);

        countries.forEach(n -> System.out.println(n));
    }
}

