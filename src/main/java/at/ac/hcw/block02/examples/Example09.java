package at.ac.hcw.block02.examples;

public class Example09 {
    public static void main(String[] args) {
        // choose between three alternatives
        int x = 5;

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

        /* a more elegant version to formulate multiple
             choices with nested if-statements */
        if (x < 0) {
            System.out.println("negative");
        } else if (x == 0) { // and x >= 0
            System.out.println("zero");
        } else { // x >= 0 and x != 0
            System.out.println("positive");
        }
    }
}