public class ArrayAccess {
    public static void main(String[] args) {
        //Creating and initializing an array with predefined values.
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        System.out.println("Third element: " + numbers[2]);
        System.out.println("Fourth element: " + numbers[3]);
        System.out.println("Fifth element: " + numbers[4]);

        numbers[1] = 25; // Changing second element from 20 to 25
        System.out.println("Updated second element: " + numbers[1]);

        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of all elements: " + sum);
    }
}