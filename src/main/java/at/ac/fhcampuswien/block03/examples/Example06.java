package at.ac.fhcampuswien.block03.examples;

public class Example06 {
    public static void main(String[] args) {
        int x = 5;

        // choose between three alternatives
        if (x < 0) {
            System.out.println("negative");
        } else {
            if (x == 0) {
                System.out.println("zero");
            } else {
                System.out.println("positive");
            }
        }

        if (x >= 0) {
            if (x == 0) {
                System.out.println("zero");
            } else {
                System.out.println("positive");
            }
        } else {
            System.out.println("negative");
        }

        /* A more elegant version to formulate multiple
             choices with nested if-statements. */
        if (x < 0) {
            System.out.println("negative");
        } else if (x == 0) { // and x >= 0
            System.out.println("zero");
        } else { // x >= 0 and x != 0
            System.out.println("positive");
        }
    }
}