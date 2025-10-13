package at.ac.hcw.block10.examples.example08;

import java.io.Serializable;

/* Serialization:
   is used to save/persist state of an object
   used to travel objects across a network
   classes can be serialized when they implement
     the java.io.Serializable interface */
public class Person implements Serializable {
    private String name;
    private SimpleDate birthday;

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    @Override
    public String toString() {
        return this.name + " (" + this.birthday.toString() + ")";
    }
}