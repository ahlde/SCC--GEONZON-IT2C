package javaapp;

import java.util.*;


public class Salary {
    
    public static void Employees(){
        
        Salaries[] sl = new Salaries[100];
        Scanner sr = new Scanner(System.in);
        
        
        int ID, rate = 0, hr, ttal_duc, num_emp;
        String name;
        double Salary = 0, TDeduc = 0;
        
        System.out.print("Enter the no. of Employees: ");
        num_emp = sr.nextInt();
        
        for (int i = 0; i < num_emp; i++){
            System.out.println("Details of Employee "+(i+1)+":");
            
            System.out.print("ID: ");
            ID = sr.nextInt();
            
            System.out.print("Name: ");
            name = sr.next();
            
            System.out.print("Rate (Hour): ");
            rate = sr.nextInt();
            
            System.out.print("Hours Worked: ");
            hr = sr.nextInt();
            
            System.out.print("Total Deduction: ");
            ttal_duc = sr.nextInt();
            
            sl [i]= new Salaries();
            sl[i].addEmployee(ID, name, rate, hr, ttal_duc);
                    
            Salary +=(rate * hr);
            TDeduc +=(ttal_duc);
            
        }
         
        System.out.println("\n");
        System.out.printf("%-8s  %-10s  %-10s  %-10s  %-10s  %-12s  %-10s\n", "ID", "Name", "Rate", "Hours", "Gross", "Deductions", "Net Pay");
        
        for (int i = 0; i<num_emp; i++ ){
            sl[i].viewEmployee();
        }
        
        System.out.printf("\nTotal Salary for Request: %.2f", Salary);
        System.out.printf("\nTotal Deductions: %.2f", TDeduc);
        System.out.printf("\nTotal Net Pay: %.2f", (Salary - TDeduc));
    }
        
}   

