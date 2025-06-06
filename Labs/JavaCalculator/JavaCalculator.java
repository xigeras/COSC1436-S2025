import java.util.Scanner;

public class JavaCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the Java Calculator!");
        System.out.println("Enter an operation (+, -, *, /, or exit): ");
        String userChoice = scan.nextLine();

        while(userChoice != "exit")
        {
        switch (userChoice) {
            case "+":
                System.out.println("Enter the first number: ");
                double num1 = scan.nextDouble();
                System.out.println("Enter the second number: ");
                double num2 = scan.nextDouble();


                System.out.println("The result of " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println("Enter the first number: ");
                double num3 = scan.nextDouble();
                System.out.println("Enter the second number: ");
                double num4 = scan.nextDouble();

                System.out.println("The result of " + num3 + " - " + num4 + " = " + (num3 - num4));
                break;
            case "*":
                System.out.println("Enter the first number: ");
                double num5 = scan.nextDouble();
                System.out.println("Enter the second number: ");
                double num6 = scan.nextDouble();

                System.out.println("The result of " + num5 + " * " + num6 + " = " + (num5 * num6));
                break;
            case "/":
                System.out.println("Enter the first number: ");
                double num7 = scan.nextDouble();
                System.out.println("Enter the second number: ");
                double num8 = scan.nextDouble();

                if (num7 != 0 || num8 != 0)
                {
                    System.out.println("The result of " + num7 + " / " + num8 + " = " + (num7 / num8));
                }
                else
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }

            case "exit":
                System.out.println("Goodbye!");
                break;
            
            default:
                System.out.println("Invalid option.");
                break; 
            } 
        }
        scan.close();
    }
}