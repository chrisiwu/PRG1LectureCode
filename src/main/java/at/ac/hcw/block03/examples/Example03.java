package at.ac.hcw.block03.examples;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        // read 5 values and sum them up
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 5) {
            System.out.print("Enter value: ");
            int value = scan.nextInt();
            sum = sum + value;
            count = count + 1;
        }

        System.out.println("The sum is " + sum + ".");
    }
}