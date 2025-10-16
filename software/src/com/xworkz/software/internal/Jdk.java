package com.xworkz.software.internal;

public class Jdk extends AiTools{
    public String name;
    public String chatBot;

    public Jdk(String name,String chatBot){

super(name,chatBot);
        this.name=name;
        this.chatBot=chatBot;



    }
    public void displayJdk(){

        System.out.println("this is the child class"+name);
        System.out.println(chatBot);


    }
}
