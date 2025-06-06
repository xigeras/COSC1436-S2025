package Notes;
public class EscapeSequences
{
    public static void main(String[] args)
    {
        System.out.println("9:\tbad \bdude"); // back space
        System.out.println("10:\tbad \tdude"); // tab character
        System.out.println("11:\tbad \\dude"); // \ character
        System.out.println("12:\tbad \"dude"); // " character
        System.out.println("13:\tbad \rdude"); // carriage return - back to the beginning of the line
        System.out.println("14:\tbad \ndude"); // starts a new line
        System.out.println("15:\tbad \'dude"); // single quote
    }
}