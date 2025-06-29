public class ArrayLoops {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Using a for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("\nUsing a for-each loop:");
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }

        int sum = 0;
        for (int num : numbers) { 
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum value: " + max);
        
    }
}