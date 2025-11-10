package com.xworkz.methodsinjava.dto;

import java.util.Objects;

public class EmployeeDto {

    // ------------------------------------------------
    // ✅ Primitive Data Types
    // ------------------------------------------------
    private int employeeId;            // Employee ID number
    private double salary;             // Employee salary
    private boolean permanentEmployee; // Whether employee is permanent
    private char grade;                // Employee performance grade (A, B, C)
    private long contactNumber;        // Employee contact number

    // ------------------------------------------------
    // ✅ Non-Primitive (Wrapper) Data Types
    // ------------------------------------------------
    private String employeeName;       // Employee full name
    private String department;         // Department name
    private Integer experienceYears;   // Experience in years (Wrapper)
    private Double bonusAmount;        // Bonus amount
    private Float rating;              // Employee rating (Wrapper)
    private Boolean remoteWork;        // If employee is working remotely
    private Long employeeCode;         // Unique employee code (Wrapper)

    // ------------------------------------------------
    // ✅ Setters
    // ------------------------------------------------
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPermanentEmployee(boolean permanentEmployee) {
        this.permanentEmployee = permanentEmployee;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setExperienceYears(Integer experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void setBonusAmount(Double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public void setRemoteWork(Boolean remoteWork) {
        this.remoteWork = remoteWork;
    }

    public void setEmployeeCode(Long employeeCode) {
        this.employeeCode = employeeCode;
    }

    // ------------------------------------------------
    // ✅ Getters
    // ------------------------------------------------
    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPermanentEmployee() {
        return permanentEmployee;
    }

    public char getGrade() {
        return grade;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getExperienceYears() {
        return experienceYears;
    }

    public Double getBonusAmount() {
        return bonusAmount;
    }

    public Float getRating() {
        return rating;
    }

    public Boolean getRemoteWork() {
        return remoteWork;
    }

    public Long getEmployeeCode() {
        return employeeCode;
    }

    // ------------------------------------------------
    // ✅ hashCode() Method
    // ------------------------------------------------
    @Override
    public int hashCode() {
        return Objects.hash(
                employeeId,
                salary,
                permanentEmployee,
                grade,
                contactNumber,
                employeeName,
                department,
                experienceYears,
                bonusAmount,
                rating,
                remoteWork,
                employeeCode
        );
    }

    // ------------------------------------------------
    // ✅ equals() Method
    // ------------------------------------------------
    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        EmployeeDto other = (EmployeeDto) object;

        return employeeId == other.employeeId &&
                Double.compare(other.salary, salary) == 0 &&
                permanentEmployee == other.permanentEmployee &&
                grade == other.grade &&
                contactNumber == other.contactNumber &&
                Objects.equals(employeeName, other.employeeName) &&
                Objects.equals(department, other.department) &&
                Objects.equals(experienceYears, other.experienceYears) &&
                Objects.equals(bonusAmount, other.bonusAmount) &&
                Objects.equals(rating, other.rating) &&
                Objects.equals(remoteWork, other.remoteWork) &&
                Objects.equals(employeeCode, other.employeeCode);
    }

    // ------------------------------------------------
    // ✅ toString() Method
    // ------------------------------------------------
    @Override
    public String toString() {
        return "EmployeeDto {" +
                "\n  employeeId = " + employeeId +
                ",\n  employeeName = '" + employeeName + '\'' +
                ",\n  department = '" + department + '\'' +
                ",\n  salary = " + salary +
                ",\n  permanentEmployee = " + permanentEmployee +
                ",\n  grade = " + grade +
                ",\n  contactNumber = " + contactNumber +
                ",\n  experienceYears = " + experienceYears +
                ",\n  bonusAmount = " + bonusAmount +
                ",\n  rating = " + rating +
                ",\n  remoteWork = " + remoteWork +
                ",\n  employeeCode = " + employeeCode +
                "\n}";
    }
}

