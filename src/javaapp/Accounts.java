package javaapp;

public class Accounts {
//    
//        int id;
//        String fstName, lstName, email, username,password;
//        static Accounts[] ac = new Accounts[100];
//        static int currentCount = 0;
//    
//    public void addAccount(int id, String fstname, String lstName, String em, String user, String pass){
//        this.id= id;
//        this.fstName= fstname;
//        this.lstName= lstName;
//        this.email= em;
//        this.username= user;
//        this.password= pass;
//        ac[currentCount++] = this;
//    }
//    
//    public static boolean checkID(int id){
//        for(int i =0; i<currentCount; i++){
//            if(ac[i].id == id){
//                System.out.println ("ID already exists. Please enter different ID. ");
//                return false;
//            }
//        }
//        return true;
//    }
//    
//    public static boolean checkUser(String cname){
//        for(int i =0; i<currentCount; i++){
//            String user = null;
//            if(ac[i].username == null ? user == null : ac[i].username.equals(user)){
//                System.out.println("Username already exists. Please enter a different Username.");
//                return false;
//            } 
//        }
//        return true; 
//    }
//    public static boolean checkEmail (String cemail){
//        for(int i = 0; currentCount>=i; i++){
//            if(ac[i].email.equals(cemail)){
//                System.out.println("Username alredy exists. Please enter a different Email. ");
//                return false;
//            }
//        }
//        return true; 
//    }
//
//}    

            int id;
            String fname,lname,username,email,password;
            static Accounts[] acct = new Accounts[100];
            static int currentCount = 0;
    
        public  Accounts(int sid, String sfname, String slname, String semail, String susername, String spassword){
            this.id = sid;
            this.fname = sfname;
            this.lname = slname;
            this.username = susername;
            this.email = semail;
            this.password = spassword;    
            acct[currentCount++] = this;
        }
        public static boolean checkID(int cid){
                for(int i =0; i<currentCount; i++){
                    if(acct[i].id == cid){
                        System.out.println("ID already exists. Please enter a different ID.");
                        return false;
                    }    
            }
            return true;   
        }
    
        public static boolean checkUser(String cname){
            for(int i=0; i<currentCount; i++){
                if(acct[i].username.equals(cname)){
                        System.out.println("Username already exists. Please enter a different Username.");
                        return false;
                    }
            }
            return true;
        }
    
        public static boolean checkEmail(String cemail){
            for(int i=0; i<currentCount; i++){
                 if(acct[i].email.equals(cemail)){
                        System.out.println("Email already exists. Please enter a different Email.");
                        return false;
                    }
            }
            return true;
        }
    
   
 
        public static boolean passwordValidator(String password) {
            if (password.length() < 8) {
                System.out.println("\nPassword is too short");
                return false;
        }
    
            String admin = "admin", pass = "password", num="1234";
                if (password.contains(admin) || password.contains(pass) || password.contains(num)) {
                    System.out.println("\nPassword is invalid, must not contain common passwords like 'admin', 'password', or '1234'.");
                    return false;
            }

            boolean hasUppercase = false, hasLowercase = false, hasDigit = false, hasSpecialChar = false;

                for (char c : password.toCharArray()) {
                    if (Character.isUpperCase(c)) hasUppercase = true;
                    else if (Character.isLowerCase(c)) hasLowercase = true;
                    else if (Character.isDigit(c)) hasDigit = true;
                    else if (!Character.isLetterOrDigit(c)) hasSpecialChar = true;
                }

                    if (!hasUppercase || !hasLowercase) {
                        System.out.println("\nPassword is invalid, must have both uppercase and lowercase letters.");
                        return false;
                    }
                    if (!hasDigit) {
                        System.out.println("\nPassword is invalid, must have at least one number.");
                        return false;
                    }
                    if (!hasSpecialChar) {
                        System.out.println("\nPassword is invalid, must have at least one special character.");
                        return false;
                    }

                return true;
        }
        
        
        public void viewAccounts(){
            System.out.printf("%-15d %-15s %-15s %-20s %-20s %-20s\n",
                               this.id, this.fname, this.lname, this.email,this.username, this.password);
        }
}
    
