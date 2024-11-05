package at.ac.fhcampuswien.block08.exercises.exercise02;

public class Strecke {
    private String name;
    private int laenge; // Länge der Strecke in Kilometern

    public Strecke(String name, int laenge) {
        this.name = name;
        this.laenge = laenge;
    }

    public String getName() {
        return this.name;
    }

    public int getLaenge() {
        return this.laenge;
    }
}