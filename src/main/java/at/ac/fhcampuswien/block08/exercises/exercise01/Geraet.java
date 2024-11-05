package at.ac.fhcampuswien.block08.exercises.exercise01;

public class Geraet {
    private String name;
    private boolean an;

    public Geraet(String name) {
        this.name = name;
        this.an = false;
    }

    public String getName() {
        return this.name;
    }

    public boolean istAn() {
        return this.an;
    }

    public void einschalten() {
        this.an = true;
        System.out.println(this.name + " wurde eingeschaltet.");
    }

    public void ausschalten() {
        this.an = false;
        System.out.println(this.name + " wurde ausgeschaltet.");
    }
}