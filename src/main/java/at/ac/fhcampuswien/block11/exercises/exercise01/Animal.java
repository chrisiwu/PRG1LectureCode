package at.ac.fhcampuswien.block11.exercises.exercise01;

public abstract class Animal {
    private String name;

    // constructor that takes the animal's name as a parameter
    public Animal(String name) {
        this.name = name;
    }

    // non-parameterized method eat which return no value
    public void eat() {
        System.out.println(this.name + " eats.");
    }

    // non-parameterized method sleep which return no value
    public void sleep() {
        System.out.println(this.name + " sleeps.");
    }

    // method to get the animal's name
    public String getName() {
        return this.name;
    }
}