package at.ac.fhcampuswien.block05.examples;

public class Example06 {
    // method overloading
    public static void printType(int value) {
        System.out.println(value + " is an integer");
    }

    public static void printType(double value) {
        System.out.println(value + " is a double");
    }

    public static void printType(char value) {
        System.out.println(value + " is a character");
    }

    public static void main(String[] args) {
        printType(1);
        printType(2.0);
        printType('3');
    }
}