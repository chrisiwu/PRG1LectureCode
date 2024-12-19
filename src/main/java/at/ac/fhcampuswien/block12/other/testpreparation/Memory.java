package at.ac.fhcampuswien.block12.other.testpreparation;

import java.util.Scanner;

public class Memory {
    private char[][] gameBoard;
    private boolean[][] revealed;

    public Memory(char[][] gameBoard) {
        this.gameBoard = gameBoard;
        this.revealed = new boolean[gameBoard.length][gameBoard[0].length];
    }

    public boolean revealCard(int row, int col) {
        if (!this.revealed[row][col]) {
            this.revealed[row][col] = true;
            return true;
        }
        return false;
    }

    public boolean checkCoordinates(int row, int col) {
        if (row >= this.gameBoard.length || col >= this.gameBoard[0].length) {
            System.out.println("Invalid index. Try again");
            return false;
        } else if (!revealCard(row, col)) {
            System.out.println("Card already revealed. Try again.");
            return false;
        } else {
            return true;
        }
    }

    private void prettyPrintGameBoard() {
        for (int i = 0; i < this.gameBoard.length; i++) {
            for (int j = 0; j < this.gameBoard[i].length; j++) {
                if (this.revealed[i][j]) {
                    System.out.print(this.gameBoard[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        int row1, col1, row2, col2;
        int pairsFound = 0;

        while (pairsFound < (this.gameBoard.length * this.gameBoard[0].length) / 2) {
            do {
                System.out.println("Enter the coordinates of the first card (row and column).");

                System.out.print("row: ");
                row1 = scanner.nextInt();

                System.out.print("column: ");
                col1 = scanner.nextInt();
            } while (!checkCoordinates(row1, col1));
            prettyPrintGameBoard();

            do {
                System.out.println("Enter the coordinates of the second card (row and column).");

                System.out.print("row: ");
                row2 = scanner.nextInt();

                System.out.print("column: ");
                col2 = scanner.nextInt();
            } while (!checkCoordinates(row2, col2));
            prettyPrintGameBoard();

            if (this.gameBoard[row1][col1] == this.gameBoard[row2][col2]) {
                pairsFound++;
                System.out.println("Pair found!");
            } else {
                this.revealed[row1][col1] = false;
                this.revealed[row2][col2] = false;
                System.out.println("No match. Try again.");
            }
        }

        System.out.println("Congratulations, you found all pairs!");

        scanner.close();
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'D'},
                {'A', 'B', 'C', 'D'}
        };
        Memory game = new Memory(board);

        game.playGame();
    }
}