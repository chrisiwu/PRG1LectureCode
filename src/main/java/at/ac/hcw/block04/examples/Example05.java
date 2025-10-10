package at.ac.hcw.block04.examples;

public class Example05 {
    public static void main(String[] args) {
        printDiff(3, 4); // the diff is -1
        printDiff(10, 2); // the diff is 8
        printDiff(2, 10); // the diff is -8

    }

    /* methods can have multiple parameters/arguments
       parameters are passed in the corresponding order */
    public static void printDiff(int x, int y) {
        System.out.println("The difference is " + (x - y) + ".");
    }
}