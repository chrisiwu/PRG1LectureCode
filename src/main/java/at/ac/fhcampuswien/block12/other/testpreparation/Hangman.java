package at.ac.fhcampuswien.block12.other.testpreparation;

import java.util.Scanner;

public class Hangman {
    private char[] wordToGuess;
    private char[] currentGuess;
    private int maxAttempts;

    public Hangman(String wordToGuess, int maxAttempts) {
        this.wordToGuess = wordToGuess.toCharArray();
        this.currentGuess = new char[wordToGuess.length()];
        for (int i = 0; i < this.currentGuess.length; i++) {
            this.currentGuess[i] = '_';
        }
        this.maxAttempts = maxAttempts;
    }

    public boolean guessLetter(char letter) {
        boolean isCorrect = false;

        for (int i = 0; i < this.wordToGuess.length; i++) {
            if (this.wordToGuess[i] == letter) {
                this.currentGuess[i] = letter;
                isCorrect = true;
            }
        }

        return isCorrect;
    }

    private boolean isWordGuessed() {
        for (char c : this.currentGuess) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    private void prettyPrintCurrentGuess() {
        System.out.println(new String(this.currentGuess));
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < this.maxAttempts && !isWordGuessed()) {
            System.out.print("Enter a letter: ");
            char letter = scanner.next().charAt(0);

            if (!guessLetter(letter)) {
                attempts++;
            }

            prettyPrintCurrentGuess();
        }

        if (isWordGuessed()) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("Game over! The word was: " + new String(this.wordToGuess));
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Hangman game = new Hangman("programming", 6);

        game.playGame();
    }
}