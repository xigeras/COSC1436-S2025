package Notes;
public class VariablesExample
{
    /*
    * this is the main method of my program
    * @param - array of String args from the console
    */
    public static void main(String [] args)
    {
        
        String a = "Hello"; //Strings are immutable

        final double PI = 3.14;

        final int MAX_LEVEL = 10; //MAX_LEVEL takes away the magic number 10

        int b = 5; //answers the question how MANY

        double c = b; //how MUCH
        
        boolean myBool = false; 
        myBool = !myBool;

        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(myBool);
        System.out.println(PI);
    }
}