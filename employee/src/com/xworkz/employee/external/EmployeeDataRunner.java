package com.xworkz.employee.external;

import com.xworkz.employee.dto.EmployeeData;

public class EmployeeDataRunner {
    public static void main(String[] args) {
        EmployeeData emp = new EmployeeData();

        emp.setExperience((byte) 5);
        emp.setLeavesTaken((short) 12);
        emp.setEmpId(1002);
        emp.setSalary(850000L);
        emp.setPerformanceScore(4.7f);
        emp.setBonus(15000.50);
        emp.setLevel('B');
        emp.setActive(true);
        emp.setEmpName("Ravi Kumar");

        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Experience: " + emp.getExperience());
        System.out.println("Leaves Taken: " + emp.getLeavesTaken());
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Performance Score: " + emp.getPerformanceScore());
        System.out.println("Bonus: " + emp.getBonus());
        System.out.println("Level: " + emp.getLevel());
        System.out.println("Active: " + emp.isActive());
    }
}
