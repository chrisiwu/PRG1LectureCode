package at.ac.fhcampuswien.block10.example01;

import java.util.Random;

public class Example01 {
    public static void main(String[] args) {
        /* an interface gives also an additional type to a class
           e.g. the class Bird becomes an Animal */

        // declare a variable of class type
        Bird myPet = new Bird();

        /* declare a variable of interface type and
           assign an object implementing the interface */
        AnimalBehaviour mySecondPet = new Bird();

        // assign a different animal
        mySecondPet = new Lion();

//        myPet = new Lion(); // DOES NOT WORK!

        /* the true benefits of interfaces are reaped
             when they are used as the type of
             parameter provided to a method
           printLegs can be given any class that implements
             the AnimalBehaviour interface as a parameter
         */
        Printer.printLegs(myPet);
        Printer.printLegs(mySecondPet);

        AnimalBehaviour newPet = getMyNextPet();
        Printer.printLegs(newPet);
    }

    public static AnimalBehaviour getMyNextPet() {
        Random ticket = new Random();
        // generate random number between 1 and 3
        int number = ticket.nextInt(3);

        if (number == 1) {
            return new Lion();
        } else if (number == 2) {
            return new Bird();
        } else {
            return new Dog();
        }
    }
}