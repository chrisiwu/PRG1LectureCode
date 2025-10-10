package at.ac.hcw.block05.examples;

public class Example05 {
    public static void main(String[] args) {
        /* multidimensional arrays:
           is an array of arrays
           each element of the array is itself an array
           use cases:
             matrices (math computations where matrix operations are needed)
             grids (e.g. boardgames)
             image processing(grayscale image pixels) */
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String[][] myTable = new String[2][3];

        /* to access each value in a 2D array we need nested loops
           the outer loop iterates through the rows
           the inner loop iterates through elements in a row */
        for (int i = 0; i < matrix.length; i++) { // outer loop for rows
            for (int j = 0; j < matrix[i].length; j++) { // inner loop for columns
                System.out.print(matrix[i][j] + " "); // access individual elements
            }

            System.out.println(); // move to the next line after printing a row
        }
    }
}