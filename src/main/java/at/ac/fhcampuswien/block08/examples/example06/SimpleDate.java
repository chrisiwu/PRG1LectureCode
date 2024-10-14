package at.ac.fhcampuswien.block08.examples.example06;

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
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }
}