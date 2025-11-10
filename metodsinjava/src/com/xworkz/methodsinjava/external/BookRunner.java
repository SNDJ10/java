package com.xworkz.methodsinjava.external;

import com.xworkz.methodsinjava.dto.BookDto;

public class BookRunner {

    public static void main(String[] args) {

        BookDto firstBook = new BookDto();

        firstBook.setBookId(901);
        firstBook.setBookName("The Power of Habit");
        firstBook.setAuthorName("Charles Duhigg");
        firstBook.setIsbnNumber(9780812981605L);
        firstBook.setAvailable(true);
        firstBook.setCategoryCode('B');
        firstBook.setPrice(499.99);
        firstBook.setNumberOfPages(371);
        firstBook.setPublicationYear(2014L);
        firstBook.setRating(4.5);
        firstBook.setDiscountPercentage(10.0f);
        firstBook.setHardcover(true);

        BookDto secondBook = new BookDto();

        secondBook.setBookId(901);
        secondBook.setBookName("The Power of Habit");
        secondBook.setAuthorName("Charles Duhigg");
        secondBook.setIsbnNumber(9780812981605L);
        secondBook.setAvailable(true);
        secondBook.setCategoryCode('B');
        secondBook.setPrice(499.99);
        secondBook.setNumberOfPages(371);
        secondBook.setPublicationYear(2014L);
        secondBook.setRating(4.5);
        secondBook.setDiscountPercentage(10.0f);
        secondBook.setHardcover(true);

        System.out.println("---- FIRST BOOK DETAILS ----");
        System.out.println(firstBook);

        System.out.println("\n---- SECOND BOOK DETAILS ----");
        System.out.println(secondBook);

        System.out.println("\nHashCode of first book = " + firstBook.hashCode());
        System.out.println("HashCode of second book = " + secondBook.hashCode());

        System.out.println("\nAre both books equal? " + firstBook.equals(secondBook));
    }
}
