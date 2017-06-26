package com.ttnd;

//Write a program to format date as example "21-March-2016"

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q8 {
    
    public static void main(String[] args) {
        
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String result = dateFormat.format(date);
        System.out.println(result);
    }
}
