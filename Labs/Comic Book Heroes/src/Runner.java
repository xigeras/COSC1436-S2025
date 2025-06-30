public class Runner {
    public static void main(String[] args) {
        HeroManager manager = new HeroManager();

        manager.addHero(new Hero("Spider-Man", 88, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 92, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 87, Affiliation.X_MEN));
        manager.addHero(new Hero("Wonder Woman", 96, Affiliation.JUSTICE_LEAGUE));

        System.out.println("Original List:");
        manager.displayHeroes();

        // bubblesort
        System.out.println("\nBubble Sort by Power Level:");
        manager.bubbleSortByPowerLevel();
        manager.displayHeroes();

        //insertion sort
        System.out.println("\nInsertion Sort by Power Level:");
        manager.insertionSortByPowerLevel();
        manager.displayHeroes();

        // removes a hero
        manager.removeHero("Batman");
        System.out.println("\nList After Removing Batman:");
        manager.displayHeroes();

        // adds a new hero
        manager.addHero(new Hero("Mr. Fantastic", 85, Affiliation.FANTASTIC_FOUR));
        System.out.println("\nList After Adding Mr. Fantastic:");
        manager.displayHeroes();

        // display in 2D!
        System.out.println("\nTwo-Dimensional Array Display:");
        manager.displayHeroes2DArray();
    }
}