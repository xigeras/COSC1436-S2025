/*
 * This is the class I am using to calculate the budget as described in the project instructions in the README.md file.
 */
public class BudgetCalculator 
{
    public static void main(String[] args)
    {
        // Constants
        
        final double SALARY = 3000.0; //fixed monthly salary
        final double SAVINGS_PERCENT = 0.20; //percentage of salary saved (20%)
        final double RENT_PERCENT = 0.30; //percentage of salary spent on rent (30%)
        final double GROCERIES_PERCENT = 0.15; //percentage of salary spent on groceries (15%)
        final double ENTERTAINMENT_PERCENT = 0.10; //percentage of salary spent on entertainment (10%)

        // Declared Variables + Calculations

        double monthlySalary = SALARY; // to store monthly salary
        double savedAmount = monthlySalary * SAVINGS_PERCENT; // to store the savedAmount calculation
        double rentAmount = monthlySalary * RENT_PERCENT; // to store the rentAmount calculation
        double groceriesAmount = monthlySalary * GROCERIES_PERCENT; // to store the groceriesAmount calculation
        double entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT; // to store the amount of entertainment spent calculation
        double totalExpenses = rentAmount + groceriesAmount + entertainmentAmount; // to store the total expenses by adding the amount of money spent on rent, groceries, and entertainment.
        double remainingBalance = monthlySalary - totalExpenses; // to store the remaining balance after expenses

        // Displayed Results of Calculations

        System.out.println("The monthly salary is $" + monthlySalary + ".");
        System.out.println("The amount saved is $" + savedAmount + ".");
        System.out.println("The amount spent on rent is $" + rentAmount + ".");
        System.out.println("The amount spent on groceries is $" + groceriesAmount + ".");
        System.out.println("The amount spent on entertainment is $" + entertainmentAmount + ".");
        System.out.println("The total expenses is $" + totalExpenses + ".");
        System.out.println("The remaining balance in the account is $" + remainingBalance + ".");
    }
}
