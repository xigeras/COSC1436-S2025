public class StringLab
{
    public static void main(String[] args)
    {
        final String stringLab = "Welcome to the Java String Lab!";
        System.out.println("The length of '" + stringLab + "' is " + stringLab.length() + " characters."); // length of the string
        System.out.println("The character at index 7 is: " + stringLab.charAt(7)); // character at index 7)
    }
    public char charAt(int index) {
        return stringLab.charAt(index); // returns character at the specified index
    }
        

    
}