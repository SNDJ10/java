package com.xworkz.exceptionhandling.internal;

import com.xworkz.exceptionhandling.dto.FormDto;
import com.xworkz.exceptionhandling.events.*;

public class SocialMediaApp {
    public void validate(FormDto formDto){
        if (formDto!=null){
            if (formDto.getAge()<18){
                try {
                    throw new InvalidAgeException();
                }catch (InvalidAgeException invalidAgeException){
                    invalidAgeException.printStackTrace();
                    System.err.println("Your a below 18 years old..... ");
                }

            }else if (formDto.getMail().contains("123")){
                try {
                    throw new InvalidEmailException();
                }catch (InvalidEmailException invalidEmailException){
                    invalidEmailException.printStackTrace();
                    System.err.println("its a Invalid Email check once....");
                }
            } else if (formDto.getMobileNumber()==6360211265l) {
                try {
                    throw new InvalidMobilNumberException();
                }catch (InvalidMobilNumberException invalidMobilNumberException){
                    invalidMobilNumberException.printStackTrace();
                    System.err.println("its a red zone alert number....");
                }
            } else if (formDto.getPassword()=="Prasad@123") {
                try {
                    throw new InvalidPasswordException();
                }catch (InvalidPasswordException invalidPasswordException){
                    invalidPasswordException.printStackTrace();
                    System.err.println("You have to change the password...");
                }

            }else if (formDto.getEvening()<5.00f){
                try {
                    throw new EarlyLogoutException();
                }catch (EarlyLogoutException earlyLogoutException){
                    earlyLogoutException.printStackTrace();
                    System.err.println("your leaving the office early....");
                }
            } else if (formDto.getMorning()>9.00f) {
                try {
                    throw new LateLoginException();
                }catch (LateLoginException lateLoginException){
                    lateLoginException.printStackTrace();
                    System.err.println("yor login timeing is late....");
                }
            }else if (formDto.getEl()<18){
                try {
                    throw new LessElException();
                }catch (LessElException lessElException){
                    lessElException.printStackTrace();
                    System.err.println("employee having less El's...");
                }
            }else if (formDto.getTotalEmploye()<999){
                try {
                    throw new LessEmployeeException();
                }catch (LessEmployeeException lessEmployeeException){
                    lessEmployeeException.printStackTrace();
                    System.err.println("there ar less employes...");
                }
            }else if (formDto.isMale()==true){
                try {
                    throw new MissMatchGenderException();
                }catch (MissMatchGenderException missMatchGenderException){
                    missMatchGenderException.printStackTrace();
                    System.err.println("gender miss matched...");
                }
            }else if (formDto.isCredited()==false){
                try {
                    throw new SalaryNotCreditedException();
                }catch (SalaryNotCreditedException salaryNotCreditedException){
                    salaryNotCreditedException.printStackTrace();
                }
            }

        }
    }
}
