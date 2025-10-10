package at.ac.hcw.block03.exercises;

import java.util.Scanner;

public class Exercise03 {
    /* Factorial Calculator:
         ask the user for a number and calculate n! (n factorial):
           Input: 4 → Output: 4! = 24 (4 × 3 × 2 × 1) */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;

        System.out.print("Enter a number to caclulate the factorial: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial is " + factorial + ".");
    }
}