package com.ttnd;

//Write a program to sort the Student objects based on Score ,
// if the score are same then sort on First Name .


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    Double score;
    Integer age;
    
    public String getName() {
        return name;
    }
    
    public Double getScore() {
        return score;
    }
    
    public Student(String name, Double score, Integer age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }
}


class StudentComaprator implements Comparator<Student> {
    
    public int compare(Student s1,Student s2){
        String x1 = s1.getName();
        String x2 = s2.getName();
        int sComp = x1.compareTo(x2);
    
        if (sComp != 0) {
            return sComp;
        } else {
            Double score1 = s1.getScore();
            Double score2 = s2.getScore();
            return score1.compareTo(score2);
        }
    }
    
}



public class Q5 {
    
    public static void main(String[] args) {
    
        List<Student> al = new ArrayList<Student>();
    
        al.add(new Student("Suman"   ,96.9,24 ));
        al.add(new Student("Sonali"  ,95.9,24 ));
        al.add(new Student("Supriya" ,96.9,23 ));
        al.add(new Student("Shruti"  ,99.2,25 ));
        al.add(new Student("Stuti"   ,91.5,26 ));
    
    
        Collections.sort(al, new StudentComaprator());
    
        for (Student s : al) {
            System.out.println("Name: " + s.name + "\nScore: " + s.score + "\nAge: " + s.age);
            System.out.println(" ");
        }
    }
}
