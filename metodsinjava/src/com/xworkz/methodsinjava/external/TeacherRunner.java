package com.xworkz.methodsinjava.external;

import com.xworkz.methodsinjava.dto.TeacherDto;

public class TeacherRunner {

    public static void main(String[] args) {

        TeacherDto firstTeacher = new TeacherDto();

        firstTeacher.setTeacherId(1201);
        firstTeacher.setTeacherName("Anita Sharma");
        firstTeacher.setSubject("Mathematics");
        firstTeacher.setEmployeeNumber(45678901234L);
        firstTeacher.setFullTime(true);
        firstTeacher.setGrade('A');
        firstTeacher.setSalary(85000.50);
        firstTeacher.setYearsOfExperience(12);
        firstTeacher.setContactNumber(9876543210L);
        firstTeacher.setPerformanceScore(9.1);
        firstTeacher.setTeachingHours(6.5f);
        firstTeacher.setClassMentor(true);

        TeacherDto secondTeacher = new TeacherDto();

        secondTeacher.setTeacherId(1201);
        secondTeacher.setTeacherName("Anita Sharma");
        secondTeacher.setSubject("Mathematics");
        secondTeacher.setEmployeeNumber(45678901234L);
        secondTeacher.setFullTime(true);
        secondTeacher.setGrade('A');
        secondTeacher.setSalary(85000.50);
        secondTeacher.setYearsOfExperience(12);
        secondTeacher.setContactNumber(9876543210L);
        secondTeacher.setPerformanceScore(9.1);
        secondTeacher.setTeachingHours(6.5f);
        secondTeacher.setClassMentor(true);

        System.out.println("---- FIRST TEACHER DETAILS ----");
        System.out.println(firstTeacher);

        System.out.println("\n---- SECOND TEACHER DETAILS ----");
        System.out.println(secondTeacher);

        System.out.println("\nHashCode of first teacher = " + firstTeacher.hashCode());
        System.out.println("HashCode of second teacher = " + secondTeacher.hashCode());

        System.out.println("\nAre both teachers equal? " + firstTeacher.equals(secondTeacher));
    }
}
