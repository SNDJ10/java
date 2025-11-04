package com.xworkz.poster.external;

import com.xworkz.poster.dto.Poster;

public class PosterRunner {

    public static void main(String[] args) {

        Poster poster = new Poster();
        poster.setPrice(15);
        int price = poster.getPrice();
        System.out.println(price  );

    }

}
