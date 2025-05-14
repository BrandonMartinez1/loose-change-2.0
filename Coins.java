public class Coins {

    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    public Coins(int numQuarters, int numDimes, int numNickels, int numPennies){
        quarters = numQuarters;
        dimes = numDimes;
        nickels = numNickels;
        pennies = numPennies;
    }
    
    // adding coins
    public void addQuarter(int numQuarter){
        System.out.println("Adding quarter(s) ...");
        quarters += numQuarter;
    }

    public void addDime(int numDime){
        System.out.println("Adding dime(s) ...");
        dimes += numDime;
    }

    public void addNickel(int numNickel){
        System.out.println("Adding nickel(s) ...");
        nickels += numNickel;
    }

    public void addPenny(int numPenny){
        System.out.println("Adding penny(s) ...");
        pennies += numPenny;
    }

    public void quartersCount(){
        System.out.println(quarters);
    }

    public void quartersTotal(){
        System.out.println(quarters * 0.25);
    }

    public void dimesCount(){
        System.out.println(dimes);
    }

    public void dimesTotal(){
        System.out.println(dimes * 0.10);
    }

    public void nickelsCount(){
        System.out.println(nickels);
    }

    public void nickelsTotal(){
        System.out.println(nickels * 0.05);
    }

    public void penniesCount(){
        System.out.println(pennies);
    }

    public void penniesTotal(){
        System.out.println(pennies * 0.01);
    }
    
    // call these methods to check your totals
    public void bankValue(){
        System.out.println(quarters * 0.25 + dimes * 0.10
                + nickels * 0.05 + pennies * 0.01+".");
    }

    public void bankCount(){
        System.out.println(quarters + dimes + nickels + pennies);
    }
}