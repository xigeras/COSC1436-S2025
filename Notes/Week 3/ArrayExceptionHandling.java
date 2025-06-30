import java.util.Scanner;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nEnter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        int[] scores = new int[numberOfStudents];

        System.out.println("Enter scores for each student:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        int maxScore = scores[0];
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }

        System.out.println("Highest score: " + maxScore);

        
        
        /*
        int[] numbers = {10, 20, 30};

        System.out.println("\nSafely accessing array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        try {
            System.out.println("Accessing an invalid index:");
            System.out.println(numbers[3]); // this index is out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        

       int[] temperatures = {72, 75, 68, 70, 74, 71, 69};
       int sum = 0;

       for (int temp : temperatures) {
            sum += temp;
       }

       double average = (double) sum / temperatures.length;
       System.out.println("\nAverage temperature: " + average);
        */

    }
}