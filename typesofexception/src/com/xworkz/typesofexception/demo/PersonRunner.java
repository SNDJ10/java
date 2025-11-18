package com.xworkz.typesofexception.demo;
import com.xworkz.typesofexception.*;
public class PersonRunner {
    public static void main(String[] args) throws AgeInvalidException {
        Person p = new Person(15);   // no try-catch here
    }
}


