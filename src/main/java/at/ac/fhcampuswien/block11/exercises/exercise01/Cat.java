package at.ac.fhcampuswien.block11.exercises.exercise01;

public class Cat extends Animal implements NoiseCapable {
    // parameterized constructor that takes the cat's name
    public Cat(String name) {
        super(name);
    }

    // non-parameterized constructor that gives the name "Cat"
    public Cat() {
        super("Cat");
    }

    // non-parameterized method purr
    public void purr() {
        System.out.println(super.getName() + " purrs.");
    }

    @Override
    public void makeNoise() {
        this.purr();
    }
}