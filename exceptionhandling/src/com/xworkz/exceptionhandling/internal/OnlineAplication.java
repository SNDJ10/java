package com.xworkz.exceptionhandling.internal;

import com.xworkz.exceptionhandling.dto.ApplicationDto;
import com.xworkz.exceptionhandling.events.*;

public class OnlineAplication {
    public void saveOperation(ApplicationDto aplicationDto){
        if (aplicationDto!=null){
            if (aplicationDto.getLogout()<5.30d){
                try {
                    throw new EarlyLogoutException();
                }catch (EarlyLogoutException earlyLogoutException){
                    earlyLogoutException.printStackTrace();
                }
                if (aplicationDto.getAge()<18) {
                    try {
                        throw new InvalidAgeException();
                    } catch (InvalidAgeException invalidAgeException) {
                        invalidAgeException.printStackTrace();
                        System.err.println("Your a below 18 years old..... ");
                    }
                }
                else if (aplicationDto.getMail().contains("123")){
                    try {
                        throw new InvalidEmailException();
                    }catch (InvalidEmailException invalidEmailException){
                        invalidEmailException.printStackTrace();
                        System.err.println("its a Invalid Email check once....");
                    }
                }
                else if (aplicationDto.getPhNumber()==6360211265l) {
                    try {
                        throw new InvalidMobilNumberException();
                    }catch (InvalidMobilNumberException invalidMobilNumberException){
                        invalidMobilNumberException.printStackTrace();
                        System.err.println("its a red zone alert number....");
                    }
                }
                else if (aplicationDto.getPassword()=="Prasad@123") {
                    try {
                        throw new InvalidPasswordException();
                    }catch (InvalidPasswordException invalidPasswordException){
                        invalidPasswordException.printStackTrace();
                        System.err.println("You have to change the password...");
                    }
                }
                else if (aplicationDto.getLoging()>9.00f) {
                    try {
                        throw new LateLoginException();
                    }catch (LateLoginException lateLoginException){
                        lateLoginException.printStackTrace();
                        System.err.println("yor login timeing is late....");
                    }
                }
                else if (aplicationDto.getTotalEl()<18){
                    try {
                        throw new LessElException();
                    }catch (LessElException lessElException){
                        lessElException.printStackTrace();
                        System.err.println("employee having less El's...");
                    }
                }
                else if (aplicationDto.getEmployee()<999){
                    try {
                        throw new LessEmployeeException();
                    }catch (LessEmployeeException lessEmployeeException){
                        lessEmployeeException.printStackTrace();
                        System.err.println("there ar less employes...");
                    }
                }
                else if (aplicationDto.getGender()=="male"){
                    try {
                        throw new MissMatchGenderException();
                    }catch (MissMatchGenderException missMatchGenderException){
                        missMatchGenderException.printStackTrace();
                        System.err.println("gender miss matched...");
                    }
                }
                else if (aplicationDto.getNotCredited()=="notCredited"){
                    try {
                        throw new SalaryNotCreditedException();
                    }catch (SalaryNotCreditedException salaryNotCreditedException){
                        salaryNotCreditedException.printStackTrace();
                    }
                }
            }
        }
    }
}
