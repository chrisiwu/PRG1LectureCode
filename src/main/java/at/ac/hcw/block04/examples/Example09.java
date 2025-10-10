package at.ac.hcw.block04.examples;

import java.util.Scanner;

public class Example09 {
    public static void main(String[] args) {
        /* calling methods in other methods
           can also be passed as arguments */
        boolean isNumberEven = isEven1(getNumberFromUser());

        if (isNumberEven) {
            System.out.println("The given number is even.");
        } else {
            System.out.println("The given number is odd.");
        }
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        return scanner.nextInt();
    }

    /* method that returns true if the
         given number is even and false if not */
    public static boolean isEven1(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // even shorter using expression itself
    public static boolean isEven2(int number) {
        return number % 2 == 0;
    }
}