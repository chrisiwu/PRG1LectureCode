package at.ac.fhcampuswien.block04.exercises;

import java.util.Scanner;

public class Exercise04 {
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