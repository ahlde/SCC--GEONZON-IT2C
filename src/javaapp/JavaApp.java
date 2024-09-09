package javaapp;

import java.util.Scanner;

public class JavaApp {
    
    public static void main (String[] args) {
        
//       netPay np= new netPay();
//       np.getPay();
        
        int choice;
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("   Menu   \n\n1. Grades \n2. Salary \n3. Product \n4. Account \n5. Net Pay");
        
        System.out.print("\nEnter choice: ");
        choice = sc.nextInt();
        
        switch (choice){
            case 1:
                Grade grd = new Grade();
                grd.genGrades();
                break;
            case 2:
                Salary sal = new Salary();
                sal.salaries();
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


          
       
    }
}
        
 
