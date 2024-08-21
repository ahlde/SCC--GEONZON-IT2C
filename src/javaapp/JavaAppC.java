package javaapp;

import java.util.Scanner;

public class JavaAppC {
  
    public void getPay (){
       
        Scanner input = new Scanner (System.in);
        
        String name;
        int age, rate, hours, ded;
        float gross, netP;
        
        System.out.print("Enter your name: ");
        name= input.nextLine();
        
        System.out.print("Enter your age: ");
        age= input.nextInt();
        
        System.out.print("Rate per hour: ");
        rate= input.nextInt();
        
        System.out.println("Hours Worked: ");
        hours= input.nextInt();
        
        System.out.println("Enter total deductions: ");
        ded= input.nextInt();
        
        gross =(float)rate*hours;
        netP = gross - ded;
        
        System.out.println("(---------------------------");
        System.out.println("(SLIP DETAILS");
        System.out.println("----------------------------");
        
        System.out.println("Date: August 14, 2024");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        
        System.out.printf("Total Gross: %.2f", gross);
        System.out.println("Total Deductions:"+ ded);
        
        System.out.println("------------------------------");
        System.out.printf("Net Pay: %.2f", netP);
        System.out.println("\n----------------------------");
   }    
}
