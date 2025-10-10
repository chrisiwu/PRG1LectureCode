package at.ac.hcw.block05.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise01_02 {
    /* split your solution from before into methods:
       write a method that reads and validates the user
         input (number) and returns the number
       write a method that accepts the number as argument
         and initializes and fills the array (zero to number),
         the method returns the filled array */
    public static void main(String[] args) {
        int[] numbers = generateArray(readUserInput());

        System.out.println(Arrays.toString(numbers));
    }

    // method to read and validate user input
    public static int readUserInput() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Please enter a positive integer: ");
            number = scanner.nextInt();
        } while (number <= 0);

        return number;
    }

    // method to generate and fill the array
    public static int[] generateArray(int number) {
        int[] array = new int[number + 1];

        for (int i = 0; i <= number; i++) {
            array[i] = i;
        }

        return array;
    }
}