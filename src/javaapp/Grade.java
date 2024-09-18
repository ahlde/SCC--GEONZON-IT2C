package javaapp;

import java.util.Scanner;

public class Grade {
                  
    public static void editGrades(Grades[] grs, int size, int id) {
        Scanner sc = new Scanner (System.in);
        for(int i= 0; i < size; i++){ 
            if(grs[i].id == id){
                System.out.println("New Prelim Grade: ");
                double prl = sc.nextFloat();
                grs[i].p = prl;
                 System.out.println("New Midterm Grade: ");
                double mt = sc.nextFloat();
                grs[i].m = mt;
                 System.out.println("New Prefinal Grade: ");
                double prf = sc.nextFloat();
                grs[i].pf = prf;
                 System.out.println("New Finals Grade: ");
                double fn = sc.nextFloat();
                grs[i].f = fn;
                
            }
        }
    }
    
    public void genGrades(){
        Scanner sc= new Scanner(System.in);
        Grades[] gr = new Grades[100];
        
        String name;
        int num = 0, id, i;
        double p, m, pf, f;
         
        String op=null;
        
        do{
            
        System.out.println("\n");
        System.out.println("Welcome to the Grading App!");
        System.out.println("----------------------------------");
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        System.out.println("----------------------------------");
        
        
        System.out.print("Enter Option: ");
        int option = sc.nextInt();
        
        while (option > 5){
            System.out.println("Invalid option, try again: ");
            option = sc.nextInt();
        }   
        
    switch (option){
        case 1:
            System.out.println("\nEnter no. of Students: ");
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
            System.out.println("Student details added successfully!");
        break;
    
        case 2:
            System.out.println("VIEW:  ");
            for(int j = 0; j < num; j++){
            gr[j].viewGrades();
            }
        break;
        
        
        case 3:
            System.out.println("Enter the ID to update: ");
            int ids = sc.nextInt();
            System.out.println(""+ids);
            editGrades(gr, num, ids);
        break;
      
       
    
    
    
    }
    
     System.out.print("Do you want to continue?(Y/N): ");
        op=sc.next();
    }while(op.equals("Y")|| op.equals("y"));

    }

}
        
        
            
          
        
            
            
        

