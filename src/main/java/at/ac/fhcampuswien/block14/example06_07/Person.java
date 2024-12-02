package at.ac.fhcampuswien.block14.example06_07;

import java.io.Serializable;

public class Person implements Serializable {
    // properties
    private String name;
    private SimpleDate birthday;

    // constructors
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year); // objects may contain references to objects
    }

    public Person(String name, SimpleDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    // methods
    @Override
    public String toString() {
        return this.name + " (" + this.birthday.toString() + ")";
    }
}