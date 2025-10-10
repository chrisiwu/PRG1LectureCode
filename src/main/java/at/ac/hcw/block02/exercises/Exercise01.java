package at.ac.hcw.block02.exercises;

import java.util.Scanner;

/**
 * computes the area & circumference of circle given radius
 *
 * @author Christoph Vogl
 * @version 1.00, 2025/09/10
 */
public class Exercise01 {
    public static void main(String[] args) {
        // constants
        final double PI = 3.1415;

        // variables
        int radius;
        double area;
        double circumference;
        Scanner scanner = new Scanner(System.in);

        // 1. print welcome message
        System.out.println("Welcome to area & circumference finder!");
        // 2. ask for & get radius from user
        System.out.print("Please enter the radius: ");
        radius = scanner.nextInt();

        // 3. compute area
        area = PI * radius * radius;
        // 4. compute circumference
        circumference = 2 * PI * radius;

        // 5. report radius, area & circumference
        System.out.print("The area of a circle of radius ");
        System.out.print(radius);
        System.out.print(" is ");
        System.out.println(area);
        System.out.print("and its circumference is ");
        System.out.print(circumference + ".");
        System.out.println();
    }
}