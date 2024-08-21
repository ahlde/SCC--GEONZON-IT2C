package javaapp;

public class Grades {
    
    int id;
    String name;
    double p, m, pf, f;
    
    public void addGrades (int sid, String name, double prlm, double mt, double pf, double fnl){
        
        this.id = sid;
        this.name = name;
        this.p = prlm;
        this. m= mt;
        this.pf = pf;
        this.f = fnl;
          
    }
    
    public void viewGrades (){
        
        double avg= (this.p + this. m + this.pf + this.f) / 4;
        String remarks = (avg < 3.0) ? "Passed" : "Failed";

        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s/n",
                this.id, this.name, this.p, this.f, avg, remarks );
    }
    
}
