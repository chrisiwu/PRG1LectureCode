package at.ac.fhcampuswien.block07.exercises.exercise01;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(String date) {
        String[] parts = date.split("\\.");

        this.day = Integer.parseInt(parts[0]);
        this.month = Integer.parseInt(parts[1]);
        this.year = Integer.parseInt(parts[2]);
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}