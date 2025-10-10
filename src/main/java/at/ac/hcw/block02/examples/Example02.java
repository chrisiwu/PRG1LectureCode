package at.ac.hcw.block02.examples;

import static java.lang.Math.PI;

public class Example02 {
    public static void main(String[] args) {
        /* Output:
           syntax:
             - System.out.println(output);
             - use System.out.print(output); to print a value
                 and leave the cursor in the same line */
        int taxRate = 20;
        int radius = 2;

        // output is equal to the literal
        System.out.println("Hello World!"); // literal
        System.out.println(12.5); // literal

        // result of the calculated expression will be printed
        System.out.println(2 * PI * radius); // expression

        // value of the named memory will be printed
        System.out.println(taxRate); // variable

        System.out.println("Hello World!"); // with linebreak
        System.out.println("The tax rate is " + taxRate + '%' + "."); // concatenation

        System.out.print("The tax rate is "); // without linebreak
        System.out.print(taxRate);
        System.out.print("%.");
        System.out.println(); // prints empty line
    }
}