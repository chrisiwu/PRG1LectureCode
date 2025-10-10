package at.ac.hcw.block07.examples.example07;

public class Person implements Cloneable {
    private String name;
    // objects may contain references to objects
    private SimpleDate birthday;

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public Person(String name, SimpleDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    // copy constructor
    public Person(Person p1) {
        this(p1.name, p1.birthday.getDay(), p1.birthday.getMonth(), p1.birthday.getYear());
    }

    public void setName(String name) {
        this.name = name;
    }

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