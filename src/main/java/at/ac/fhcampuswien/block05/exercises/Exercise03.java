package at.ac.fhcampuswien.block05.exercises;

import java.util.Scanner;

public class Exercise03 {
    public static int getIntegerFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number: ");

        return scanner.nextInt();
    }

    public static void main(String[] args) {
        boolean isEven = Exercise02.isEven(getIntegerFromUser());

        if (isEven) {
            System.out.println("The entered number is even.");
        } else {
            System.out.println("The entered number is uneven.");
        }
    }
}