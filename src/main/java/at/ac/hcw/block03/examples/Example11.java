package at.ac.hcw.block03.examples;

public class Example11 {
    /* loops can also be placed inside other loops
       use cases: pattern printing, permutations,
         traversal of hierarchical data structures, ...
       break and continue only affect innermost loop */
    public static void main(String[] args) {
        int height = 5;

        for (int i = 0; i <= height; i++) { // outer loop for line
            for (int j = 0; j < i; j++) { // inner loop for stars in a line
                System.out.print("*");
            }

            System.out.println(); // start the next line
        }
    }
}