package cakeproject;
//Student Name: Jeremy Webb
//LSU ID: #89-893-8558
//Lab Section: 02
//Assignment: CakeProject
//Submission Time: 1:10pm

public class WeddingCake extends Cake{
   
    //initialize variables
    private String bridesFirstName;
    private String groomsFirstName;
    
    //Creat Constructor to initialize the brides name and grooms name
    public WeddingCake(String flavor, int tiers, double price, String bridesFirstName, String groomsFirstName)
    {
        super( flavor,tiers, price);        
        this.bridesFirstName = bridesFirstName;
        this.groomsFirstName = groomsFirstName;      
    }
    
//Overrides the printCard method in the parent class to specify the card to say Happy Wedding   
    @Override
    public void printCard()
    {
        System.out.println("Happy Wedding to " + bridesFirstName + " and " + groomsFirstName);
        super.printCard();
    }
}
