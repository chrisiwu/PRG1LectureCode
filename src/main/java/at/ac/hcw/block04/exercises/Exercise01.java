package at.ac.hcw.block04.exercises;

import java.util.Scanner;

public class Exercise01 {
    /* Write a method public static void printUntilNumber(int number)
       It should print the numbers from 1
         to the number passed as a parameter.
       Call the method from your main
         with different parameters. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number: ");
        int number = scanner.nextInt();

        printUntilNumber(number);
    }

    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}