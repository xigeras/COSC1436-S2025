import java.util.Scanner;

public class StringLab
{
    static String stringLab = " Welcome to the Java String Lab! ";
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!" + stringLab + ("!!!!!!!!!!!!!!!!!!!!!"));
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("The length of '" + stringLab + "' is " + stringLab.length() + " characters."); // length of the string
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("The character at index 7 is: " + stringLab.charAt(7)); // character at index 7)
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Substring of index 16 to 20 is: '" + stringLab.substring(16, 20) + "'"); // extracted and printed the word "Java" from the stringLab variable
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("The uppercase version of stringLab is: '" + stringLab.toUpperCase() + "'"); // converted the string to uppercase
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("The lowercase version of stringLab is: '" + stringLab.toLowerCase() + "'"); // converted the string to lowercase
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("The index of the first occurence of 'Java' is: " + stringLab.indexOf("Java")); // index of the first occurrence of "Java"
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Does the string contain 'Lab'? " + stringLab.contains("Lab"));
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Let's replace 'Java' with 'Java Programming'! Here it is! \n" + stringLab.replace("Java", "Java Programming")); // replaced "Java" with "Java Programming"
        System.out.println("---------------------------------------------------------------------------");
        String[] spaces = stringLab.split(" "); // split stringLab by spaces
        for (String space : spaces) {
            System.out.println(space);
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Here is the result of trimming any leading or trailing spaces: '" + stringLab.trim() + "'"); // trimmed the string to remove leading and trailing spaces
        System.out.println("---------------------------------------------------------------------------");
        String str1 = "java string lab!";
        System.out.println("Here are the results of comparing '" + str1 + "' with '" + stringLab + "':");
        System.out.println("Using equals(): " + str1.equals(stringLab)); // compares the 2 strings for equality
        System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase(stringLab)); // compares the 2 strings for equality and ignores case diffs
        System.out.println("---------------------------------------------------------------------------");
        // Task 2
        // For Loop: Count Vowels from stringLab
        int vowelCount = 0;
        for (int i = 0; i < stringLab.length(); i++) {
            char c = stringLab.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1) { // checks if the character is a vowel
                System.out.println(vowelCount++ + "... There's a vowel here: " + c);
                System.out.println("There are " + vowelCount + " vowel(s) in the stringLab variable!");
            }
        }

        // While Loop: Check for Palindrome
        System.out.println("---------------------------------------------------------------------------");
        String palindrome = "racecar";
        int start = 0;
        int end = palindrome.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (palindrome.charAt(start) != palindrome.charAt(end)) {
                isPalindrome = false; // if chars at start and end are not equal, not a palindrome.
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("'" + palindrome + "' is a palindrome.");
        } else {
            System.out.println("'" + palindrome + "' is not a palindrome.");
        }
        System.out.println("---------------------------------------------------------------------------");
        // Do-While Loop: Input Validation
        String input;
        do {
            System.out.print("Please enter a sentence: "); // prompts user for input (we want to keep asking until a sentence containing "Java" is entered)
            input = scanner.nextLine();
            if (!input.contains("Java")) {
                System.out.println("You entered: " + input);
            }
        }while (!input.contains("Java")); // keeps asking for input until "Java" is entered
        System.out.println("Thank you!");
        System.out.println("---------------------------------------------------------------------------");

        // Task 3: Working with StringBuilder!

        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java"); // appends a string to StringBuilder
        System.out.println(sb); // Outputs: "StringBuilder Lab - Learning Java"
        sb.insert(18, "is fun "); // inserts a string after "Lab"
        System.out.println(sb); // Outputs: "StringBuilder Lab is fun - Learning Java"
        sb.delete(26, 35);
        System.out.println(sb); // Outputs: "StringBuilder Lab is fun - Java"
        sb.reverse(); // reverses the entire content of StringBuilder
        System.out.println(sb); // Outputs: "avaJ - nuf si baL redliuBgnirtS"

        System.out.println("---------------------------------------------------------------------------");

        // Task 4: Working with StringBuffer!
        StringBuffer sbf = new StringBuffer("Multithreading Lab");
        sbf.append(" - Learning Java"); 
        System.out.println(sbf); // Outputs: "Multithreading Lab - Learning Java"
        sbf.insert(18, " is fun"); // inserts a string after "Lab"
        System.out.println(sbf); // Outputs: "Multithreading Lab is fun - Learning Java"
        sbf.delete(28, 37);
        System.out.println(sbf); // Outputs: "Multithreading Lab is fun - Java"
        sbf.reverse(); // reverses the entire content of StringBuffer
        System.out.println(sbf); // Outputs: "avaJ - nuf si baL gnidaerhtilutM"

        System.out.println("---------------------------------------------------------------------------");
    }
    public char charAt(int index) {
        return stringLab.charAt(index); // returns character at the specified index
    }
        
    

    
}