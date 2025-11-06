package com.xworkz.wrapperhashcode.external;

import com.xworkz.wrapperhashcode.dto.BankDto;

public class BankRunner {
    public static void main(String[] args) {
        BankDto bankDto=new BankDto();
        bankDto.setPrice(2500);
        bankDto.setBankName("state bank of karehatti");
        bankDto.isBank(false);
        bankDto.setBorrow(250000);
        System.out.println(bankDto.hashCode());
    }
}
