package at.ac.fhcampuswien.block05.examples;

public class Example07 {
    // arbitrary number of arguments
    public static void printArray(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        printArray(1, 2, 3, 4, 5); // called with a sequence of arguments
        System.out.println();
        printArray(); // called with no arguments
        System.out.println();
        printArray(new int[]{6, 7, 8, 9, 10}); // called with an array
    }
}