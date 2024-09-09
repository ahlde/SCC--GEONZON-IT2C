package javaapp;

import java.util.Scanner;


public class Salaries {


            String name;
            int id, rate, hr, ttal_duc;
            double gross, ttal_net, ttal_sal = 0;


        public void addEmployee(int eID, String eName, int rt, int hour, int deduc) {

            this.id = eID;
            this.name = eName;
            this.rate = rt;
            this.hr = hour;
            this.ttal_duc = deduc;

            this.gross = rate*hr;
            this.ttal_net = ((rate* hr) - ttal_duc);
        }
    //       
    //        System.out.println("EMP ID    Name      Rate   Hours     Gross     Deductions       Netpay");
    //        for (int i = 0; i < em; i++) {
    //            int grs_sal = hr[i] * rate[i];
    //            int net_pay = grs_sal - ttal_duc[i];
    //            System.out.printf("%-9s %-9s %-7d %-9d %-9d %-15d %-6d\n",
    //                              id[i], name[i], rate[i], hr[i], grs_sal, ttal_duc[i], net_pay);
    //        }
    //        System.out.println("-----------------------------------------------------------------------------------------------");
    //        System.out.printf("Total Gross Salary: %d\n", ttal_grs);
    //        System.out.printf("Total Deductions: %d\n", ttal_ded);
    //        System.out.printf("Total Net Pay: %d\n", ttal_net);
    //    }

   
    public void viewEmployee(){

            System.out.printf("%-8d  %-10s  %-10d  %-10d  %-10.2f  %-12d  %-10.2f\n", this.id, this.name, this.rate, this.hr, gross, this.ttal_duc, ttal_net);
        }
}