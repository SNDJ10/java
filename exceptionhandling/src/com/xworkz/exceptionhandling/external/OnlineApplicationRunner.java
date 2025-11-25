package com.xworkz.exceptionhandling.external;

import com.xworkz.exceptionhandling.dto.ApplicationDto;
import com.xworkz.exceptionhandling.internal.OnlineAplication;

public class OnlineApplicationRunner {
    public static void main(String[] args) {
        OnlineAplication onlineAplication=new OnlineAplication();
        ApplicationDto aplicationDto=new ApplicationDto(5.00d,22,"sanjay@123gmail.com",6360211265l,"sanjay@123",9.30d,12,888,"male","credited");
        onlineAplication.saveOperation(aplicationDto);

    }
}
