package at.ac.hcw.exampreparation.exam01.example04;

import java.util.Random;
import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        playRockPaperScissors();
    }

    public static void playRockPaperScissors() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userChoice;

        do {
            System.out.print("Rock, paper, or scissors? Enter your choice (0 = rock, 1 = paper, 2 = scissors)! ");
            userChoice = scanner.nextInt();
        } while (userChoice > 2 || userChoice < 0);

        int computerChoice = random.nextInt(3);

        System.out.println("Your choice: " + choiceToString(userChoice));
        System.out.println("Opponent chooses: " + choiceToString(computerChoice));
        int result = determineWinner(userChoice, computerChoice);

        if (result == 0) {
            System.out.println("Draw!");
        } else if (result == 1) {
            System.out.println("Won!");
        } else {
            System.out.println("Lost!");
        }
    }

    public static String choiceToString(int choice) {
        switch (choice) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "invalid";
        }
    }

    public static int determineWinner(int player, int computer) {
        if (player == computer) {
            return 0; // unentschieden
        } else if ((player == 0 && computer == 2) ||
                (player == 1 && computer == 0) ||
                (player == 2 && computer == 1)) {
            return 1; // Spieler gewinnt
        }

        return -1; // Computer gewinnt
    }
}