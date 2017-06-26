package com.ttnd;

//Print the elements of an array in the decreasing frequency,
// if 2 numbers have same frequency then print the one which came first.

import java.util.*;

class numbersComparator implements Comparator<Map.Entry<Integer, Integer>>{
    
    public int compare( Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer>  o2 )
    {
        return (o2.getValue()).compareTo( o1.getValue() );
    }
    
}


public class Q6 {
    
    public static void main(String[] args) {
    
        int count;
        int[] numbers = {5, 2, 6, 3, 7, 4, 8, 2, 0, 9};
    
        Map numMap = new HashMap();
        
        for (int i : numbers) {
            count = 1;
            if (numMap.containsKey(i)) {
                count = (int) numMap.get(i);
                numMap.put(i, ++count);
            } else {
                numMap.put(i, count);
            }
        }
        
        List list = new ArrayList(numMap.entrySet());
        Collections.sort( list, new numbersComparator());
        Iterator iterator = list.iterator();
    
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.println("Character is: " + mentry.getKey() + " & No. of occurences are: " + mentry.getValue());
        }
        
    }
}
