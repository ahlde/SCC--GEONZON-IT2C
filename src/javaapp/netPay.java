package javaapp;

import java.util.Scanner;

public class netPay {
  
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
        
        System.out.print("Hours Worked: ");
        hours= input.nextInt();
        
        System.out.print("Enter total deductions: ");
        ded= input.nextInt();
        
        gross =(float)rate*hours;
        netP = gross - ded;
        
        System.out.println("\n\n");
        System.out.println("---------------------------");
        System.out.println("       SLIP DETAILS        ");
        System.out.println("---------------------------\n");
        
        System.out.println("Date: August 14, 2024");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        
        System.out.printf("Total Gross: %.2f", gross);
        System.out.println("\nTotal Deductions: "+ ded);
        
        System.out.println("------------------------------");
        System.out.printf("Net Pay: %.2f", netP);
        System.out.println("\n----------------------------");
   }    
}
