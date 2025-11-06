package com.xworkz.wrapperhashcode.dto;

public class BankDto {
    private int price;
    private String bankName;
    private boolean isBank;
    private  Integer borrow;
    public void setPrice(int price){
        this.price=price;
    }
    public void setBankName(String bankName){
        this.bankName=bankName;
    }
    public void isBank(boolean isBank){
        this.isBank=isBank;
    }

    public void setBorrow(Integer borrow) {
        this.borrow = borrow;
    }
    public int getPrice(){
        return price=price;
    }
    public String getBankName(){
        return bankName=bankName;
    }
    public boolean isBank(){
        return isBank=isBank;
    }
    public Integer getBorrow(){
        return borrow=borrow;
    }

        @Override
        public int hashCode() {
            int prime = 31;
            int result = 1;
            result = prime * result + price;
            result = prime * result + (bankName == null ? 0 : bankName.hashCode());
            result = prime * result + (isBank ? 1 : 0);
            result = prime * result + (borrow == null ? 0 : borrow.hashCode());
            return result;
        }
    }

