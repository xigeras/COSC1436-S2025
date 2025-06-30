import java.util.Scanner;

public class Methods
{
    private static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        intro();
        
        int a = 5;
        int b = 6;

        System.out.println(Math.pow(a,b));

        System.out.println(Math.random());

        System.out.println("What job do you have?");
        System.out.println(printJob(kb.nextLine()));
        System.out.println(findSum(a,b));

        kb.close();
    }

    public static String printJob(String job)
    {
        return "My job is: " + job;
    }

    public static void intro()
    {
        System.out.println("Welcome to today's lesson");
        System.out.println("What is your name?");
        String name = kb.nextLine();
    }

    public static int findSum(int firstNum, int secondNum)
    {
        return firstNum + secondNum;
    }
}