package at.ac.hcw.block03.exercises;

import java.util.Scanner;

public class Exercise01 {
    /* Write a Java program that:
         1. Writes a welcome message.
         2. Asks the user to enter their name and
              exampoints (integer between 0 and 40).
         3. Checks if the points are even or odd.
         4. Calculates the percentage of points achieved (max. 40).
         5. Prints a message based on the grade:
              - greater or equals to 90: "excellent"
              - greater or equals to 75: "good job“
              - greater or equals to 60: "passed“
              - less than 60: "needs improvement" */
    public static void main(String[] args) {
        // 1. welcome message
        System.out.println("Welcome to the Exam Evaluation Program!");

        // 2. ask for name and exam points
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your exam points (0-40): ");
        int points = scanner.nextInt();

        // 3. check if points are even or odd
        if (points % 2 == 0) {
            System.out.println("Your points are even.");
        } else {
            System.out.println("Your points are odd.");
        }

        // 4. calculate percentage
        double percentage = (points / 40.0) * 100;
        System.out.println("Percentage achieved: " + percentage);

        // 5. print message based on grade
        if (percentage >= 90) {
            System.out.println("excellent");
        } else if (percentage >= 75) {
            System.out.println("good job");
        } else if (percentage >= 60) {
            System.out.println("passed");
        } else {
            System.out.println("needs improvement");
        }
    }
}