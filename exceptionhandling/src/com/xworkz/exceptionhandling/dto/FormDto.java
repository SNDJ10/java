package com.xworkz.exceptionhandling.dto;

import java.util.Objects;

public class FormDto {
    private int age;
    private String mail;
    private long mobileNumber;
    private String password;
    private float evening;
    private float morning;
    private int el;
    private int totalEmploye;
    private boolean male;
    private boolean credited;

    public FormDto(int age, String mail, long mobileNumber, String password,
                   float evening, float morning, int el, int totalEmploye,
                   boolean male, boolean credited) {

        this.age = age;
        this.mail = mail;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.evening = evening;
        this.morning = morning;
        this.el = el;
        this.totalEmploye = totalEmploye;
        this.male = male;
        this.credited = credited;
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

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getEvening() {
        return evening;
    }

    public void setEvening(float evening) {
        this.evening = evening;
    }

    public float getMorning() {
        return morning;
    }

    public void setMorning(float morning) {
        this.morning = morning;
    }

    public int getEl() {
        return el;
    }

    public void setEl(int el) {
        this.el = el;
    }

    public int getTotalEmploye() {
        return totalEmploye;
    }

    public void setTotalEmploye(int totalEmploye) {
        this.totalEmploye = totalEmploye;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean gender) {
        this.male = male;
    }

    public boolean isCredited() {
        return credited;
    }

    public void setCredited(boolean credited) {
        this.credited = credited;
    }

    @Override
    public String toString() {
        return "FormDto{" +
                "age=" + age +
                ", mail='" + mail + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", password='" + password + '\'' +
                ", evening=" + evening +
                ", morning=" + morning +
                ", el=" + el +
                ", totalEmploye=" + totalEmploye +
                ", male=" + male +
                ", credited=" + credited +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FormDto)) return false;
        FormDto formDto = (FormDto) o;
        return age == formDto.age
                && mobileNumber == formDto.mobileNumber
                && Float.compare(evening, formDto.evening) == 0
                && Float.compare(morning, formDto.morning) == 0
                && el == formDto.el
                && totalEmploye == formDto.totalEmploye
                && male == formDto.male
                && credited == formDto.credited
                && Objects.equals(mail, formDto.mail)
                && Objects.equals(password, formDto.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, mail, mobileNumber, password, evening, morning,
                el, totalEmploye, male, credited);
    }
}
