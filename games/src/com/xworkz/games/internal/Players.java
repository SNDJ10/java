package com.xworkz.games.internal;

public class Players {
    public String players;
    public int salary;
    public Players(String players,int salary){

        this.players=players;
        this.salary=salary;


    }
    public void playersDetails(){


        System.out.println("this is child class players"+players);
        System.out.println("this is child class salary"+salary);
    }
}
