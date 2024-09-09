
package javaapp;

import java.util.Scanner;

public class Product {
    
    public static void prod (){
        
        Products[] pr = new Products[100];
        Scanner sc = new Scanner(System.in);
        
        int num, i;
        double totalProfit = 0, totalTep = 0;
        
        System.out.print("Enter no. of Products: ");
        num = sc.nextInt();
        
        for (i = 0; i < num; i++){
            
            System.out.print("\n");
            System.out.print("Enter details for product " + (i+1) + " ");
            
            System.out.print("\nEnter ID: ");
            int id = sc.nextInt();
            
            System.out.print("Enter Name: ");
            String name = sc.next();
            
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            
            System.out.print("Enter Sold: ");
            int sold = sc.nextInt();
            
            System.out.print("Enter Stock: ");
            int stock = sc.nextInt();
            
            pr[i] = new Products();
            pr[i].addProduct(id, name, price, sold, stock);
            
            
            totalProfit += (price * sold);
            totalTep += (price * stock);
            
        }
        
        System.out.println("\n");
        System.out.printf("%-8s  %-10s  %-10s  %-10s  %-10s  %-10s  %-12s  %-10s\n", "ID", "NAME", "PRICE", "SOLD", "STOCK", "PROFIT", "STATUS", "TEP");
        
        for (i = 0; i < num; i++){
            pr[i].viewProduct();        
        }
        
        
        
    }
}
