package at.ac.fhcampuswien.block06.examples;

public class Example06 {
    public static void main(String[] args) {
        // multidimensional arrays
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        String[][] myTable = new String[2][3];

        for (int i = 0; i < matrix.length; i++) { // outer loop for rows
            for (int j = 0; j < matrix[i].length; j++) { // inner loop for columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // move to the next line after printing a row
        }
    }
}