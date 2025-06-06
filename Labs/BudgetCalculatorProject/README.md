# Objective
Create a Java console application to manage and display a personal budget using constants, variables, and basic arithmetic operations. The project will help you practice defining constants, declaring and using variables, and performing calculations.

# Instructions
1. Setup Your Project

Open codespaces.
Create a new Java project named BudgetCalculatorProject.
Inside the project, create a new Java class named BudgetCalculator.
2. Define Constants

Constants are values that do not change. In Java, constants are usually defined using the final keyword. These values will be used for calculations in your program.
In your BudgetCalculator class, define the following constants:
SALARY: The fixed monthly salary. For this example, use 3000.0.
SAVINGS_PERCENT: The percentage of salary saved. Use 0.20 for 20%.
RENT_PERCENT: The percentage of salary spent on rent. Use 0.30 for 30%.
GROCERIES_PERCENT: The percentage of salary spent on groceries. Use 0.15 for 15%.
ENTERTAINMENT_PERCENT: The percentage of salary spent on entertainment. Use 0.10 for 10%.
3. Declare Variables

Variables are named storage locations for data. Declare variables to hold the calculated values:
monthlySalary: To store the monthly salary (initially set to SALARY).
savedAmount: To store the amount saved.
rentAmount: To store the amount spent on rent.
groceriesAmount: To store the amount spent on groceries.
entertainmentAmount: To store the amount spent on entertainment.
totalExpenses: To store the total expenses (sum of rent, groceries, and entertainment).
remainingBalance: To store the remaining balance after expenses.
4. Perform Calculations

Calculate the savedAmount by multiplying monthlySalary by SAVINGS_PERCENT.
Calculate the rentAmount by multiplying monthlySalary by RENT_PERCENT.
Calculate the groceriesAmount by multiplying monthlySalary by GROCERIES_PERCENT.
Calculate the entertainmentAmount by multiplying monthlySalary by ENTERTAINMENT_PERCENT.
Calculate the totalExpenses by adding rentAmount, groceriesAmount, and entertainmentAmount.
Calculate the remainingBalance by subtracting totalExpenses from monthlySalary.
5. Display Results

Use System.out.println() to print the results. Display the following:
Monthly salary
Amount saved
Amount spent on rent
Amount spent on groceries
Amount spent on entertainment
Total expenses
Remaining balance
6. Test Your Program

Run your program to ensure it displays the correct output.
Test with different values for constants to see how the results change. For instance, try changing the SALARY to 4000.0 or SAVINGS_PERCENT to 0.10.

