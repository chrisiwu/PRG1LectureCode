package at.ac.fhcampuswien.block05.exercises;

import java.util.Scanner;

public class Exercise01 {
    public static double hypotenuse(double a, double b) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter side a: ");
        int a = scanner.nextInt();

        System.out.print("enter side b: ");
        int b = scanner.nextInt();

        System.out.println("hypotenuse: " + hypotenuse(a, b));
    }
}