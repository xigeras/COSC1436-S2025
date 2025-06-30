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
                if(heroes.get(j).getLevel() > heroes.get(j + 1).getLevel()) {
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }
            }
        }
    }

    public void insertionSortByPowerLevel() {
        for(int i = 1; i < heroes.size(); i++) {
            Hero key = heroes.get(i);
            int j = i - 1;

            while(j >= 0 && heroes.get(j).getLevel() > key.getLevel()) {
                heroes.set(j + 1, heroes.get(j));
                j--;
            }
            heroes.set(j + 1, key);
        }
    }

    // 2D array Display

    public void displayHeroes2DArray() {
        String [][] heroArray = new String[heroes.size()][3];

        for (int i = 0; i < heroes.size(); i++) {
            heroArray[i][0] = heroes.get(i).getName();
            heroArray[i][1] = String.valueOf(heroes.get(i).getLevel());
            heroArray[i][2] = heroes.get(i).getAffiliation().toString();
        }
        System.out.println(Arrays.deepToString(heroArray));
    }

    public void displayHeroes() {
        for (int i = 0; i < heroes.size(); i++) {
            System.out.println(heroes.get(i));
        }
    }

}