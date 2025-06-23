public class SuperheroRoster {
 
    public static void main(String[] args) {
        // 1. Declare and initialize arrays for hero names, abilities, and power levels
 
        Superhero[] heroes = {
            new Superhero("Spider-Man", "Web-slinging", 85),
            new Superhero("Iron Man", "Flying and high-tech armor", 90),
            new Superhero("Hulk", "Super strength", 95),
            new Superhero("Black Widow", "Stealth and combat", 80),
            new Superhero("Thor", "God of Thunder", 95),
            new Superhero("Captain America", "Super soldier", 88),
        }
 
        // 2. Print each hero's details using a loop
        for (Superhero hero : heroes) {
            hero.displayHero();
            System.out.println("--------------------------------");
        }
 
        // 3. Call the searchHero method to find a specific hero by name
        searchHero(heroes, "Iron Man");

        // 4. Calculate and display the average power level by calling calculateAveragePower method
        double avg = calculateAveragePower(heroes);
        System.out.println("Average Power Level: " + avg);
    }
 
    // Method: searchHero
    public static void searchHero(Superhero[] heroes, String target) {
        // Implement a loop to search for the hero by name
        // If found, print the hero's details
        // If not found, display a message
        boolean found = false;
        for (Superhero hero : heroes) {
            if (hero.getName().equalsIgnoreCase(target)) {
                System.out.println("Hero Found:");
                hero.displayHero
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
        return (double) sum / powerLevels.length; // Placeholder return value
    }
}