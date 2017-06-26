package com.ttnd;

        //Write a program to display times in different country format.

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Q9 {
    
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("today is "+ d1.toString());
        Locale locItalian = new Locale("it","ch");
        DateFormat df = DateFormat.getDateInstance (DateFormat.FULL, locItalian);
        System.out.println("today is in Italian Language  in Switzerland Format : "+ df.format(d1));
    }
    
}
