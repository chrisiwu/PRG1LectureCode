package at.ac.fhcampuswien.block04.examples;

import java.util.Scanner;

public class Example07 {
    /* When execution reaches the end of the loop,
         executions jumps back to the beginning.
       You can also return to the beginning from other
         places inside the loop by using continue. */
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