package at.ac.hcw.exampreparation.exam01.example03;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        guessingGame(50, 5);
    }

    public static void guessingGame(int numberRange, int attempts) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = (int) (Math.random() * numberRange) + 1;
        int number;
        boolean won = false;

        System.out.println("Welcome to Number Guessing Master!");
        System.out.println("I have thought of a number between 1 and " + numberRange + ".");

        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.printf("Attempt %d of %d. Please enter your number: ", attempt, attempts);

            number = scanner.nextInt();

            if (number == secretNumber) {
                won = true;

                System.out.println("Congratulations! You guessed the number!");

                break;
            } else if (number > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }

        if (!won) {
            System.out.println("Lost! You used up all your " + attempts + " attempts.");
            System.out.println("The secret number was: " + secretNumber);
        }
    }
}