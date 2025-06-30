public class ArraysExample {
    public static void main(String[] args) {
        //Declaration of an array
        int[] numbers;

        //initialization of an array
        numbers = new int[5];

        //declared AND initialized
        int[] numbersSingleLine = new int[5];

        int[] predefinedNumbers = {10, 20, 30, 40, 50};

        printArray(predefinedNumbers);

        String[] fruits = {"Apple", "Banana", "Cherry"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit at index " + i + ": " + fruits[i]);
        }

        printArray(fruits);
    }

    public static void printArray(int [] numbers)
    {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }

     public static void printArray(String [] words)
    {
        for (int i = 0; i < words.length; i++) {
            System.out.println("Element at index " + i + ": " + words[i]);
        }
    }
}