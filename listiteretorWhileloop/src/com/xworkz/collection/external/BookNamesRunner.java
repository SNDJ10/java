package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BookNamesRunner {
    public static void main(String[] args) {
        List<String> bookList = new ArrayList<>();
        bookList.add("Harry Potter");
        bookList.add("Lord of the Rings");
        bookList.add("The Hobbit");
        bookList.add("Sherlock Holmes");
        bookList.add("Percy Jackson");
        bookList.add("Game of Thrones");
        bookList.add("Narnia");
        bookList.add("Maze Runner");

        ListIterator<String> bookIterator = bookList.listIterator();
        while (bookIterator.hasNext()) {
            Object object = bookIterator.next();
            String book = (String) object;

            if (book.equals("Lord of the Rings")) {
                bookIterator.add("Silmarillion");
            }
            if (book.equals("Game of Thrones")) {
                bookIterator.add("Fire and Blood");
            }

            System.out.println(book);
        }
        System.out.println("Final list of book names===" + bookList);
    }
}

