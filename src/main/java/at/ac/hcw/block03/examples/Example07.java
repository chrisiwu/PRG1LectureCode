package at.ac.hcw.block03.examples;

public class Example07 {
    public static void main(String[] args) {
        /* do-while loop:
             - repeats the statement 1 or many times (at least 1 time) */
        int i = 0;

        do {
            System.out.println("*");
            i++; // same as i = i + 1
        } while (i < 5);
    }
}