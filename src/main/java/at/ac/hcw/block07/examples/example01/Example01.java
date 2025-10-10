package at.ac.hcw.block07.examples.example01;

public class Example01 {
    public static void main(String[] args) {
        Cat c = new Cat("Garfield", 30);

        /* leaving instance variables exposed means
             reachable with the dot operator */
        c.size = 27;

        // exposing data can be quite dangerous
        c.size = 0; // our cats should not be that small :-(
    }
}