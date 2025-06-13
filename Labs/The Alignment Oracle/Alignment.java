import java.util.Scanner;
import java.util.regex.*;


public class Alignment {
    static final String[] LAWFUL = {"order", "rules", "duty", "honor", "loyalty", "justice", "authority", "discipline", "rally"};
    static final String[] CHAOTIC = {"freedom", "rebellion", "impulse", "anarchy", "wild", "creativity", "burn", "steal", "break", "disrupt"};
    static final String[] GOOD = {"help", "protect", "save", "kindness", "sacrifice", "defend", "heal", "rescue", "support", "calm"};
    static final String[] EVIL = {"harm", "destroy", "betray", "manipulate", "exploit", "kill", "deceive", "sacrifice", "threaten", "curse", "torture","dominate"};
    
    static int lawful = 0, chaotic = 0, good = 0, evil = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("❢◥ ▬▬▬▬▬▬ ◆ ▬▬▬▬▬▬ ◤❢");
        System.out.println("Welcome to the Alignment Analyzer, a tool to determine your Dungeons & Dragons alignment!");
        System.out.println("❢◥ ▬▬▬▬▬▬ ◆ ▬▬▬▬▬▬ ◤❢");
        System.out.println("Type your responses to the questions below. Your answers will help determine your alignment in the world of Dungeons & Dragons.");

        askQuestion(scanner, "You discover a hidden book of powerful, dangerous magic in a ruined temple. What do you do?");
        askQuestion(scanner, "A corrupt official offers you a bribe to look the other way on a shady deal. What do you do?");
        askQuestion(scanner, "You find a crying child who's lost in a busy marketplace. What do you do?");
        askQuestion(scanner, "You capture an enemy that refuses to talk. What do you do?");
        askQuestion(scanner, "A town is under attack. What do you do?");
        askQuestion(scanner, "You find a bag of gold coins on the street. What do you do?");

        String alignment = determineAlignment();
        System.out.println("❢◥ ▬▬▬▬▬▬ ◆ ▬▬▬▬▬▬ ◤❢");
        System.out.println("Your alignment is: " + alignment + "!");
        System.out.println("❢◥ ▬▬▬▬▬▬ ◆ ▬▬▬▬▬▬ ◤❢");
    }

    public static void askQuestion(Scanner scanner, String question) {
        System.out.println("\n" + question);
        System.out.print("Your response: ");
        String input = scanner.nextLine().toLowerCase();

        lawful += countMatches(input, LAWFUL);
        chaotic += countMatches(input, CHAOTIC);
        good += countMatches(input, GOOD);
        evil += countMatches(input, EVIL);
    }

    public static int countMatches(String input, String[] keywords) {
        int  count = 0;
        for (String word : keywords) {
            Pattern pattern = Pattern.compile("\\b" + word + "\\b");
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                count++;
            }
        }
        return count;
    }

    public static String determineAlignment() {
        String lawChaos = (lawful > chaotic) ? "Lawful" : (chaotic > lawful) ? "Chaotic" : "Neutral";
        String goodEvil = (good > evil) ? "Good" : (evil > good) ? "Evil" : "Neutral";

        if (lawChaos.equals("Neutral") && goodEvil.equals("Neutral")) {
            return "True Neutral";
        }
        return lawChaos + " " + goodEvil;
    }
}