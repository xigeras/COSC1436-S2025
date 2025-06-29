public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Declaring a 2D array with 3 rows and 3 columns
        int[][] grid = new int[3][3];

        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 3;
        grid[1][0] = 4;
        grid[1][1] = 5;
        grid[1][2] = 6;
        grid[2][0] = 7;
        grid[2][1] = 8;
        grid[2][2] = 9;

        System.out.println("2D Array (grid):");
        for (int i = 0; i < grid.length; i++) { // Loop over rows
            for (int j = 0; j < grid[i].length; j++) { //Loop over columns
                System.out.print(grid[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        int[][] predefinedGrid = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("\nPredefined 2D Array:");
        for (int i = 0; i < predefinedGrid.length; i++) {
            for (int j = 0; j < predefinedGrid[i].length; j++) {
                System.out.print(predefinedGrid[i][j] + " ");
            }
            System.out.println();
        }
        int totalSum = 0;
        for (int i = 0; i < predefinedGrid.length; i++) {
            for (int j = 0; j < predefinedGrid[i].length; j++) {
                totalSum += predefinedGrid[i][j];
            }
        }
        System.out.println("Sum of all elements: " + totalSum);
    }
}