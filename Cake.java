package cakeproject;
//Student Name: Jeremy Webb
//LSU ID: #89-893-8558
//Lab Section: 02
//Assignment: CakeProject
//Submission Time: 1:10pm

public class Cake {
    
    //Initialize Variables
    public String flavor;
    public int tiers;
    public double price;
    
    //Create constructer  to initialize flavor tiers and price of cake
    public Cake(String flavor, int tiers, double price)
    {
        this.flavor = flavor;
        this.tiers = tiers;
        this.price = price;
    }
    
    //Method to print invoice
    public void printInvoice()
    {
        System.out.println("A " + tiers + " tier " + flavor + " cake. The price is $" + price + ". Issued on: " + java.time.LocalDate.now());
    }
    
    //Method to print out a message on a card thanking them
    public void printCard()
    {
        System.out.println("Thank you for choosing us!");
    }
}
