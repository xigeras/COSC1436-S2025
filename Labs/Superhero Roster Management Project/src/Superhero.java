public class Superhero {
    // Declare attributes: name, ability, and powerLevel
    private String name;
    private String ability;
    private int powerLevel;
    // Constructor to initialize name, ability, and powerLevel
    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability; 
        this.powerLevel = powerLevel;
    }
    // Method: displayHero
    public void displayHero() {
        // Print the hero's name, ability, and power level
        System.out.println("Name: " + name);
        System.out.println("Ability: " + ability);
        System.out.println("Power Level: " + powerLevel);
    }
    //getter methods
    public String getName() {
        return name;
    }
    public int getPowerLevel() {
        return powerLevel;
    }
}