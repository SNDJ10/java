package com.xworkz.studentdata.external;

import com.xworkz.studentdata.dto.StudentData;

public class StudentDataRunner {
    public static void main(String[] args) {
        StudentData student = new StudentData();

        student.setAge((byte) 21);
        student.setTotalSubjects((short) 6);
        student.setRollNo(101);
        student.setPhoneNumber(9876543210L);
        student.setAttendance(89.5f);
        student.setPercentage(91.75);
        student.setGrade('A');
        student.setPassed(true);
        student.setName("Sanjay");

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Subjects: " + student.getTotalSubjects());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Phone: " + student.getPhoneNumber());
        System.out.println("Attendance: " + student.getAttendance());
        System.out.println("Percentage: " + student.getPercentage());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Passed: " + student.isPassed());
    }
}

