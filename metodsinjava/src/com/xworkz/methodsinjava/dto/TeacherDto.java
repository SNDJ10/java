package com.xworkz.methodsinjava.dto;

import java.util.Objects;

public class TeacherDto {

    private int teacherId;
    private long employeeNumber;
    private boolean fullTime;
    private char grade;
    private double salary;

    private String teacherName;
    private String subject;
    private Integer yearsOfExperience;
    private Long contactNumber;
    private Double performanceScore;
    private Float teachingHours;
    private Boolean classMentor;

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setEmployeeNumber(long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setPerformanceScore(Double performanceScore) {
        this.performanceScore = performanceScore;
    }

    public void setTeachingHours(Float teachingHours) {
        this.teachingHours = teachingHours;
    }

    public void setClassMentor(Boolean classMentor) {
        this.classMentor = classMentor;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public long getEmployeeNumber() {
        return employeeNumber;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public char getGrade() {
        return grade;
    }

    public double getSalary() {
        return salary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public Double getPerformanceScore() {
        return performanceScore;
    }

    public Float getTeachingHours() {
        return teachingHours;
    }

    public Boolean getClassMentor() {
        return classMentor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                teacherId,
                employeeNumber,
                fullTime,
                grade,
                salary,
                teacherName,
                subject,
                yearsOfExperience,
                contactNumber,
                performanceScore,
                teachingHours,
                classMentor
        );
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        TeacherDto other = (TeacherDto) object;
        if (teacherId != other.teacherId)
            return false;
        if (employeeNumber != other.employeeNumber)
            return false;
        if (fullTime != other.fullTime)
            return false;
        if (grade != other.grade)
            return false;
        if (Double.compare(other.salary, salary) != 0)
            return false;
        if (!Objects.equals(teacherName, other.teacherName))
            return false;
        if (!Objects.equals(subject, other.subject))
            return false;
        if (!Objects.equals(yearsOfExperience, other.yearsOfExperience))
            return false;
        if (!Objects.equals(contactNumber, other.contactNumber))
            return false;
        if (!Objects.equals(performanceScore, other.performanceScore))
            return false;
        if (!Objects.equals(teachingHours, other.teachingHours))
            return false;
        if (!Objects.equals(classMentor, other.classMentor))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "TeacherDto {"
                + "\n  teacherId = " + teacherId
                + ",\n  teacherName = '" + teacherName + '\''
                + ",\n  subject = '" + subject + '\''
                + ",\n  employeeNumber = " + employeeNumber
                + ",\n  fullTime = " + fullTime
                + ",\n  grade = " + grade
                + ",\n  salary = " + salary
                + ",\n  yearsOfExperience = " + yearsOfExperience
                + ",\n  contactNumber = " + contactNumber
                + ",\n  performanceScore = " + performanceScore
                + ",\n  teachingHours = " + teachingHours
                + ",\n  classMentor = " + classMentor
                + "\n}";
    }
}
