package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentNamesRunner {
    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>();
        studentList.add("Arjun");
        studentList.add("Rahul");
        studentList.add("Sanjay");
        studentList.add("Kiran");
        studentList.add("Vikram");
        studentList.add("Rohit");
        studentList.add("Naveen");
        studentList.add("Ganesh");

        ListIterator<String> studentIterator = studentList.listIterator();
        while (studentIterator.hasNext()) {
            Object object = studentIterator.next();
            String student = (String) object;

            if (student.equals("Rahul")) {
                studentIterator.add("Varun");
            }
            if (student.equals("Vikram")) {
                studentIterator.add("Suresh");
            }

            System.out.println(student);
        }
        System.out.println("Final list of student names===" + studentList);
    }
}

