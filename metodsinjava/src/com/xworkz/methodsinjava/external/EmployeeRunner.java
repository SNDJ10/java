package com.xworkz.methodsinjava.external;

import com.xworkz.methodsinjava.dto.EmployeeDto;

public class EmployeeRunner {

    public static void main(String[] args) {


        EmployeeDto firstEmployee = new EmployeeDto();

        firstEmployee.setEmployeeId(101);
        firstEmployee.setEmployeeName("Ramesh Kumar");
        firstEmployee.setDepartment("Software Development");
        firstEmployee.setSalary(85000.50);
        firstEmployee.setPermanentEmployee(true);
        firstEmployee.setGrade('A');
        firstEmployee.setContactNumber(9876543210L);
        firstEmployee.setExperienceYears(5);
        firstEmployee.setBonusAmount(15000.75);
        firstEmployee.setRating(4.8f);
        firstEmployee.setRemoteWork(true);
        firstEmployee.setEmployeeCode(2024110101L);


        EmployeeDto secondEmployee = new EmployeeDto();

        secondEmployee.setEmployeeId(101);
        secondEmployee.setEmployeeName("Ramesh Kumar");
        secondEmployee.setDepartment("Software Development");
        secondEmployee.setSalary(85000.50);
        secondEmployee.setPermanentEmployee(true);
        secondEmployee.setGrade('A');
        secondEmployee.setContactNumber(9876543210L);
        secondEmployee.setExperienceYears(5);
        secondEmployee.setBonusAmount(15000.75);
        secondEmployee.setRating(4.8f);
        secondEmployee.setRemoteWork(true);
        secondEmployee.setEmployeeCode(2024110101L);


        System.out.println("---- FIRST EMPLOYEE DETAILS ----");
        System.out.println(firstEmployee);

        System.out.println("\n---- SECOND EMPLOYEE DETAILS ----");
        System.out.println(secondEmployee);


        System.out.println("\nHashCode of first employee: " + firstEmployee.hashCode());
        System.out.println("HashCode of second employee: " + secondEmployee.hashCode());

        System.out.println("\nAre both employee objects equal? " + firstEmployee.equals(secondEmployee));
    }
}

