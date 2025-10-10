package at.ac.hcw.block03.examples;

import java.util.Scanner;

public class Example09 {
    /* loops can be stopped using break
       when executing the break command,
         the program execution moves onto
         the next command following the
         loop block */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        while (true) { // endless loop
            System.out.print("Enter a number (enter 0 or negative value to exit): ");
            int number = scan.nextInt();

            if (number <= 0) {
                break;
            } else {
                sum = sum + number;
            }
        }

        System.out.println("The sum is " + sum + ".");
    }
}