package at.ac.fhcampuswien.block11.exercises.exercise01;

public class Dog extends Animal implements NoiseCapable {
    // parameterized constructor that takes the dog's name
    public Dog(String name) {
        super(name);
    }

    // non-parameterized constructor that gives the name "Dog"
    public Dog() {
        super("Dog");
    }

    // non-parameterized method bark
    public void bark() {
        System.out.println(super.getName() + " barks.");
    }

    @Override
    public void makeNoise() {
        this.bark();
    }
}