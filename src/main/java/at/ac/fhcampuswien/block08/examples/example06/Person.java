package at.ac.fhcampuswien.block08.examples.example06;

public class Person implements Cloneable {
    // properties
    private String name;
    private SimpleDate birthday;

    // constructors
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    /* A copy constructor takes another object and
         copies its fields to create a new instance. */
    public Person(Person p1) {
        this(p1.name, p1.birthday.getDay(), p1.birthday.getMonth(), p1.birthday.getYear());
    }

    // methods
    public void setBirthday(int day, int month, int year) {
        this.birthday.setDay(day);
        this.birthday.setMonth(month);
        this.birthday.setYear(year);
    }

    @Override
    public String toString() {
        return this.name + " (" + this.birthday.toString() + ")";
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) { // if the variables are located in the same position, they are equal
            return true;
        }

        if (!(compared instanceof Person)) { // if the type of the compared object is not Person, the objects are not equal
            return false;
        }

        // convert the Object type compared object into Person object
        Person comparedPerson = (Person) compared;

        // if the values of the object variables are the same, the objects are equal
        if (this.name.equals(comparedPerson.name) &&
                this.birthday.getDay() == comparedPerson.birthday.getDay() &&
                this.birthday.getMonth() == comparedPerson.birthday.getMonth() &&
                this.birthday.getYear() == comparedPerson.birthday.getYear()) {
            return true;
        }

        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}