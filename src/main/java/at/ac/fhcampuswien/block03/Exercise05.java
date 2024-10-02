package at.ac.fhcampuswien.block03;

import java.util.Scanner;

public class Exercise05 {
    public static int sumOfNumbers(int number1, int number2) {
        int sum = 0;
        for (int i = number1; i <= number2; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter first number: ");
        int integer1 = scanner.nextInt();
        System.out.print("enter second number: ");
        int integer2 = scanner.nextInt();

        System.out.println("sum of all numbers: " + sumOfNumbers(integer1, integer2));
    }
}