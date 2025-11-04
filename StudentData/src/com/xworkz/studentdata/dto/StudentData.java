package com.xworkz.studentdata.dto;

public class StudentData {
    private byte age;
    private short totalSubjects;
    private int rollNo;
    private long phoneNumber;
    private float attendance;
    private double percentage;
    private char grade;
    private boolean passed;
    private String name;

    public void setAge(byte age) { this.age = age; }
    public byte getAge() { return age; }

    public void setTotalSubjects(short totalSubjects) { this.totalSubjects = totalSubjects; }
    public short getTotalSubjects() { return totalSubjects; }

    public void setRollNo(int rollNo) { this.rollNo = rollNo; }
    public int getRollNo() { return rollNo; }

    public void setPhoneNumber(long phoneNumber) { this.phoneNumber = phoneNumber; }
    public long getPhoneNumber() { return phoneNumber; }

    public void setAttendance(float attendance) { this.attendance = attendance; }
    public float getAttendance() { return attendance; }

    public void setPercentage(double percentage) { this.percentage = percentage; }
    public double getPercentage() { return percentage; }

    public void setGrade(char grade) { this.grade = grade; }
    public char getGrade() { return grade; }

    public void setPassed(boolean passed) { this.passed = passed; }
    public boolean isPassed() { return passed; }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
}
