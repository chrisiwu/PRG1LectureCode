package at.ac.hcw.block05.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise01_01 {
    /* ask the user to provide an integer number via console
       create an array and fill it with all numbers
         from zero to the given number
       if the given number is negative or zero,
         ask the user again for input
       print the array at the end of the program */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Please enter a positive integer: ");
            number = scanner.nextInt();
        } while (number <= 0);

        int[] numbers = new int[number + 1];

        for (int i = 0; i <= number; i++) {
            numbers[i] = i;
        }

        System.out.println(Arrays.toString(numbers));
    }
}