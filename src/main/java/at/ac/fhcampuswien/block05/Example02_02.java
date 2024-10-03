package at.ac.fhcampuswien.block05;

import java.util.Scanner;

public class Example02_02 {
    // parameters are values given to a method
    // that can be used in its execution
    public static void showErrorMsg(String msg) {
        System.out.println("Failure: " + msg); // "placeholder" for values passed from outside

    }

    public static void main(String[] args) {
        showErrorMsg("an error occurred"); // values passed to the method

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 10: ");
        int value = scanner.nextInt();
        if (value > 10 || value < 0) {
            showErrorMsg("number is smaller than 0 or bigger than 10"); // values passed to the method
        } else {
            System.out.println("The entered number is " + value + ".");
        }

        int i = 0;
        while (i++ < 3) {
            showErrorMsg("three errors"); // values passed to the method
        }
    }
}