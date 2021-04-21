/*Import Statement*/
import java.util.Scanner;
public class FoodOutline {
/*Instatiate Variables*/
    private boolean done=false;
    private double hd=2.5;
    private double brat=3.5;
    private double hb=5.0;
    private double fries=2.0;
    private double soda=2.0;
    private double water=0.0;
    private double total=0.0;
    private int hdcounter=0;
    private int bratcounter=0;
    private int hbcounter=0;
    private int friescounter=0;
    private int sodacounter=0;
    private int watercounter=0;
    private String orderCount="";
    //Scanner Objects
    Scanner sc=new Scanner (System.in);
    Scanner sc1=new Scanner (System.in);
    Scanner sc2=new Scanner (System.in);
    /*Empty Constructor*/
    public FoodOutline(){
    }
    /*Main Method for Food Program
    Provides Choices that have to match the exact wording and spelling
    If not the choice will display again
    No negative counts may be used*/
    public double play(){
        //Introduction
        System.out.println("Welcome to the food truck!");
        System.out.println("What would you like to do?");
        System.out.println("Please keep in mind tax is included.");
        while (!done){
            System.out.println("Choose one: Calculate, Clear, or Exit");
            String answer=sc.nextLine();
            if (answer.equals("Calculate")){
                System.out.println("Hot Dog: $2.50, Brat: $3.50, Hamburger: $5.00, Fries: $2.00, Soda: $2.00, Water: Free");
                System.out.println("What would you like to order?");
                String order=sc1.nextLine();
                if (order.equals("Hot Dog")){
                    System.out.println("How many?");
                    int quantityhd=sc2.nextInt();
                    if(quantityhd<0){
                    System.out.println("Cannot order a negative amount.");
                    }
                    hdcounter+=quantityhd;
                    total+=hd*quantityhd;
                }
                if (order.equals("Brat")){
                    System.out.println("How many?");
                    int quantitybrat=sc2.nextInt();
                    if(quantitybrat<0){
                        System.out.println("Cannot order a negative amount.");
                        }
                    else{
                    bratcounter+=quantitybrat;
                    total+=brat*quantitybrat;
                    }
                }
                if (order.equals("Hamburger")){
                    System.out.println("How many?");
                    int quantityhb=sc2.nextInt();
                    if(quantityhb<0){
                        System.out.println("Cannot order a negative amount.");
                        }
                    else{
                    hbcounter+=quantityhb;
                    total+=hb*quantityhb;
                    }
                }
                if (order.equals("Fries")){
                    System.out.println("How many?");
                    int quantityfries=sc2.nextInt();
                    if(quantityfries<0){
                        System.out.println("Cannot order a negative amount.");
                        }
                    else{
                    friescounter+=quantityfries;
                    total+=fries*quantityfries;
                    }
                }
                if (order.equals("Soda")){
                    System.out.println("How many?");
                    int quantitysoda=sc2.nextInt();
                    if(quantitysoda<0){
                        System.out.println("Cannot order a negative amount.");
                        }
                    else{
                    sodacounter+=quantitysoda;
                    total+=soda*quantitysoda;
                    }
                }
                if (order.equals("Water")){
                    System.out.println("How many?");
                    int quantitywater=sc2.nextInt();
                    if(quantitywater<0){
                        System.out.println("Cannot order a negative amount.");
                        }
                    else{
                    watercounter+=quantitywater;
                    total+=water;
                    }
                }
            }
            /*Clear sets all variables (counter and total) to zero
            Clearing All the Orders*/
            if (answer.equals("Clear")){
                total=0;
                hdcounter=0;
                bratcounter=0;
                hbcounter=0;
                friescounter=0;
                sodacounter=0;
                watercounter=0;
            }
            if (answer.equals("Exit")){
                done=true;
            }
        }
        return total;
    }
    //Method for Calculating Tax
    public double calculateTax(double l){
        l/=1.053;
        return l;
    }
    //Accessor for Summary of Items Ordered
    public String getOrderCount(){
        orderCount="Hot Dog(s) Ordered: "+hdcounter+" Brat(s) Ordered: "+bratcounter+" Hamburger(s) Ordered: "+hbcounter+"\n"+" Fries Ordered: "+friescounter+" Soda(s) Ordered: "+sodacounter+" Water(s) Ordered: "+watercounter;
        return orderCount;
    }

}