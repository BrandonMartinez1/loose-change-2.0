public class CoinTester
{
    public static void main(String[] args) {

       // Create your program here
       // step one: create a Coins object
    Coints piggybank = new Coin (3,2,1,4);
    
       // step two: call the correct methods to print out your initial totals
       system.out.println("Intial Value:");
        piggybank.bankValue();
        piggybank.bankCount();
       
       /* step three: call the methods to add each coin to the toal, 
          passing the number of coins to add as a parameter to the method. */
       piggybank.addQuaters(3);
       piggybank.addDime(2);
       piggybank.addNickel(1);
       piggybank.addPennies(4);

       
       /* step four: print out your final totals to check your work
          reminder, your final total should be 21 coins for 2.27 */
       
       
       
    }
}