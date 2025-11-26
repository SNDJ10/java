package com.xworkz.list.external;

import com.xworkz.list.dto.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRunner {
    public static void main(String[] args) {

        Movie movie  = new Movie(true,  "Avatar", 'A', 1200);
        Movie movie1 = new Movie(false, "Titanic", 'B', 1500);
        Movie movie2 = new Movie(true,  "KGF", 'C',  980);
        Movie movie3 = new Movie(true,  "Joker", 'D', 2100);
        Movie movie4 = new Movie(false, "Dangal", 'E',  870);
        Movie movie5 = new Movie(true,  "Avengers", 'F', 1650);
        Movie movie6 = new Movie(true,  "Pushpa", 'G',  760);
        Movie movie7 = new Movie(false, "Bahubali", 'H',  430);
        Movie movie8 = new Movie(true,  "RRR", 'I',  520);
        Movie movie9 = new Movie(true,  "Inception", 'J', 1320);

        Movie movie10 = new Movie(false, "Interstellar", 'K',  910);
        Movie movie11 = new Movie(true,  "Oppenheimer", 'L', 1400);
        Movie movie12 = new Movie(true,  "DarkKnight", 'M',  310);
        Movie movie13 = new Movie(false, "Spiderman", 'N',  290);
        Movie movie14 = new Movie(true,  "IronMan", 'O', 1600);
        Movie movie15 = new Movie(true,  "Thor", 'P', 2300);
        Movie movie16 = new Movie(false, "Flash", 'Q', 1100);
        Movie movie17 = new Movie(true,  "Aquaman", 'R', 2500);
        Movie movie18 = new Movie(false, "Deadpool", 'S', 1750);
        Movie movie19 = new Movie(true,  "BlackAdam", 'T', 2800);

        Movie movie20 = new Movie(true,  "Kantara", 'U', 3200);
        Movie movie21 = new Movie(false, "Salaar", 'V', 3500);
        Movie movie22 = new Movie(true,  "Leo", 'W', 2700);
        Movie movie23 = new Movie(false, "Master", 'X', 5000);
        Movie movie24 = new Movie(true,  "Jawan", 'Y', 1400);
        Movie movie25 = new Movie(false, "Pathaan", 'Z', 4100);
        Movie movie26 = new Movie(true,  "WAR", 'P', 2200);
        Movie movie27 = new Movie(false, "Sahoo", 'Q', 1800);
        Movie movie28 = new Movie(true,  "Kaithi", 'R', 4500);
        Movie movie29 = new Movie(false, "Zero", 'S', 1300);
        Movie movie30 = new Movie(true,  "Ghajini", 'T', 1250);

        List<Movie> movies = new ArrayList<>();
        movies.add(movie);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
        movies.add(movie11);
        movies.add(movie12);
        movies.add(movie13);
        movies.add(movie14);
        movies.add(movie15);
        movies.add(movie16);
        movies.add(movie17);
        movies.add(movie18);
        movies.add(movie19);
        movies.add(movie20);
        movies.add(movie21);
        movies.add(movie22);
        movies.add(movie23);
        movies.add(movie24);
        movies.add(movie25);
        movies.add(movie26);
        movies.add(movie27);
        movies.add(movie28);
        movies.add(movie29);
        movies.add(movie30);

        movies.forEach(n -> System.out.println(n));
    }
}

