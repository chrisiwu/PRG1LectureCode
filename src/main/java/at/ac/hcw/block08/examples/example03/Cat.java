package at.ac.hcw.block08.examples.example03;

public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("The cat meows.");;
    }

    @Override
    public void eat() {
        System.out.println("The cat eats lasagne.");;
    }

    @Override
    public void sleep() {
        System.out.println("The cat sleeps.");;
    }

    @Override
    public void roam() {
        System.out.println("The cat roams.");
    }
}