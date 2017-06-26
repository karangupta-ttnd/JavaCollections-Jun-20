package com.ttnd;

//Write a program to sort Employee objects based on highest salary using Comparator.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    Integer age;
    Integer salary;
    String name;
    
    public Employee(Integer age, Integer salary, String name) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
}

class SalaryComparator implements Comparator<Employee> {
    
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.salary == emp2.salary)
            return 0;
        else if (emp1.salary > emp2.salary)
            return 1;
        else
            return -1;
    }
}


public class Q4 {
    
    public static void main(String[] args) {
        
        List<Employee> al = new ArrayList<Employee>();
        
        al.add(new Employee(24, 365633, "Suman"));
        al.add(new Employee(24, 635333, "Sonali"));
        al.add(new Employee(23, 563363, "Supriya"));
        al.add(new Employee(25, 365656, "Shruti"));
        al.add(new Employee(26, 653633, "Stuti"));
        
        Collections.sort(al, new SalaryComparator());
        
        for (Employee emp : al) {
            System.out.println("Name: " + emp.name + "\nSalary: " + emp.age + "\nAge: " + emp.salary);
            System.out.println(" ");
        }
        
    }
}
