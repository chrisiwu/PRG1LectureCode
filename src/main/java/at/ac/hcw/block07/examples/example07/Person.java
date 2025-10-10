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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}