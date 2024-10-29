package at.ac.fhcampuswien.block03.examples;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        /* modulo operator is very handy when we want
             to check the divisibility of a number */
        int remainder = 7 % 2;
        System.out.println(remainder); // prints 1
        System.out.println(5 % 3); // prints 2
        System.out.println(8 % 4); // prints 0
        System.out.println(1 % 2); // prints 1

        /* can be a part of an expression
             in a conditional statement */
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.valueOf(reader.nextLine());

        if (number % 400 == 0) {
            System.out.println("The number " + number + " is divisible by four hundred.");
        } else {
            System.out.println("The number " + number + " is not divisible by four hundred.");
        }
    }
}