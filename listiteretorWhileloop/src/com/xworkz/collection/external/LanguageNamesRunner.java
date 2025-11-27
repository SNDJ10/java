package com.xworkz.collection.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LanguageNamesRunner {
    public static void main(String[] args) {
        List<String> languageList = new ArrayList<>();
        languageList.add("English");
        languageList.add("Hindi");
        languageList.add("Kannada");
        languageList.add("Tamil");
        languageList.add("Telugu");
        languageList.add("Malayalam");
        languageList.add("Marathi");
        languageList.add("Gujarati");

        ListIterator<String> languageIterator = languageList.listIterator();
        while (languageIterator.hasNext()) {
            Object object = languageIterator.next();
            String language = (String) object;

            if (language.equals("Hindi")) {
                languageIterator.add("Sanskrit");
            }
            if (language.equals("Tamil")) {
                languageIterator.add("Konkani");
            }

            System.out.println(language);
        }
        System.out.println("Final list of language names===" + languageList);
    }
}

