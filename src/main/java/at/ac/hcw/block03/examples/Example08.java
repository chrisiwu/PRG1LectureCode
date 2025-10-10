package at.ac.hcw.block03.examples;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        /* data validation:
             - e.g. reading a positive number from the user */
        Scanner scan = new Scanner(System.in);
        int value;

        do {
            System.out.print("Enter a positive value: ");
            value = scan.nextInt();
        } while (value <= 0);
    }
}