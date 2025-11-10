package com.xworkz.methodsinjava.external;

import com.xworkz.methodsinjava.dto.CompanyDto;

public class CompanyRunner {

    public static void main(String[] args) {

        CompanyDto firstCompany = new CompanyDto();

        firstCompany.setCompanyId(401);
        firstCompany.setCompanyName("TechNova Solutions");
        firstCompany.setIndustry("Information Technology");
        firstCompany.setRegistrationNumber(20251104001L);
        firstCompany.setPubliclyListed(true);
        firstCompany.setRating('A');
        firstCompany.setRevenue(1250000000.50);
        firstCompany.setNumberOfEmployees(1200);
        firstCompany.setMarketCap(50000000000L);
        firstCompany.setProfitMargin(12.5);
        firstCompany.setEps(18.75f);
        firstCompany.setIsStartup(false);

        CompanyDto secondCompany = new CompanyDto();

        secondCompany.setCompanyId(401);
        secondCompany.setCompanyName("TechNova Solutions");
        secondCompany.setIndustry("Information Technology");
        secondCompany.setRegistrationNumber(20251104001L);
        secondCompany.setPubliclyListed(true);
        secondCompany.setRating('A');
        secondCompany.setRevenue(1250000000.50);
        secondCompany.setNumberOfEmployees(1200);
        secondCompany.setMarketCap(50000000000L);
        secondCompany.setProfitMargin(12.5);
        secondCompany.setEps(18.75f);
        secondCompany.setIsStartup(false);

        System.out.println("---- FIRST COMPANY DETAILS ----");
        System.out.println(firstCompany);

        System.out.println("\n---- SECOND COMPANY DETAILS ----");
        System.out.println(secondCompany);

        System.out.println("\nHashCode of first company = " + firstCompany.hashCode());
        System.out.println("HashCode of second company = " + secondCompany.hashCode());

        System.out.println("\nAre both companies equal? " + firstCompany.equals(secondCompany));
    }
}

