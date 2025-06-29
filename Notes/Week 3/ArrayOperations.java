public class ArrayOperations { 
    public static void main(String[] args) {
        int[] numbers = {4, 15, 8, 23, 16};

        printArray(numbers);
        /*
        System.out.println("Array length: " + numbers.length);

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average value: " + average);

        int[] copyOfNumbers = new int[numbers.length];
        System.arraycopy(numbers, 0, copyOfNumbers, 0, numbers.length);

        System.out.print("Copied array: ");
        for (int num : copyOfNumbers) { 
            System.out.print(num + " ");
        }
        System.out.println();
*/
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}