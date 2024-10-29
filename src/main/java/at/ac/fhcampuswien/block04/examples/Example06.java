package at.ac.fhcampuswien.block04.examples;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Insert positive integers: ");
            int number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Unfit number! Try again.");
                continue;
            }

            System.out.println("Your input was " + number + ".");
        }
    }
}