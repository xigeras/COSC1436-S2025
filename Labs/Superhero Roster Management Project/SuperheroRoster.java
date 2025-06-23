public class SuperheroRoster {
 
    public static void main(String[] args) {
        // 1. Declare and initialize arrays for hero names, abilities, and power levels
 
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow", "Hulk", "Thor", "Captain America"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat", "Superhuman strength", "God-like powers", "Super-soldier serum"};
        int[] powerLevels = {85, 90, 80, 95, 95, 88};
 
        // 2. Print each hero's details using a loop
        for (int i = 0; i < heroNames.length; i++) 
        {
            System.out.println("Hero Name: " + heroNames[i]);
            System.out.println("Ability: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
            System.out.println("-----------------------------");
         }
 
        // 3. Call the searchHero method to find a specific hero by name
        searchHero(heroNames, abilities, powerLevels, "Iron Man");

        // 4. Calculate and display the average power level by calling calculateAveragePower method
 
    }
 
    // Method: searchHero
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        // Implement a loop to search for the hero by name
        // If found, print the hero's details
        // If not found, display a message
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("Hero Found:");
                System.out.println("Name: " + names[i]);
                System.out.println("Ability: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
            if (!found) {
                System.out.println("Hero named '" + target + "' not found in the roster.");
            }
        }
    }
 
    // Method: calculateAveragePower
    public static double calculateAveragePower(int[] powerLevels) {
        // Implement the calculation for average power level
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        // Return the calculated average
        return 0; // Placeholder return value
    }
}