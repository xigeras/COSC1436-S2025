public class StringLab
{
    static String stringLab = " Welcome to the Java String Lab! ";
    public static void main(String[] args)
    {
        
        System.out.println("The length of '" + stringLab + "' is " + stringLab.length() + " characters."); // length of the string
        System.out.println("The character at index 7 is: " + stringLab.charAt(7)); // character at index 7)
        System.out.println("Substring of index 16 to 20 is: '" + stringLab.substring(16, 20) + "'"); // extracted and printed the word "Java" from the stringLab variable
        System.out.println("The uppercase version of stringLab is: '" + stringLab.toUpperCase() + "'"); // converted the string to uppercase
        System.out.println("The lowercase version of stringLab is: '" + stringLab.toLowerCase() + "'"); // converted the string to lowercase
        System.out.println("The index of the first occurence of 'Java' is: " + stringLab.indexOf("Java")); // index of the first occurrence of "Java"
        System.out.println("Does the string contain 'Lab'? " + stringLab.contains("Lab"));
        System.out.println("Let's replace 'Java' with 'Java Programming'! Here it is! \n" + stringLab.replace("Java", "Java Programming")); // replaced "Java" with "Java Programming"
        
        String[] spaces = stringLab.split(" "); // split stringLab by spaces
        for (String space : spaces) {
            System.out.println(space);
        }

        System.out.println("Here is the result of trimming any leading or trailing spaces: '" + stringLab.trim() + "'"); // trimmed the string to remove leading and trailing spaces
    
        String str1 = "java string lab!";
        System.out.println("Here are the results of comparing '" + str1 + "' with '" + stringLab + "':");
        System.out.println("Using equals(): " + str1.equals(stringLab)); // compares the 2 strings for equality
        System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase(stringLab)); // compares the 2 strings for equality and ignores case diffs
    
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
    }
    public char charAt(int index) {
        return stringLab.charAt(index); // returns character at the specified index
    }
        
    

    
}