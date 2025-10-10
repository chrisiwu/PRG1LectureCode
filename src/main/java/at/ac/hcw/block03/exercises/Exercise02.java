package at.ac.hcw.block03.exercises;

import java.util.Scanner;

public class Exercise02 {
    /* Countdown:
         ask the user for a starting number
           and countdown to 0, printing each number:
           Input: 5 → Output: 5 4 3 2 1 0 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a start number for the countdown: ");
        int start = scanner.nextInt();

        for (int i = start; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}