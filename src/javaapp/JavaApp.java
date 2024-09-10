package javaapp;

import java.util.Scanner;

public class JavaApp {
    
    public static void main (String[] args) {
        
//       netPay np= new netPay();
//       np.getPay();
        

        String ya;
        Scanner sc = new Scanner(System.in);
  
        do {
        System.out.println("   Menu   \n\n1. Grades \n2. Salary \n3. Product \n4. Account \n5. Net Pay");
        
        System.out.print("\nEnter choice: ");
        int choice = sc.nextInt();
        
        while (choice > 5){
            System.out.print("\nInvalid, try again: ");
            choice = sc.nextInt();
        }
        
        switch (choice){
            case 1:
                Grade grd = new Grade();
                grd.genGrades();
                break;
            case 2:
                Salary sal = new Salary();
                sal.Employees();
                break;
            case 3:
                Product prd = new Product();
                prd.prod();
                break;
            case 5:
                netPay np = new netPay();
                np.getPay();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        
            System.out.print("Do you want to use another transaction? (Y/N): ");
            ya = sc.next();
            
        } while(ya.equals ("Y") || ya.equals ("y");
            System.out.print("Thank you for using the system");
        
          
       
    }
}
        
 
