package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CompanyNamesRunner {
    public static void main(String[] args) {
        List<String> companyList = new ArrayList<>();
        companyList.add("Google");
        companyList.add("Microsoft");
        companyList.add("Amazon");
        companyList.add("Oracle");
        companyList.add("Infosys");
        companyList.add("TCS");
        companyList.add("Wipro");
        companyList.add("IBM");

        ListIterator<String> companyIterator = companyList.listIterator();
        while (companyIterator.hasNext()) {
            Object object = companyIterator.next();
            String company = (String) object;

            if (company.equals("Microsoft")) {
                companyIterator.add("Adobe");
            }
            if (company.equals("Infosys")) {
                companyIterator.add("Accenture");
            }

            System.out.println(company);
        }
        System.out.println("Final list of company names===" + companyList);
    }
}

