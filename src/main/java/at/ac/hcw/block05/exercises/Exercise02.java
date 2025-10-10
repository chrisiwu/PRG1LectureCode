package at.ac.hcw.block05.exercises;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        int[] enteredNumbers = getNumbersFromUser(5);

        System.out.print("Entered numbers:");

        for (int number : enteredNumbers) {
            System.out.print(" " + number);
        }
    }

    public static int[] getNumbersFromUser(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }
}