package at.ac.fhcampuswien.block14.example06_07;

import java.io.Serializable;

public class SimpleDate implements Serializable {
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