package cakeproject;
//Student Name: Jeremy Webb
//LSU ID: #89-893-8558
//Lab Section: 02
//Assignment: CakeProject
//Submission Time: 1:10pm

public class CakeProject {

    public static void main(String[] args) {
    
        //Testing Cake Project
        WeddingCake wedCk = new WeddingCake("chocolate", 3, 355.0, "Sarah", "John");
        wedCk.printInvoice();
        wedCk.printCard();
        
        System.out.println();
        
        BirthdayCake bdCk = new BirthdayCake("vanilla", 1, 20.0, "Alan", 15);
        bdCk.printInvoice();
        bdCk.printCard();
    }
    
}
