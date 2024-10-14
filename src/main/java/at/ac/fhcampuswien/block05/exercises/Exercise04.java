package at.ac.fhcampuswien.block05.exercises;

import java.util.Scanner;

public class Exercise04 {
    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number: ");
        int number = scanner.nextInt();

        printUntilNumber(number);
    }
}