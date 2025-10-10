package at.ac.hcw.block04.examples;

import java.util.Scanner;

public class Example04 {
    /* parameters are values given to a method
         that can be used in its execution
       "placeholder" for values passed from outside */
    public static void showErrorMsg(String msg) {
        System.out.println("Error Message: " + msg);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        showErrorMsg("An error occurred."); // values passed to the method

        System.out.print("Enter a number between 0 and 10: ");
        int value = scanner.nextInt();

        if (value > 10) {
            showErrorMsg("Number is bigger than 10."); // values passed to the method
        } else {
        }
    }
}