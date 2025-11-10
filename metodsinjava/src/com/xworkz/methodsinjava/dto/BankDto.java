package com.xworkz.methodsinjava.dto;

import java.util.Objects;

public class BankDto {

    // -----------------------------
    // Primitive Data Types
    // -----------------------------
    private int price;
    private long accountNo;
    private boolean active;
    private char grade;
    private double loanAmount;
    private float interest;

    // -----------------------------
    // Non-Primitive (Wrapper) Data Types
    // -----------------------------
    private Integer branchCode;
    private Long phoneNumber;
    private Boolean isNationalized;
    private Character rating;
    private Double deposit;
    private Float atmLimit;
    private String bankName;

    // -----------------------------
    // Setters
    // -----------------------------
    public void setPrice(int price) {
        this.price = price;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public void setBranchCode(Integer branchCode) {
        this.branchCode = branchCode;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setIsNationalized(Boolean isNationalized) {
        this.isNationalized = isNationalized;
    }

    public void setRating(Character rating) {
        this.rating = rating;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public void setAtmLimit(Float atmLimit) {
        this.atmLimit = atmLimit;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    // -----------------------------
    // Getters
    // -----------------------------
    public int getPrice() {
        return price;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public boolean isActive() {
        return active;
    }

    public char getGrade() {
        return grade;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public float getInterest() {
        return interest;
    }

    public Integer getBranchCode() {
        return branchCode;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Boolean getIsNationalized() {
        return isNationalized;
    }

    public Character getRating() {
        return rating;
    }

    public Double getDeposit() {
        return deposit;
    }

    public Float getAtmLimit() {
        return atmLimit;
    }

    public String getBankName() {
        return bankName;
    }

    // -----------------------------
    // hashCode()
    // -----------------------------
    @Override
    public int hashCode() {
        return Objects.hash(price, accountNo, active, grade, loanAmount, interest,
                branchCode, phoneNumber, isNationalized, rating, deposit, atmLimit, bankName);
    }

    // -----------------------------
    // equals()
    // -----------------------------
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof BankDto)) return false;
        BankDto other = (BankDto) obj;
        return price == other.price &&
                accountNo == other.accountNo &&
                active == other.active &&
                grade == other.grade &&
                Double.compare(other.loanAmount, loanAmount) == 0 &&
                Float.compare(other.interest, interest) == 0 &&
                Objects.equals(branchCode, other.branchCode) &&
                Objects.equals(phoneNumber, other.phoneNumber) &&
                Objects.equals(isNationalized, other.isNationalized) &&
                Objects.equals(rating, other.rating) &&
                Objects.equals(deposit, other.deposit) &&
                Objects.equals(atmLimit, other.atmLimit) &&
                Objects.equals(bankName, other.bankName);
    }

    // -----------------------------
    // toString()
    // -----------------------------
    @Override
    public String toString() {
        return "BankDto {" +
                "\n  price=" + price +
                ",\n  accountNo=" + accountNo +
                ",\n  active=" + active +
                ",\n  grade=" + grade +
                ",\n  loanAmount=" + loanAmount +
                ",\n  interest=" + interest +
                ",\n  branchCode=" + branchCode +
                ",\n  phoneNumber=" + phoneNumber +
                ",\n  isNationalized=" + isNationalized +
                ",\n  rating=" + rating +
                ",\n  deposit=" + deposit +
                ",\n  atmLimit=" + atmLimit +
                ",\n  bankName='" + bankName + '\'' +
                "\n}";
    }
}
