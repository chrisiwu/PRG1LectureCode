package at.ac.hcw.block03.exercises;

import java.util.Scanner;

public class Exercise06 {
    /* Count Digits:
         ask the user for a positive integer
           and count how many digits it has:
           Input: 12345 → Output: 5 digits */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digitCount = 0;

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        while (number > 0) {
            number /= 10;
            digitCount++;
        }

        System.out.println(digitCount + " digits");
    }
}