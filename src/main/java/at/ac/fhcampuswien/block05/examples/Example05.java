package at.ac.fhcampuswien.block05.examples;

public class Example05 {
    public static void printNumbers(int min, int max) {
        while (min < max) {
            System.out.println(min);
            // changing the value of the variables inside the method
            // does not affect the value of the variable in the other methods
            min++;
        }
    }

    public static void main(String[] args) {
        int min = 5;
        int max = 10;

        printNumbers(min, max);
        System.out.println("value of min: " + min);

        min = 8;

        printNumbers(min, max);
        System.out.println("value of min: " + min);
    }
}