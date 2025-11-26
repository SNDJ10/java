package com.xworkz.list.external;

import com.xworkz.list.dto.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {

        Student student  = new Student(true,  "Arjun", 'A', 85);
        Student student1 = new Student(false, "Rahul", 'B', 70);
        Student student2 = new Student(true,  "Kiran", 'C', 65);
        Student student3 = new Student(true,  "Sanjay", 'D', 90);
        Student student4 = new Student(false, "Naveen", 'E', 55);
        Student student5 = new Student(true,  "Suraj", 'F', 75);
        Student student6 = new Student(true,  "Rohit", 'G', 88);
        Student student7 = new Student(false, "Akash", 'H', 60);
        Student student8 = new Student(true,  "Varun", 'I', 92);
        Student student9 = new Student(true,  "Karthik", 'J', 78);

        Student student10 = new Student(false, "Shiva", 'K', 66);
        Student student11 = new Student(true,  "Vishal", 'L', 82);
        Student student12 = new Student(true,  "Roshan", 'M', 74);
        Student student13 = new Student(false, "Lokesh", 'N', 58);
        Student student14 = new Student(true,  "Anil", 'O', 81);
        Student student15 = new Student(true,  "Mahesh", 'P', 89);
        Student student16 = new Student(false, "Harish", 'Q', 68);
        Student student17 = new Student(true,  "Abhishek", 'R', 91);
        Student student18 = new Student(false, "Jatin", 'S', 54);
        Student student19 = new Student(true,  "Praveen", 'T', 73);

        Student student20 = new Student(true,  "Dinesh", 'U', 76);
        Student student21 = new Student(false, "Suresh", 'V', 65);
        Student student22 = new Student(true,  "Mohan", 'W', 84);
        Student student23 = new Student(false, "Yogesh", 'X', 59);
        Student student24 = new Student(true,  "Uday", 'Y', 88);
        Student student25 = new Student(false, "Prakash", 'Z', 67);
        Student student26 = new Student(true,  "Hemanth", 'P', 79);
        Student student27 = new Student(false, "Nithin", 'Q', 62);
        Student student28 = new Student(true,  "Sharath", 'R', 87);
        Student student29 = new Student(false, "Gopal", 'S', 63);
        Student student30 = new Student(true,  "Darshan", 'T', 90);

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);
        students.add(student16);
        students.add(student17);
        students.add(student18);
        students.add(student19);
        students.add(student20);
        students.add(student21);
        students.add(student22);
        students.add(student23);
        students.add(student24);
        students.add(student25);
        students.add(student26);
        students.add(student27);
        students.add(student28);
        students.add(student29);
        students.add(student30);

        students.forEach(n -> System.out.println(n));
    }
}

