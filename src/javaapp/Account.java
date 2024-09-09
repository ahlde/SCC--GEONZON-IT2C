package javaapp;

import java.util.Scanner;

public class Account {
    
    public static void acct(){
        
        Accounts[] ac = new Accounts[100];
        Scanner sc = new Scanner(System.in);
        
        int n, i;
        
        System.out.println("Enter no. of Accounts: ");
        n = sc.nextInt();
        
        for (i = 0; i < n; i++){
            
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            
            System.out.print("Enter First Name: ");
            String fstName = sc.next();
            
            System.out.print("Enter Last Name: ");
            String lstName = sc.next();
            
            do{
                System.out.print("Enter Email: ");
                String email = sc.next();
            } while (!Accounts.checkEmail(email));
            
            do{
                System.out.print("Enter Username: ");
                String username = sc.next();
            }while(!Accounts.checkUser(lstName))
           
            
            System.out.print("Enter Password: ");
            String password = sc.next();
            
            
            
        }
    }
    
}
