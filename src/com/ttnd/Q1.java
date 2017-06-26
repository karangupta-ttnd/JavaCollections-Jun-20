package com.ttnd;

//Write Java code to define List .
// Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.

import java.util.ArrayList;
import java.util.Iterator;

public class Q1 {
    
    public static void main(String[] args) {
        
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(356.22);
        list.add(3464.22);
        list.add(36.22);
        list.add(6.22);
        list.add(35612.3122);
        
        Iterator itr = list.iterator();
        Double sum = 0.0;
        
        while (itr.hasNext())
            sum += (Double) itr.next();
        
        System.out.println("Sum of numbers are: " + sum);
    }
    
}
