package com.xworkz.typesofexception.demo;

public class Person {

    public Person(int age) throws AgeInvalidException {
        if (age < 18) {
            throw new AgeInvalidException("Age must be 18 or above");
        }
        System.out.println("Valid age: " + age);
    }

}