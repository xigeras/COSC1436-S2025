package Notes;
//these are my imports

import java.util.Scanner;
/**
 * this is the class that im using to explain scanners
 */
public class ScannerExample
{
    
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        final double TAX_RATE = 1.0825;
        System.out.println("What is your item cost: ");
        double itemPrice = kb.nextDouble();

        System.out.println("Your total price will be $" + itemPrice * TAX_RATE);
        kb.close();
    }
}