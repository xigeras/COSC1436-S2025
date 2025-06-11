public class StringLab
{
    static String stringLab = " Welcome to the Java String Lab! ";
    public static void main(String[] args)
    {
        
        System.out.println("The length of '" + stringLab + "' is " + stringLab.length() + " characters."); // length of the string
        System.out.println("The character at index 7 is: " + stringLab.charAt(7)); // character at index 7)
        System.out.println("Substring of index 16 to 20 is: '" + stringLab.substring(16, 20) + "'"); // extracted and printed the word "Java" from the stringLab variable
    }
    public char charAt(int index) {
        return stringLab.charAt(index); // returns character at the specified index
    }
        

    
}