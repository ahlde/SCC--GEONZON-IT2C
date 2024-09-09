package javaapp;

import java.util.Scanner;

public class Grade {
    
    public static void genGrades() {
        
        Scanner sc = new Scanner (System.in);
        Grades[] gr = new Grades[100];
        
        String name;
        int num, id, i;
        double p, m, pf, f;
        
        System.out.print("Enter no. of Students: ");
        num = sc.nextInt();
        
        for (i = 0; i < num; i++){
            
            System.out.println("\nEnter details of students "+(i+1)+":");
            
            System.out.print("\tID: ");
            id = sc.nextInt();
            
            System.out.print("\tName: ");
            name = sc.next();
            
            System.out.print("\tPrelim: ");
            p = sc.nextDouble();
            
            System.out.print("\tMidterm: ");
            m = sc.nextDouble();
            
            System.out.print("\tPrefinal: ");
            pf = sc.nextDouble();
            
            System.out.print("\tFinals: ");
            f= sc.nextDouble();
            
            gr[i] = new Grades();
            gr[i].addGrades(id, name, p, m, pf, f);
        }
            
        for (i =0; i < num; i++){
            
            gr[i].viewGrades();
            
            
        }
    } 
}
