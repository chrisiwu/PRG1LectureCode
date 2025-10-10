package at.ac.hcw.block04.exercises;

import java.util.Scanner;

public class Exercise02 {
    /* Write a method sumOfNumbers that accepts
         2 integer values as parameters.
       It should return the sum of all numbers between
         the provided values as integer – the first parameter
         being the starting number and the second being the end.
       Call the method from your main with different parameters. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter first number: ");
        int integer1 = scanner.nextInt();

        System.out.print("enter second number: ");
        int integer2 = scanner.nextInt();

        System.out.println("sum of all numbers: " + sumOfNumbers(integer1, integer2));
    }

    public static int sumOfNumbers(int number1, int number2) {
        int sum = 0;

        for (int i = number1; i <= number2; i++) {
            sum += i;
        }

        return sum;
    }
}