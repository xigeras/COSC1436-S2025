import java.util.Scanner;

public class JavaCalculator
{
    public static void main(String[] args)
    {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);
        String userChoice;
        System.out.println("Welcome to the Java Calculator!");

        // Main calculator loop
        while (true) {
            // Prompt user for operation
            System.out.println("Enter an operation (+, -, *, /, or exit): ");
            userChoice = scan.nextLine();
            
            // Exit condition
            if (userChoice.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the Java Calculator! Goodbye!");
                break;
            }

            // Validate operation input
            if (!userChoice.equals("+") && !userChoice.equals("-") && !userChoice.equals("*") && !userChoice.equals("/")) {
                System.out.println("Invalid input. Please try again.");
                continue; // Go back to the start of the loop
            }

            // Define allowed range for numbers
            final double RANGE_MIN = -1000;
            final double RANGE_MAX = 1000;
            
            double num1, num2;

            // Input and validate the first number
            while (true) {
                System.out.print("Enter the first number: ");
                if (scan.hasNextDouble()) {
                    num1 = scan.nextDouble();
                    if (num1 < RANGE_MIN || num1 > RANGE_MAX) {
                        System.out.println("Number out of range. Please enter a number between " + RANGE_MIN + " and " + RANGE_MAX + ".");
                        continue;
                    }
                    break; // Valid input received
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scan.next(); // Discard invalid input
                }
            }

            // Input and validate the second number
            while (true) {
                System.out.print("Enter the second number: ");
                if (scan.hasNextDouble()) {
                    num2 = scan.nextDouble();
                    if (num2 < RANGE_MIN || num2 > RANGE_MAX) {
                        System.out.println("Number out of range. Please enter a number between " + RANGE_MIN + " and " + RANGE_MAX + ".");
                        continue;
                    }
                    break; // Valid input received
                } 
                else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scan.next(); // Discard invalid input
                }
            }
 
            scan.nextLine(); // Clear the newline character from the buffer
        
            // Perform the selected operation and display the result
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
                    // Check for division by zero
                    if (num2 != 0)
                    {
                        System.out.println("The result of " + num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                    else
                    {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
            } 

            // Ask user if they want to perform another operation
            System.out.println("Would you like to perform another operation (yes/no)? ");
            String yesNo;
            while (true) {
                yesNo = scan.nextLine().trim();
                if (yesNo.equalsIgnoreCase("no")) {
                    break;
                } else if (yesNo.equalsIgnoreCase("yes")) {
                    break;
                } else {
                    System.out.println("Please enter 'yes' or 'no': ");
                }
            }
            // Exit if user says no
            if (yesNo.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using the Java Calculator! Goodbye!");
                break;
            }
        }
        // Close the scanner to free resources
        scan.close();
    }
}
