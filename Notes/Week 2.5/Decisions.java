public class Decisions
{

        /*
        * == - checks to see if two values are equal (primitive)
        * != - checks to see if two values are not equal
        * > - checks to see if value on left is greater than value on right
        * < - checks to see if value on left is less than value on right
        * >= - checks to see if value on left is greater than or equal to value on right
        * <= - checks to see if value on left is less than or equal to value on right
        * str.equals() is the string method to determine equality
        * 
        * 
        * && - is the logical operator for AND, requiring both left and right to be true
        * || - is the logical operator for OR, requiring either left or right to be true
        */

    public static void main(String[] args)
    {
        String userName = "admin";
        String password = "password123";

        if(userName.equals("admin") && password.equals("password123"))
        {
            System.out.println("Login successful");
        }
        else
        {
            System.out.println("invalid credentials");
        }
    }

    public static void misc()
    {
        boolean isRaining = false;
        boolean isSnowing = true;
        boolean hasUmbrella = true;
        boolean isWeekend = true;
        boolean hasLicense = true;
        int age = 24;
        int temperature = 70;
        boolean isStudent = true;

        /*
        * == - checks to see if two values are equal (primitive)
        * != - checks to see if two values are not equal
        * > - checks to see if value on left is greater than value on right
        * < - checks to see if value on left is less than value on right
        * >= - checks to see if value on left is greater than or equal to value on right
        * <= - checks to see if value on left is less than or equal to value on right
        * str.equals() is the string method to determine equality
        * 
        * 
        * && - is the logical operator for AND, requiring both left and right to be true
        * || - is the logical operator for OR, requiring either left or right to be true
        */
        if ((age < 18 || age > 65) && isStudent)
        {
            System.out.println("You qualify for a discount.");
        }
        
        if(isRaining || isSnowing)
        {
            System.out.println("Take an umbrella or wear a coat.");
        }
        
        if(isWeekend && isRaining)
        {
            System.out.println("Stay home and relax.");
        }
        else if(isWeekend && !isRaining)
        {
            System.out.println("Go outside and enjoy the day!");
        }
        else
        {
            System.out.println("It is a weekday. Time to work.");
        }

        if(temperature > 95) 
        {
            System.out.println("It is really hot outside.");
        }
        else if(temperature > 80)
        {
            System.out.println("It is warm outside.");
        }
        else
        {
            System.out.println("It is cool outside.");
        }

        if(age >= 18 && hasLicense)
        {
            System.out.println("You can drive");
        }
    }
}