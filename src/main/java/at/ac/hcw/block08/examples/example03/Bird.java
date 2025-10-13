package at.ac.hcw.block08.examples.example03;

public class Bird extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("The bird chirps.");
    }

    @Override
    public void eat() {
        System.out.println("The bird eats worms.");
    }

    @Override
    public void sleep() {
        System.out.println("The bird sleeps.");
    }

    @Override
    public void roam() {
        System.out.println("The bird roams.");
    }
}