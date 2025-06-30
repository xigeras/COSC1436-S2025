import java.util.Arrays;
import java.util.ArrayList;

public class HeroManager {
    public ArrayList<Hero> heroes = new ArrayList<Hero>();

    // adds a hero
    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    // removes a hero
    public void removeHero(String name) {
        heroes.removeIf(hero -> hero.getName().equals(name));
    }

    // Sorting (BubbleSort and InsertionSort)!!


    // 2D array Display

}