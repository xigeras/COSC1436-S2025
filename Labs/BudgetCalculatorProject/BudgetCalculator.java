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

        double monthlySalary = SALARY;
        double savedAmount = monthlySalary * SAVINGS_PERCENT;
        double rentAmount = monthlySalary * RENT_PERCENT;
        double groceriesAmount = monthlySalary * GROCERIES_PERCENT;
        double entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;
        double totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        double remainingBalance = monthlySalary - totalExpenses;

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
