package cakeproject;
//Student Name: Jeremy Webb
//LSU ID: #89-893-8558
//Lab Section: 02
//Assignment: CakeProject
//Submission Time: 1:10pm

public class BirthdayCake extends Cake{
    
    private String firstName;
    private int age;
    
    //Creat Constructor to initialize the first name and age
    public BirthdayCake(String flavor, int tiers, double price, String firstName, int age)
    {
        super(flavor, tiers, price);
        this.firstName = firstName;
        this.age = age;
    }
    
    //Overrides the printCard method in the parent class to specify the card to say Happy Birthday
    @Override
    public void printCard()
    {
        System.out.println("Happy Birthday to " + firstName + "! You just turned " + age + " :)");
        super.printCard();
    }
}
