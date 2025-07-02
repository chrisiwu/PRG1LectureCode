package at.ac.fhcampuswien.block05.examples;

public class Example04 {
    // methods can have multiple parameters

    /**
     * This method prints the difference of two numbers.
     *
     * @param x The first number for calculating the difference.
     * @param y The second number for calculating the difference.
     */
    public static void printSum(int x, int y) {
        System.out.println("The sum is " + (x + y) + ".");
    }

    public static void main(String[] args) {
        // when calling such a method,
        // the parameters are passed in the same order
        printSum(3, 4); // the sum is 7
        printSum(10, 2); // the sum is 12
    }
}