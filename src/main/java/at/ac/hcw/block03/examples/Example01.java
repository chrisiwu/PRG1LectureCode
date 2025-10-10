package at.ac.hcw.block03.examples;

public class Example01 {
    public static void main(String[] args) {
        /* initialisation: setting initial values used
             within the condition - iterator variables */
        int i = 0;

        while (i < 5) { // condition: defines how often the loop is executed
            System.out.println("Hello World!");
            i = i + 1; // update: variables involved in condition are updated
        }
    }
}