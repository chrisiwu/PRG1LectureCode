package at.ac.fhcampuswien.block05.exercises;

import java.util.Scanner;

public class Exercise02 {
    /**
     * This method checks if a number is even.
     *
     * @param number Number to be tested for even.
     * @return True if number is even.
     */
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println("The entered number is even.");
        } else {
            System.out.println("The entered number is uneven.");
        }
    }
}