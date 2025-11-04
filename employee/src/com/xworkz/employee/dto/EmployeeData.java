package com.xworkz.employee.dto;

public class EmployeeData {
    private byte experience;
    private short leavesTaken;
    private int empId;
    private long salary;
    private float performanceScore;
    private double bonus;
    private char level;
    private boolean active;
    private String empName;

    public void setExperience(byte experience) { this.experience = experience; }
    public byte getExperience() { return experience; }

    public void setLeavesTaken(short leavesTaken) { this.leavesTaken = leavesTaken; }
    public short getLeavesTaken() { return leavesTaken; }

    public void setEmpId(int empId) { this.empId = empId; }
    public int getEmpId() { return empId; }

    public void setSalary(long salary) { this.salary = salary; }
    public long getSalary() { return salary; }

    public void setPerformanceScore(float performanceScore) { this.performanceScore = performanceScore; }
    public float getPerformanceScore() { return performanceScore; }

    public void setBonus(double bonus) { this.bonus = bonus; }
    public double getBonus() { return bonus; }

    public void setLevel(char level) { this.level = level; }
    public char getLevel() { return level; }

    public void setActive(boolean active) { this.active = active; }
    public boolean isActive() { return active; }

    public void setEmpName(String empName) { this.empName = empName; }
    public String getEmpName() { return empName; }
}

