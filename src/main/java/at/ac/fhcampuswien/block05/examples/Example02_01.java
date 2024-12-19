package at.ac.fhcampuswien.block05.examples;

import java.util.Scanner;

public class Example02_01 {
    // declare a method inside the class
    public static void showErrorMsg() {
        System.out.println("Error, try again!");
    }

    public static void main(String[] args) {
        showErrorMsg(); // calling the method inside the same class

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 10: ");
        int value = scanner.nextInt();

        if (value > 10 || value < 0) {
            showErrorMsg(); // calling the method inside the same class
        } else {
            System.out.println("The entered number is " + value + ".");
        }

        int i = 0;

        while (i++ < 3) {
            showErrorMsg(); // calling the method inside the same class
        }
    }
}