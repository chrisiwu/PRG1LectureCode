package at.ac.fhcampuswien.block08.examples.example03;

public class Person {
    // properties
    private String name;
    private int birthYear;

    // constructors
    public Person(String name) {
        this.name = name;
        this.birthYear = 1970;
    }

    public Person(String name, int year) {
        this(name);
        this.birthYear = year;
    }

    // methods
    public int getBirthYear() {
        return birthYear;
    }
}