package at.ac.hcw.block03.examples;

import java.util.Scanner;

public class Example10 {
    /* when execution reaches the end of the loop,
         execution jumps back to the beginning
       one can also return to the beginning
         from other places inside the loop
         by using continue */
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