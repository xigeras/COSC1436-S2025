public class PresidentApp {
    public static void main(String[] args) 
    {
        President[] presidents = {
            new President("George Washington","First President, led independence",98),
            new President("Abraham Lincoln","Led nation through Civil War, abolished slavery",95),
            new President("Franklin D. Roosevelt","Guided nation through Great Depression and WWII",92)
        }; 

        System.out.println("\nDisplaying Presidents using President class:");

        for(President pres : presidents)
        {
            System.out.println(pres);
        }


        searchPresident(presidents, "Billy Ray Cyrus");

        double averageInfluence = calculateAverageInfluence(presidents);
        System.out.println("Average Influence Level: " + averageInfluence);

        java.util.Arrays.sort(presidents, (a, b) -> b.getInfluenceLevel() - a.getInfluenceLevel());

        System.out.println("Presidents sorted by influence level:");
        for (President pres : presidents) {
            System.out.println(pres);
            System.out.println();
        }
        
    }

    public static void searchPresident(President[] pres, String target) {
        for (int i = 0; i < pres.length; i++) {
            if (pres[i].getName().equalsIgnoreCase(target)) {
                System.out.println("\nPresident Found!");
                System.out.println(pres[i]);
                return;
            }
        }
        System.out.println(target + " not found.");
    }

    public static double calculateAverageInfluence(President[] presidents) {
        int sum = 0;
        for (President pres : presidents) {
            sum += pres.getInfluenceLevel();
        }
        return (double) sum / presidents.length;
    }


}