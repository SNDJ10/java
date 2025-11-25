package com.xworkz.exceptionhandling.dto;

import java.util.Objects;

public class ApplicationDto {
    private double logout;
    private int age;
    private String mail;
    private long phNumber;
    private String password;
    private double loging;
    private int totalEl;
    private int employee;
    private String gender;
    private String notCredited;

    public ApplicationDto(double logout, int age, String mail, long phNumber,
                         String password, double loging, int totalEl, int employee,
                         String gender, String notCredited) {

        this.logout = logout;
        this.age = age;
        this.mail = mail;
        this.phNumber = phNumber;
        this.password = password;
        this.loging = loging;
        this.totalEl = totalEl;
        this.employee = employee;
        this.gender = gender;
        this.notCredited = notCredited;
    }

    public double getLogout() {
        return logout;
    }

    public void setLogout(double logout) {
        this.logout = logout;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(long phNumber) {
        this.phNumber = phNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getLoging() {
        return loging;
    }

    public void setLoging(double loging) {
        this.loging = loging;
    }

    public int getTotalEl() {
        return totalEl;
    }

    public void setTotalEl(int totalEl) {
        this.totalEl = totalEl;
    }

    public int getEmployee() {
        return employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNotCredited() {
        return notCredited;
    }

    public void setNotCredited(String notCredited) {
        this.notCredited = notCredited;
    }

    @Override
    public String toString() {
        return "ApplicationDto{" +
                "logout=" + logout +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                ", phNumber=" + phNumber +
                ", password='" + password + '\'' +
                ", loging=" + loging +
                ", totalEl=" + totalEl +
                ", employee=" + employee +
                ", gender='" + gender + '\'' +
                ", notCredited='" + notCredited + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ApplicationDto)) return false;
        ApplicationDto that = (ApplicationDto) o;
        return Double.compare(logout, that.logout) == 0 && age == that.age && phNumber == that.phNumber && Double.compare(loging, that.loging) == 0 && totalEl == that.totalEl && employee == that.employee && Objects.equals(mail, that.mail) && Objects.equals(password, that.password) && Objects.equals(gender, that.gender) && Objects.equals(notCredited, that.notCredited);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logout, age, mail, phNumber, password, loging, totalEl, employee, gender, notCredited);
    }
}
