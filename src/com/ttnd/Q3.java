package com.ttnd;

//Write a method that takes a string and
//print the number of occurrence of each character characters in the string.

import java.util.*;

public class Q3 {
    
    public static void main(String[] args) {
        
        int count;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String data = input.next();
        
        char[] charArray = data.toCharArray();
        HashMap charMap = new HashMap();
        
        for (char ch : charArray) {
            count = 1;
            if (charMap.containsKey(ch)) {
                count = (int) charMap.get(ch);
                charMap.put(ch, ++count);
            } else {
                charMap.put(ch, count);
            }
        }
        
        Set set = charMap.entrySet();
        Iterator iterator = set.iterator();
        
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.println("Character is: " + mentry.getKey() + " & No. of occurences are: " + mentry.getValue());
        }
    }
}
