package at.ac.fhcampuswien.block03.examples;

public class Example02 {
    public static void main(String[] args) {
        int taxRate = 20;

        /* syntax: System.out.println(output);
           "output" can be one of the following:
           - literal
           - named variables or constants
           - expression */
        System.out.println("Hello World!");
        System.out.println("The tax rate is " + taxRate + '%');
        System.out.println(); // prints an empty line!

        /* use print to print a value and
             leave the cursor in the same line */
        System.out.println("Hello World!");
        System.out.print("The tax rate is ");
        System.out.print(taxRate);
        System.out.println('%');
    }
}