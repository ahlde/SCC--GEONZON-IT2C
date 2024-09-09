
package javaapp;


public class Products {
    
        int id, sold, stock;
        String name, status;
        double price, profit, tep;
        
        
    public void addProduct(int Id, String n, double pr, int sd, int stck){
        
        this.id = Id;
        this.name = n;
        this.price = pr;
        this.sold = sd;
        this.stock = stck;
        
        this.profit = (price*sold);
        this.tep = (price * stock);
        this.status = (this.stock < 1) ? "Out of Stock" : "Available";
    }        
    
    public void viewProduct(){
        
        
        System.out.printf("%-8d  %-10s  %-10.2f  %-10d  %-10d  %-10.2f  %-12s  %-10.2f\n", this.id, this.name, this.price, this.sold, this.stock, profit, status, tep);
    }
    
}
