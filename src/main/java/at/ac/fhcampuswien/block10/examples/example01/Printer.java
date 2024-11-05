package at.ac.fhcampuswien.block10.examples.example01;

public class Printer {
    /* The true benefits of interfaces are reaped
         when they are used as the type of
         parameter provided to a method.
       printLegs can be given any class that
         implements the AnimalBehaviour
         interface as a parameter. */
    public static void printLegs(AnimalBehaviour animal) {
        System.out.println("Number of legs: " + animal.noOfLegs());
    }
}