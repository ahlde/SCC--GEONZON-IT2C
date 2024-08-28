/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Salaries {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String[] id;
        String[] name;
        int[] rate;
        int[] hr;
        int[] ttal_duc;

        System.out.print("Enter the number of employees: ");
        int em = sc.nextInt();

       
        id = new String[em];
        name = new String[em];
        rate = new int[em];
        hr = new int[em];
        ttal_duc = new int[em];

       
        int ttal_grs = 0;
        int ttal_ded = 0;
        int ttal_net = 0;

        for (int i=0;i<em;i++) {
            System.out.println("Details of Employee " + (i + 1));
            System.out.print("ID: ");
            id[i] = sc.next();
            System.out.print("Name: ");
            name[i] = sc.next();
            System.out.print("Rate (HOUR): ");
            rate[i] = sc.nextInt();
            System.out.print("Hours Worked: ");
            hr[i] = sc.nextInt();
            System.out.print("Total Deduction: ");
            ttal_duc[i] = sc.nextInt();
            System.out.println();

            
            int grs = hr[i] * rate[i];
            int netp = grs - ttal_duc[i];

            
            ttal_grs += grs;
            ttal_ded += ttal_duc[i];
            ttal_net += netp;
        }

       
        System.out.println("EMP ID    Name      Rate   Hours     Gross     Deductions       Netpay");
        for (int i = 0; i < em; i++) {
            int grs_sal = hr[i] * rate[i];
            int net_pay = grs_sal - ttal_duc[i];
            System.out.printf("%-9s %-9s %-7d %-9d %-9d %-15d %-6d\n",
                              id[i], name[i], rate[i], hr[i], grs_sal, ttal_duc[i], net_pay);
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("Total Gross Salary: %d\n", ttal_grs);
        System.out.printf("Total Deductions: %d\n", ttal_ded);
        System.out.printf("Total Net Pay: %d\n", ttal_net);
    }
}
