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
        
            switch (userChoice) {
                case "+":
                    System.out.println("Enter the first number: ");
                    num1 = scan.nextDouble();
                    System.out.println("Enter the second number: ");
                    num2 = scan.nextDouble();


                    System.out.println("The result of " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;

                case "-":
                    System.out.println("Enter the first number: ");
                    num1 = scan.nextDouble();
                    System.out.println("Enter the second number: ");
                    num2 = scan.nextDouble();

                    System.out.println("The result of " + num1 + " - " + num2+ " = " + (num1 - num2));
                    break;

                case "*":
                    System.out.println("Enter the first number: ");
                    num1 = scan.nextDouble();
                    System.out.println("Enter the second number: ");
                    num2 = scan.nextDouble();

                    System.out.println("The result of " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;

                case "/":
                    System.out.println("Enter the first number: ");
                    num1 = scan.nextDouble();
                    System.out.println("Enter the second number: ");
                    num2 = scan.nextDouble();

                    if (num1 != 0 || num2 != 0)
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

            
            
            scan.nextLine();

            System.out.println("Would you like to perform another operation (yes/no)? ");
            String yesNo = scan.nextLine();
            if (yesNo.equalsIgnoreCase("no")) {
                System.out.println("Goodbye!");
                break;
            }
            
        }

        scan.close();
    }
}