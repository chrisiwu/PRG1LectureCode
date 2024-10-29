package at.ac.fhcampuswien.block04.exercises;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 5) {
            System.out.print("Enter a number: ");
            int value = scan.nextInt();
            sum = sum + value;
            count = count + 1;
        }

        System.out.println("The sum is " + sum + ".");
    }
}