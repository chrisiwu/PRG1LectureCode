package at.ac.fhcampuswien.block08.example02;

public class Person {
    // properties
    private String name;
    private int birthYear;

    // constructor
    public Person(String name) {
        this.name = name;
        this.birthYear = 1970;
    }

    // methods
    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String toString() {
        return name + " (" + birthYear + ")";
    }
}