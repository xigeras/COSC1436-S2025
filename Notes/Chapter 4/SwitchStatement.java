import java.util.Scanner;

public class SwitchStatement
{
    /*
    switch (expression) {
    case value 1:
        // Code to execute if expression equals value1
        break;
    case value 2: 
        // Code to execute if expression equals value2
        break;
    // You can have any number of case statement default:
        // Code to execute if none of the cases match
        break;
    }
    */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
    

        System.out.println("Select an option: ");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Exit");
        System.out.println("-> : ");

        int userChoice = scan.nextInt();
        while(userChoice != 3)
        {
        switch (userChoice) {
            case 1:
                System.out.println("Starting the game...");
                break;
            case 2:
                System.out.println("Loading the game...");
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option.");
                break;
            }

            System.out.println("Select an option: ");
            System.out.println("1. Start Game");
            System.out.println("2. Load Game");
            System.out.println("3. Exit");
            System.out.println("-> : ");

            userChoice = scan.nextInt();
        }
    }
}
