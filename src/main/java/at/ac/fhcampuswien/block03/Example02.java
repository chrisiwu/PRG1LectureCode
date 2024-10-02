package at.ac.fhcampuswien.block03;

import java.util.Scanner;

public class Example02 {
    public static void showErrorMsg(String msg) {
        System.out.println("Failure: " + msg);
    }

    public static void main(String[] args) {
        showErrorMsg("an error occurred");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 10: ");
        int value = scanner.nextInt();
        if (value > 10 || value < 0) {
            showErrorMsg("number is smaller than 0 or bigger than 10");
        } else {
            System.out.println("The entered number is " + value + ".");
        }

        int i = 0;
        while (i++ < 3) {
            showErrorMsg("three errors");
        }
    }
}