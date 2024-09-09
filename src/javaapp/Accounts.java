package javaapp;

public class Accounts {
    
        int id;
        String fstName, lstName, email, username,password;
        static Accounts[] ac = new Accounts[100];
        static int currentCount = 0;
    
    public void addAccount(int id, String fstname, String lstName, String em, String user, String pass){
        this.id= id;
        this.fstName= fstname;
        this.lstName= lstName;
        this.email= em;
        this.username= user;
        this.password= pass;
        ac[currentCount++] = this;
    }
    
    public static boolean checkID(int id){
        for(int i =0; i<currentCount; i++){
            if(ac[i].id == id){
                System.out.println ("ID already exists. Please enter different ID. ");
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkUser(String cname){
        for(int i =0; i<currentCount; i++){
            String user = null;
            if(ac[i].username == null ? user == null : ac[i].username.equals(user)){
                System.out.println("Username already exists. Please enter a different Username.");
                return false;
            } 
        }
        return true; 
    }
    public static boolean checkEmail (String cemail){
        for(int i = 0; currentCount>=i; i++){
            if(ac[i].email.equals(cemail)){
                System.out.println("Username alredy exists. Please enter a different Email. ");
                return false;
            }
        }
        return true; 
    }

}    
    
