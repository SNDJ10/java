package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TeacherNamesRunner {
    public static void main(String[] args) {
        List<String> teacherList = new ArrayList<>();
        teacherList.add("Anita");
        teacherList.add("Ramesh");
        teacherList.add("Suma");
        teacherList.add("Kumar");
        teacherList.add("Divya");
        teacherList.add("Shankar");
        teacherList.add("Lakshmi");
        teacherList.add("Manoj");

        ListIterator<String> teacherIterator = teacherList.listIterator();
        while (teacherIterator.hasNext()) {
            Object object = teacherIterator.next();
            String teacher = (String) object;

            if (teacher.equals("Ramesh")) {
                teacherIterator.add("Venkatesh");
            }
            if (teacher.equals("Divya")) {
                teacherIterator.add("Shilpa");
            }

            System.out.println(teacher);
        }
        System.out.println("Final list of teacher names===" + teacherList);
    }
}

