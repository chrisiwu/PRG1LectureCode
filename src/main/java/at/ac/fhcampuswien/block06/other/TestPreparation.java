package at.ac.fhcampuswien.block06.other;

import java.util.Locale;
import java.util.Scanner;

public class TestPreparation {
    public static void Example1() {
        // Example 1:
        // Implement a program which calculates the sum of a closed interval, and prints it.
        // Expect the user to write the smaller number first and then the larger number.
        //
        // example:
        // first number: 3
        // last number: 5
        // The sum is 12.

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter lower bound: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper bound: ");
        int upper = scanner.nextInt();

        while (lower > upper) {
            System.out.println("Upper bound must be higher than lower bound!");
            System.out.print("Enter upper bound: ");
            upper = scanner.nextInt();
        }

        for (int i = lower; i <= upper; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum + ".");
    }

    public static void Example2() {
        // Example 2:
        // Implement a program which calculates the factorial of a number given by the user.
        //
        // Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n.
        // For example, the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24.
        // Additionally, it has been specified that the factorial of 0 is 1, so 0! = 1.

        Scanner scanner = new Scanner(System.in);
        int factorial = 1;

        System.out.print("Enter a number to caclulate the factorial: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial is " + factorial + ".");
    }

    public static void Example3() {
        // Example 3:
        // Create a function which answers the question "Are you playing banjo?".
        // Read the user input of the name. If the name starts with the letter "R" or lower case "r",
        // you are playing banjo!

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.charAt(0) == 'r' || name.charAt(0) == 'R') {
            System.out.println("You are plaing banjo!");
        }
    }

    public static void Example4() {
        // Example 4:
        // Implement a function that reads two values from console. First a number for rows and
        // secondly a character from ASCII table (starting point). Afterwards create a matrix that
        // has the given number of rows. The first row prints the given character, then each row
        // should shift the next character to the right from ASCII table.
        //
        // example:
        // rows: 3
        // c: a
        // aaa
        // bbb
        // ccc

        Scanner scanner = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = scanner.nextInt();
        System.out.print("Character: ");
        char character = scanner.next().charAt(0);

        if (character >= 'a' && character <= 'z') {
            for (int row = 0; row < rows; row++) {
                if (character > 'z') {
                    character = 'a';
                }
                for (int column = 0; column < rows; column++) {
                    System.out.print(character);
                }
                System.out.println();
                character++;
            }
        }
    }

    public static void Example5() {
        // Example 5:
        // Adapt example 4 to print stairs.
        //
        // example:
        // aaa
        // bb
        // c

        Scanner scanner = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = scanner.nextInt();
        System.out.print("Character: ");
        char character = scanner.next().charAt(0);

        if (character >= 'a' && character <= 'z') {
            for (int row = 0; row < rows; row++) {
                if (character > 'z') {
                    character = 'a';
                }
                for (int column = row; column < rows; column++) {
                    System.out.print(character);
                }
                System.out.println();
                character++;
            }
        }
    }

    public static void Example6() {
        // Example 6:
        // Write a Java program that calculates the average temperature of a given number of days
        // and determines whether the average temperature is below, above, or at room temperature.
        // First the program asks the user for a number of days.
        // Afterwards the user enters the temperature for each day (as double).
        //
        // If the average temperature is below 22 degrees, the program should print:
        // "The average temperature is below room temperature."
        // If the average temperature is exactly 22 degrees, the program should print:
        // "The average temperature is exactly at room temperature."
        // If the average temperature is above 22 degrees, the program should print:
        // "The average temperature is above room temperature."

        Scanner scanner = new Scanner(System.in);
        double degrees;
        double sum = 0;
        double average = 0;

        System.out.print("Enter number of days: ");
        int numberOfDays = scanner.nextInt();

        for (int i = 1; i <= numberOfDays; i++) {
            System.out.print("Enter temperature of day " + i + ": ");
            degrees = scanner.nextDouble();
            sum += degrees;
        }

        average = sum / numberOfDays;

        System.out.printf(Locale.ENGLISH, "The average temperature is %.2f.", average);
        System.out.println();

        if (average < 22) {
            System.out.println("The average temperature is below room temperature.");
        } else if (average > 22) {
            System.out.println("The average temperature is above room temperature.");
        } else {
            System.out.println("The average temperature is exactly at room temperature.");
        }
    }

    public static void Example7() {
        // Example 7:
        // Given a month as an integer from 1 to 12, return to which quarter of the year
        // it belongs as an integer number.
        //
        // example:
        // month 2 (February) is part of the first quarter
        // month 6 (June) is part of the second quarter
        // month 11 (November) is part of the fourth quarter

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month: ");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            System.out.println("Quarter: " + ((month - 1) / 3 + 1));
        } else {
            System.out.println("Not a month!");
        }

        if (month < 1 || month > 12) {
            System.out.println("Not a month!");
        } else if (month <= 3) {
            System.out.println("Quarter: " + 1);
        } else if (month <= 6) {
            System.out.println("Quarter: " + 2);
        } else if (month <= 9) {
            System.out.println("Quarter: " + 3);
        } else {
            System.out.println("Quarter: " + 4);
        }

        switch (month) {
            case 1, 2, 3:
                System.out.println("Quarter: " + 1);
                break;
            case 4, 5, 6:
                System.out.println("Quarter: " + 2);
                break;
            case 7, 8, 9:
                System.out.println("Quarter: " + 3);
                break;
            case 10, 11, 12:
                System.out.println("Quarter: " + 4);
                break;
            default:
                System.out.println("Not a month!");
        }
    }

    public static void Example8() {
        // Example 8:
        // Write a program to play rock, paper, scissors.
        // Read input from users in console.
        //
        // example:
        // "scissors", "paper" -> "Player 1 won!"
        // "scissors", "rock" -> "Player 2 won!"
        // "paper", "paper" -> "Draw!"

        Scanner scanner = new Scanner(System.in);

        System.out.print("Player 1: ");
        String player1 = scanner.nextLine();
        System.out.print("Player 2: ");
        String player2 = scanner.nextLine();

        if (player1.equals(player2)) {
            System.out.println("It's a draw!");
        } else if (player1.equals("scissors") && player2.equals("paper") ||
                player1.equals("rock") && player2.equals("scissors") ||
                player1.equals("paper") && player2.equals("rock")) { // player 1 wins
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }

    public static void Example9() {
        // Example 9:
        // Add a logic to select a winner after 3 rounds of rock, paper, scissors from example 8

        Scanner scanner = new Scanner(System.in);
        int pointsPlayer1 = 0;
        int pointsPlayer2 = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Player 1: ");
            String player1 = scanner.nextLine();
            System.out.print("Player 2: ");
            String player2 = scanner.nextLine();

            if (player1.equals(player2)) {
                System.out.println("It's a draw!");
            } else if (player1.equals("scissors") && player2.equals("paper") ||
                    player1.equals("rock") && player2.equals("scissors") ||
                    player1.equals("paper") && player2.equals("rock")) { // player 1 wins
                pointsPlayer1++;
            } else {
                pointsPlayer2++;
            }
        }

        if (pointsPlayer1 > pointsPlayer2) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }

    public static void Example10() {
        // Example 10:
        // Numbers ending with zeros are boring.
        // Get rid of them. Only the ending ones.
        //
        // example:
        // 1450 -> 145
        // 960000 -> 96
        // 1050 -> 105
        // -1050 -> -105

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        while (number % 10 == 0) {
            number /= 10;
        }

        System.out.println("The result is: " + number);
    }

    public static void main(String[] args) {
        Example1();
        Example2();
        Example3();
        Example4();
        Example5();
        Example6();
        Example7();
        Example8();
        Example9();
        Example10();
    }
}