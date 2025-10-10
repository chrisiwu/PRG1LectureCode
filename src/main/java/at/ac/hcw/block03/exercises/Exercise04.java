package at.ac.hcw.block03.exercises;

import java.util.Scanner;

public class Exercise04 {
    /* Password Retry:
         let the user try to enter a password,
           allow up to 3 attempts, if the password is correct,
           print "access granted", otherwise "access denied" */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "geheim123";
        boolean accessGranted = false;

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Enter password (attempt " + attempt + " of 3): ");
            String input = scanner.nextLine();

            if (input.equals(correctPassword)) {
                accessGranted = true;
                break;
            } else {
                System.out.println("Wrong password.");
            }
        }

        if (accessGranted) {
            System.out.println("access granted");
        } else {
            System.out.println("access denied");
        }
    }
}