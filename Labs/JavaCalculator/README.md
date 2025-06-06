## Project Title: Simple Java Decision-Based Calculator

# Objective:
Students will create a Java program that simulates a basic calculator, allowing the user to choose operations (addition, subtraction, multiplication, division) or exit the program. The project will require students to use if, if-else, switch, logical operators, and operator precedence to control the program flow.



## Project Description:
# Create a calculator that:

Takes user input to choose between operations (+, -, *, /, exit).
Takes two numbers from the user as operands.
Executes the chosen operation using appropriate decision structures (if-else or switch).
Continuously prompts the user to choose an operation until they choose to exit.
Includes error handling to avoid division by zero or invalid input.

# Detailed Instructions:
Prompt the User for Operation:

Use a Scanner to ask the user to input a math operation (+, -, *, /, or exit).
Use an if-else structure to determine the chosen operation.
If the user selects exit, the program should terminate.
Get User Input for Numbers:
Prompt the user for two numbers (operands).
Store these numbers as double variables.
# Perform the Calculation:
Depending on the operation selected, the program should perform:
Addition if + is chosen.
Subtraction if - is chosen.
Multiplication if * is chosen.
Division if / is chosen (with a check to ensure the divisor is not zero).
Use a combination of if-else, &&, ||, and a switch statement where appropriate to make the decisions.
# Display the Result:
Once the operation is performed, output the result to the user.
Ask the user if they want to perform another operation or exit.
# Input Validation:
Ensure that the user doesn't input anything other than valid operations.
Add a check to ensure that division by zero does not occur.
# Optional Extensions:
Use the switch statement: For selecting the mathematical operation.
Range check: Allow the user to input values within a specific range, say -1000 to 1000, and throw an error if the input goes beyond this range.
Short-circuit evaluation: Use && and || operators to manage multiple conditions for error handling.