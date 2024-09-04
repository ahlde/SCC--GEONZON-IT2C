package javaapp;

import java.util.*;
public class Salary {
    
    
    public static void Employees(){
        
        Salaries[] sal = new Salaries[100];
        
        Scanner sr = new Scanner(System.in);
        
        int ID, rate = 0, hr, ttal_duc, num_emp;
        String name;
        float Salary = 0, TDeduc = 0;
        
        System.out.println("Enter the no. of Employees: ");
        num_emp = sr.nextInt();
        
        for (int i = 0; i < num_emp; i++){
            System.out.println("Details of Employee "+(i+1)+":");
            System.out.println("ID: ");
            ID = sr.nextInt();
            
            System.out.println("Name: ");
            name = sr.next();
            
            System.out.println("Rate (Hour): ");
            hr = sr.nextInt();
            
            System.out.println("Total Deduction: ");
            ttal_duc = sr.nextInt();
            
            sal [i]= new Salaries();
            sal[i].addEmp(ID, name, rate, hr, ttal_duc);
            
            Salary +=(rate * hr);
            TDeduc +=(ttal_duc);
            

        
    

