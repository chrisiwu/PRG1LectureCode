package at.ac.fhcampuswien.block13.examples.example04;

public class SimpleDate {
    // properties
    private int day;
    private int month;
    private int year;

    // constructor
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // methods
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}