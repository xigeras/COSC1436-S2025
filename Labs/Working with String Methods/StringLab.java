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
        
    }
    public char charAt(int index) {
        return stringLab.charAt(index); // returns character at the specified index
    }
        

    
}