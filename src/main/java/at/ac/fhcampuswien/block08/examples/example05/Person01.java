package at.ac.fhcampuswien.block08.examples.example05;

public class Person01 {
    // properties
    private String name;
    private SimpleDate birthday;

    // constructors
    public Person01(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public Person01(String name, SimpleDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    // methods
    @Override
    public String toString() {
        return this.name + " (" + this.birthday.toString() + ")";
    }
}