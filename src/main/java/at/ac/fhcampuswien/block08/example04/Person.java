package at.ac.fhcampuswien.block08.example04;

public class Person {
    private String name;
    private SimpleDate birthday;
    private int age;

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public Person(String name, SimpleDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String toString() {
        return name + " (" + birthday.toString() + ")";
    }
}