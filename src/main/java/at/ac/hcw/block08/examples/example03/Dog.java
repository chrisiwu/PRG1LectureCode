package at.ac.hcw.block08.examples.example03;

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("The dog barks.");
    }

    @Override
    public void eat() {
        System.out.println("The dog eats meat.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog sleeps.");
    }

    @Override
    public void roam() {
        System.out.println("The dog roams.");
    }
}