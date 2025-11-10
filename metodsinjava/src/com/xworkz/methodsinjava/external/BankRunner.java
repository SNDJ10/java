package com.xworkz.methodsinjava.external;

import com.xworkz.methodsinjava.dto.BankDto;

public class BankRunner {
    public static void main(String[] args) {

        BankDto bank1 = new BankDto();
        bank1.setPrice(2500);
        bank1.setAccountNo(987654321L);
        bank1.setActive(true);
        bank1.setGrade('A');
        bank1.setLoanAmount(150000.50);
        bank1.setInterest(7.2f);
        bank1.setBranchCode(2024);
        bank1.setPhoneNumber(9876543210L);
        bank1.setIsNationalized(true);
        bank1.setRating('B');
        bank1.setDeposit(500000.75);
        bank1.setAtmLimit(40000.0f);
        bank1.setBankName("State Bank of Karehatti");

        BankDto bank2 = new BankDto();
        bank2.setPrice(2500);
        bank2.setAccountNo(987654321L);
        bank2.setActive(true);
        bank2.setGrade('A');
        bank2.setLoanAmount(150000.50);
        bank2.setInterest(7.2f);
        bank2.setBranchCode(2024);
        bank2.setPhoneNumber(9876543210L);
        bank2.setIsNationalized(true);
        bank2.setRating('B');
        bank2.setDeposit(500000.75);
        bank2.setAtmLimit(40000.0f);
        bank2.setBankName("State Bank of Karehatti");

        // Print objects
        System.out.println("---- BANK 1 DETAILS ----");
        System.out.println(bank1);

        System.out.println("\n---- BANK 2 DETAILS ----");
        System.out.println(bank2);

        // Compare hashCodes and equals
        System.out.println("\nHashCode of Bank1: " + bank1.hashCode());
        System.out.println("HashCode of Bank2: " + bank2.hashCode());
        System.out.println("\nAre both objects equal? " + bank1.equals(bank2));
    }
}
