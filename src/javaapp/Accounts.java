package javaapp;

public class Accounts {
    int id;
    String fstName, lstName, email, username,password;
    
    public void addAccount(int id, String fstname, String em, String user, String pass){
        this.id= id;
        this.fstName= fstname;
        this.lstName= lstName;
        this.email= em;
        this.username= user;
        this.password= pass;
    }
    public void viewAccount(){
        System.out.printf("|%-10d | %-10s | %-10s | %-10s | %-10s | %-10s |%-10s|\n", this.id, this.fstName, this.lstName, this.email, this.username, this.password);
    }
}
