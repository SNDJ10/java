package com.xworkz.methodsinjava.dto;

import java.util.Objects;

public class StudentDto {

    // ------------------------------------------------
    // ✅ Primitive Data Types
    // ------------------------------------------------
    private int studentRollNumber;        // unique roll number
    private double studentMarks;          // total marks
    private boolean passedExam;           // exam result
    private char section;                 // section character
    private long registrationNumber;      // long registration ID

    // ------------------------------------------------
    // ✅ Non-Primitive (Wrapper) Data Types
    // ------------------------------------------------
    private String studentName;           // student full name
    private String courseName;            // course enrolled
    private Integer age;                  // age in years
    private Double attendancePercentage;  // attendance percentage
    private Float cgpa;                   // cumulative GPA
    private Boolean scholarshipEligible;  // eligibility for scholarship
    private Long studentIdCard;           // ID card number

    // ------------------------------------------------
    // ✅ Setters
    // ------------------------------------------------
    public void setStudentRollNumber(int studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    public void setStudentMarks(double studentMarks) {
        this.studentMarks = studentMarks;
    }

    public void setPassedExam(boolean passedExam) {
        this.passedExam = passedExam;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public void setRegistrationNumber(long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAttendancePercentage(Double attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }

    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }

    public void setScholarshipEligible(Boolean scholarshipEligible) {
        this.scholarshipEligible = scholarshipEligible;
    }

    public void setStudentIdCard(Long studentIdCard) {
        this.studentIdCard = studentIdCard;
    }

    // ------------------------------------------------
    // ✅ Getters
    // ------------------------------------------------
    public int getStudentRollNumber() {
        return studentRollNumber;
    }

    public double getStudentMarks() {
        return studentMarks;
    }

    public boolean isPassedExam() {
        return passedExam;
    }

    public char getSection() {
        return section;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public Integer getAge() {
        return age;
    }

    public Double getAttendancePercentage() {
        return attendancePercentage;
    }

    public Float getCgpa() {
        return cgpa;
    }

    public Boolean getScholarshipEligible() {
        return scholarshipEligible;
    }

    public Long getStudentIdCard() {
        return studentIdCard;
    }

    // ------------------------------------------------
    // ✅ hashCode()
    // ------------------------------------------------
    @Override
    public int hashCode() {
        return Objects.hash(
                studentRollNumber,
                studentMarks,
                passedExam,
                section,
                registrationNumber,
                studentName,
                courseName,
                age,
                attendancePercentage,
                cgpa,
                scholarshipEligible,
                studentIdCard
        );
    }

    // ------------------------------------------------
    // ✅ equals()
    // ------------------------------------------------
    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        StudentDto other = (StudentDto) object;

        return studentRollNumber == other.studentRollNumber &&
                Double.compare(other.studentMarks, studentMarks) == 0 &&
                passedExam == other.passedExam &&
                section == other.section &&
                registrationNumber == other.registrationNumber &&
                Objects.equals(studentName, other.studentName) &&
                Objects.equals(courseName, other.courseName) &&
                Objects.equals(age, other.age) &&
                Objects.equals(attendancePercentage, other.attendancePercentage) &&
                Objects.equals(cgpa, other.cgpa) &&
                Objects.equals(scholarshipEligible, other.scholarshipEligible) &&
                Objects.equals(studentIdCard, other.studentIdCard);
    }

    // ------------------------------------------------
    // ✅ toString()
    // ------------------------------------------------
    @Override
    public String toString() {
        return "StudentDto {" +
                "\n  studentRollNumber = " + studentRollNumber +
                ",\n  studentName = '" + studentName + '\'' +
                ",\n  courseName = '" + courseName + '\'' +
                ",\n  studentMarks = " + studentMarks +
                ",\n  passedExam = " + passedExam +
                ",\n  section = " + section +
                ",\n  registrationNumber = " + registrationNumber +
                ",\n  age = " + age +
                ",\n  attendancePercentage = " + attendancePercentage +
                ",\n  cgpa = " + cgpa +
                ",\n  scholarshipEligible = " + scholarshipEligible +
                ",\n  studentIdCard = " + studentIdCard +
                "\n}";
    }
}

