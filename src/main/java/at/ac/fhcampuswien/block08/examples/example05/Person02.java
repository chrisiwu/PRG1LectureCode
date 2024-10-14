package at.ac.fhcampuswien.block08.examples.example05;

public class Person02 {
    // properties
    private String name;
    private SimpleDate birthday;
    private int age;

    // constructors
    public Person02(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public Person02(String name, SimpleDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    // methods
    @Override
    public String toString() {
        return name + " (" + birthday.toString() + ")";
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) { // if the variables are located in the same position, they are equal
            return true;
        }

        if (!(compared instanceof Person02)) { // if the type of the compared object is not Person, the objects are not equal
            return false;
        }

        // convert the Object type compared object into Person object
        Person02 comparedPerson = (Person02) compared;

        // if the values of the object variables are the same, the objects are equal
        if (this.name.equals(comparedPerson.name) &&
                this.birthday.getDay() == comparedPerson.birthday.getDay() &&
                this.birthday.getMonth() == comparedPerson.birthday.getMonth() &&
                this.birthday.getYear() == comparedPerson.birthday.getYear()) {
            return true;
        }

        return false;
    }
}