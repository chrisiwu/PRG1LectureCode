package at.ac.fhcampuswien.block08.examples.example06;

public class Person implements Cloneable {
    // properties
    private String name;
    SimpleDate birthday;
    private int age;

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
        return name + " (" + birthday.toString() + ")";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}