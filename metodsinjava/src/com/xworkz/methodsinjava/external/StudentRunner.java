package com.xworkz.methodsinjava.external;

import com.xworkz.methodsinjava.dto.StudentDto;

public class StudentRunner {

    public static void main(String[] args) {

        // ------------------------------------------------
        // Creating the first student object
        // ------------------------------------------------
        StudentDto firstStudent = new StudentDto();

        firstStudent.setStudentRollNumber(101);
        firstStudent.setStudentName("Priya Sharma");
        firstStudent.setCourseName("Computer Science");
        firstStudent.setStudentMarks(92.5);
        firstStudent.setPassedExam(true);
        firstStudent.setSection('A');
        firstStudent.setRegistrationNumber(2024001234L);
        firstStudent.setAge(21);
        firstStudent.setAttendancePercentage(95.8);
        firstStudent.setCgpa(9.3f);
        firstStudent.setScholarshipEligible(true);
        firstStudent.setStudentIdCard(9988776655L);

        // ------------------------------------------------
        // Creating the second student object (same data)
        // ------------------------------------------------
        StudentDto secondStudent = new StudentDto();

        secondStudent.setStudentRollNumber(101);
        secondStudent.setStudentName("Priya Sharma");
        secondStudent.setCourseName("Computer Science");
        secondStudent.setStudentMarks(92.5);
        secondStudent.setPassedExam(true);
        secondStudent.setSection('A');
        secondStudent.setRegistrationNumber(2024001234L);
        secondStudent.setAge(21);
        secondStudent.setAttendancePercentage(95.8);
        secondStudent.setCgpa(9.3f);
        secondStudent.setScholarshipEligible(true);
        secondStudent.setStudentIdCard(9988776655L);

        // ------------------------------------------------
        // Printing the details
        // ------------------------------------------------
        System.out.println("---- FIRST STUDENT DETAILS ----");
        System.out.println(firstStudent);

        System.out.println("\n---- SECOND STUDENT DETAILS ----");
        System.out.println(secondStudent);

        // ------------------------------------------------
        // Comparing hashCodes and equality
        // ------------------------------------------------
        System.out.println("\nHashCode of first student: " + firstStudent.hashCode());
        System.out.println("HashCode of second student: " + secondStudent.hashCode());

        System.out.println("\nAre both student objects equal? " + firstStudent.equals(secondStudent));
    }
}
