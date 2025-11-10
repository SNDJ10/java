package com.xworkz.methodsinjava.external;

import com.xworkz.methodsinjava.dto.MovieDto;

public class MovieRunner {

    public static void main(String[] args) {

        MovieDto firstMovie = new MovieDto();

        firstMovie.setMovieId(1001);
        firstMovie.setMovieName("Inception");
        firstMovie.setDirectorName("Christopher Nolan");
        firstMovie.setImdbId(1375666L);
        firstMovie.setReleased(true);
        firstMovie.setRatingCode('A');
        firstMovie.setBudget(160000000.00);
        firstMovie.setReleaseYear(2010);
        firstMovie.setBoxOfficeCollection(829895144L);
        firstMovie.setImdbRating(8.8);
        firstMovie.setDurationInHours(2.8f);
        firstMovie.setHitStatus(true);

        MovieDto secondMovie = new MovieDto();

        secondMovie.setMovieId(1001);
        secondMovie.setMovieName("Inception");
        secondMovie.setDirectorName("Christopher Nolan");
        secondMovie.setImdbId(1375666L);
        secondMovie.setReleased(true);
        secondMovie.setRatingCode('A');
        secondMovie.setBudget(160000000.00);
        secondMovie.setReleaseYear(2010);
        secondMovie.setBoxOfficeCollection(829895144L);
        secondMovie.setImdbRating(8.8);
        secondMovie.setDurationInHours(2.8f);
        secondMovie.setHitStatus(true);

        System.out.println("---- FIRST MOVIE DETAILS ----");
        System.out.println(firstMovie);

        System.out.println("\n---- SECOND MOVIE DETAILS ----");
        System.out.println(secondMovie);

        System.out.println("\nHashCode of first movie = " + firstMovie.hashCode());
        System.out.println("HashCode of second movie = " + secondMovie.hashCode());

        System.out.println("\nAre both movies equal? " + firstMovie.equals(secondMovie));
    }
}
