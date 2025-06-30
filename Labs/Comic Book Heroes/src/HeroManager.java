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

    // Sorting (BubbleSort and InsertionSort)!! in ascending order

    public void bubbleSortByPowerLevel() {
        for (int i = 0; i < heroes.size() - 1; i++) {
            for (int j = 0; j < heroes.size() - i - 1; j++) {
                if(heroes.get(j).getLevel() > students.get(j + 1).getLevel() {
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }
            }
        }
    }

    

    // 2D array Display

}