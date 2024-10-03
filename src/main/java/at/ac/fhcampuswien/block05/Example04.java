package at.ac.fhcampuswien.block05;

public class Example04 {
    // methods can have multiple parameters
    public static void printDiff(int x, int y) {
        System.out.println("The difference is " + (x - y));
    }

    public static void main(String[] args) {
        // when calling such a method,
        // the parameters are passed in the same order
        printDiff(3, 4);
        printDiff(10, 2);
        printDiff(2, 10);
    }
}