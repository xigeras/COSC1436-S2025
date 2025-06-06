import java.util.Scanner;

public class JavaCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String userChoice;
        System.out.println("Welcome to the Java Calculator!");


        while (true) {
            System.out.println("Enter an operation (+, -, *, /, or exit): ");
            userChoice = scan.nextLine();
            
            if (userChoice.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }
        
            double num1, num2;

            while (true) {
                System.out.print("Enter the first number: ");
                if (scan.hasNextDouble()) {
                    num1 = scan.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scan.next(); 
                }
            }

            while (true) {
                System.out.print("Enter the second number: ");
                if (scan.hasNextDouble()) {
                    num2 = scan.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scan.next(); 
                }
            }
 
            scan.nextLine();
        
            switch (userChoice) {
                case "+":
                    System.out.println("The result of " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;

                case "-":
                    System.out.println("The result of " + num1 + " - " + num2+ " = " + (num1 - num2));
                    break;

                case "*":
                    System.out.println("The result of " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;

                case "/":

                    if (num2 != 0)
                    {
                        System.out.println("The result of " + num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                    else
                    {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case "exit":
                    System.out.println("Goodbye!");
                    break;
                
                default:
                    System.out.println("Invalid option.");
                    break; 
            } 

            

            System.out.println("Would you like to perform another operation (yes/no)? ");
            String yesNo;
            while (true) {
                yesNo = scan.nextLine().trim();
                if (yesNo.equalsIgnoreCase("no")) {
                    System.out.println("Goodbye!");
                    break;
                } else if (yesNo.equalsIgnoreCase("yes")) {
                    break; // continue the main loop
                } else {
                    System.out.println("Please enter 'yes' or 'no': ");
                }
            }

            
        }

        scan.close();
    }
}