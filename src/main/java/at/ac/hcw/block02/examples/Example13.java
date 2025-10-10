package at.ac.hcw.block02.examples;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        /* comparing Strings
             - Strings cannot be compared using ==
             - comparison is affected by how much
                 information a variable can hold
             - Strings can hold a limitless number of characters
             – integers, floats etc. contain a single value only
             - does only work for single values
             - compare strings using the equals method */
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = reader.nextLine();

        if (input.equals("a string")) {
            System.out.println("Great! You read the instructions correctly.");
        }
    }
}