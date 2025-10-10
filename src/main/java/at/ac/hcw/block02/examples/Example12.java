package at.ac.hcw.block02.examples;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.valueOf(reader.nextLine());

        if (number % 400 == 0) {
            System.out.println("The number " + number + " is divisible by four hundred.");
        } else {
            System.out.println("The number " + number + " is not divisible by four hundred.");
        }
    }
}