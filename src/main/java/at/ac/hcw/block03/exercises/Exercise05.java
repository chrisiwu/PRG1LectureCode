package at.ac.hcw.block03.exercises;

import java.util.Scanner;

public class Exercise05 {
    /* Reversed Stairs:
         ask the user for a number n,
           then print a reversed stair of * with n rows:
           Input: 4 → Output:
           ****
           ***
           **
           * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for the reversed stair height: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}