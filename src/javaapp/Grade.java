package javaapp;

import java.util.Scanner;

public class Grade {
    
    public static void genGrades() {
        
        Scanner sc = new Scanner (System.in);
        Grades[] gr = new Grades[100];
        
        String name;
        int num, id, i;
        double p, m, pf, f;
        
        System.out.println("Enter no. of Students: ");
        num = sc.nextInt();
        
        for (i = 0; 1 < num; i++){
            
            System.out.println("\nEnter details of students "+(1+1)+":");
            
            System.out.println("\tID: ");
            id = sc.nextInt();
            
            System.out.println("\tName: ");
            name = sc.next();
            
            System.out.println("\tPrelim: ");
            p = sc.nextDouble();
            
            System.out.println("\tMidterm: ");
            m = sc.nextDouble();
            
            System.out.println("\tPrefinal: ");
            pf = sc.nextDouble();
            
            System.out.println("\tFinals: ");
            f= sc.nextDouble();
            
            gr[i] =new Grades();
            gr[i].addGrades(id, name,p, m, pf, f);
        }
            
        for (i =0; i < num; i++){
            
            gr[i].viewGrades();
            
            
        }
    } 
}
