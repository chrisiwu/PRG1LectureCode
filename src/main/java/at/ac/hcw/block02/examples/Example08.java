package at.ac.hcw.block02.examples;

public class Example08 {
    public static void main(String[] args) {
        // avoid a "Division by Zero" error
        int x = 10;
        int y = 5;
        int z;

        if (y == 0) {
            System.out.println("Error: Can't divide by zero.");
        } else {
            z = x / y;
            System.out.println("The result is " + z + ".");
        }
    }
}