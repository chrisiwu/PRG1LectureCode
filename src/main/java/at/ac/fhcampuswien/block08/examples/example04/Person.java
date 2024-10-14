package at.ac.fhcampuswien.block08.examples.example04;

public class Person {
    // properties
    private String name;
    private SimpleDate birthday;
    private int age;

    // constructors
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public Person(String name, SimpleDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    // methods
    @Override
    public String toString() {
        return name + " (" + birthday.toString() + ")";
    }
}