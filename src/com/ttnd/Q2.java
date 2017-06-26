package com.ttnd;

//Write a method that takes a string and returns the number of unique characters in the string.

import java.util.HashSet;
import java.util.Scanner;

public class Q2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String data = input.next();
        
        char[] charArray = data.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        
        int i = 0;
        while (i < charArray.length)
            set.add(charArray[i++]);
        
        System.out.println(set);
    }
}
