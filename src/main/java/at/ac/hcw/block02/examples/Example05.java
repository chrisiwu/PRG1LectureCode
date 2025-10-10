package at.ac.hcw.block02.examples;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int inputValue;
        final int THRESHOLD = 10;

        // print a message if the value of x is positive
        x = 10;
        if (x > 0) System.out.println("the value of x is positive");

        // print either positive or negative depending on the value of x
        x = -1;
        if (x < 0) System.out.println("negative");
        else System.out.println("positive or zero");

        // print a warning if inputValue exceeds a threshold
        System.out.print("Enter value: ");
        inputValue = scanner.nextInt();
        if (inputValue > THRESHOLD) System.out.println("Warning - Overload!");
    }
}