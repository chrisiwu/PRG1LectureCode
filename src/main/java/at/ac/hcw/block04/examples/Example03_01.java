package at.ac.hcw.block04.examples;

import java.util.Scanner;

public class Example03_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        showErrorMsg(); // calling the method inside the same class

        System.out.print("Enter a number between 0 and 10: ");
        int value = scanner.nextInt();

        if (value > 10) {
            showErrorMsg(); // calling the method inside the same class
        } else {
        }

        int i = 0;

        while (i < 3) {
            showErrorMsg(); // calling the method inside the same class
            i++;
        }
    }

    // method inside class
    public static void showErrorMsg() {
        System.out.println("Error, try again!");
    }
}