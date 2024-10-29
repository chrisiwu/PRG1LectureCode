package at.ac.fhcampuswien.block04.exercises;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value;

        do {
            System.out.print("Enter a positive value: ");
            value = scan.nextInt();
        } while (value <= 0);
    }
}