package com.xworkz.list.external;

import com.xworkz.list.dto.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRunner {
    public static void main(String[] args) {

        Teacher teacher  = new Teacher(true,  "Anand", 'A', 45000);
        Teacher teacher1 = new Teacher(false, "Suresh", 'B', 38000);
        Teacher teacher2 = new Teacher(true,  "Prakash", 'C', 42000);
        Teacher teacher3 = new Teacher(true,  "Mallesh", 'D', 50000);
        Teacher teacher4 = new Teacher(false, "Ramesh", 'E', 35000);
        Teacher teacher5 = new Teacher(true,  "Manjunath", 'F', 41000);
        Teacher teacher6 = new Teacher(true,  "Vinod", 'G', 46000);
        Teacher teacher7 = new Teacher(false, "Vijay", 'H', 33000);
        Teacher teacher8 = new Teacher(true,  "Shankar", 'I', 47000);
        Teacher teacher9 = new Teacher(true,  "Ravi", 'J', 39000);

        Teacher teacher10 = new Teacher(false, "Kumar", 'K', 36000);
        Teacher teacher11 = new Teacher(true,  "Lokesh", 'L', 51000);
        Teacher teacher12 = new Teacher(true,  "Rajesh", 'M', 48000);
        Teacher teacher13 = new Teacher(false, "Raghu", 'N', 37000);
        Teacher teacher14 = new Teacher(true,  "Shivakumar", 'O', 52000);
        Teacher teacher15 = new Teacher(true,  "Deepak", 'P', 55000);
        Teacher teacher16 = new Teacher(false, "Mahadev", 'Q', 34000);
        Teacher teacher17 = new Teacher(true,  "Harish", 'R', 53000);
        Teacher teacher18 = new Teacher(false, "Santosh", 'S', 31000);
        Teacher teacher19 = new Teacher(true,  "Darshan", 'T', 46000);

        Teacher teacher20 = new Teacher(true,  "Girish", 'U', 49000);
        Teacher teacher21 = new Teacher(false, "Narayan", 'V', 35000);
        Teacher teacher22 = new Teacher(true,  "Praveen", 'W', 42000);
        Teacher teacher23 = new Teacher(false, "Ashok", 'X', 30000);
        Teacher teacher24 = new Teacher(true,  "Nagaraj", 'Y', 39000);
        Teacher teacher25 = new Teacher(false, "Umesh", 'Z', 32000);
        Teacher teacher26 = new Teacher(true,  "Anil", 'P', 55000);
        Teacher teacher27 = new Teacher(false, "Basavaraj", 'Q', 31000);
        Teacher teacher28 = new Teacher(true,  "Mahesh", 'R', 48000);
        Teacher teacher29 = new Teacher(false, "Gopal", 'S', 36000);
        Teacher teacher30 = new Teacher(true,  "Harsha", 'T', 50000);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher);
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);
        teachers.add(teacher5);
        teachers.add(teacher6);
        teachers.add(teacher7);
        teachers.add(teacher8);
        teachers.add(teacher9);
        teachers.add(teacher10);
        teachers.add(teacher11);
        teachers.add(teacher12);
        teachers.add(teacher13);
        teachers.add(teacher14);
        teachers.add(teacher15);
        teachers.add(teacher16);
        teachers.add(teacher17);
        teachers.add(teacher18);
        teachers.add(teacher19);
        teachers.add(teacher20);
        teachers.add(teacher21);
        teachers.add(teacher22);
        teachers.add(teacher23);
        teachers.add(teacher24);
        teachers.add(teacher25);
        teachers.add(teacher26);
        teachers.add(teacher27);
        teachers.add(teacher28);
        teachers.add(teacher29);
        teachers.add(teacher30);

        teachers.forEach(n -> System.out.println(n));
    }
}

