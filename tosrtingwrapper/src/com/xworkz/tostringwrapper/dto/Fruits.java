package com.xworkz.tostringwrapper.dto;

public class Fruits {
    private int amount;
    private String fruitName;
    private boolean isThere;
    private Integer weight;
    public void setAmount(int amount){
        this.amount=amount;
    }
    public void setFruitName(String fruitName){
        this.fruitName=fruitName;
    }
    public void isThere(boolean isThere){
        this.isThere=isThere;
    }
    public void setWeight(Integer weight){
        this.weight=weight;
    }
    public int getAmount(){
        return amount;
    }
    public String getFruitName(){
        return fruitName;
    }
    public boolean isThere(){
        return isThere;
    }
    public Integer getWeight(){
        return weight;
    }
    @Override
    public String toString(){
        return "Fruits[amount ="+amount+"fruitName =" +fruitName+"isThere ="+isThere +"weight ="+weight+"]";
    }
}
