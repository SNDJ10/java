package com.xworkz.runtimeexceptionclass.internal;

import com.xworkz.runtimeexceptionclass.events.NumberOutOfBound;

public class SocialMedia {
    public void noOfApp() throws NumberOutOfBound {
        throw new NumberOutOfBound();
    }
    public SocialMedia(int age){
        if(age>50){
            System.out.println("this is right age");
        }else {
            System.out.println("this is grand father");
        }
    }
    public void artthimaticException(){
        throw new RuntimeException();

    }
}

