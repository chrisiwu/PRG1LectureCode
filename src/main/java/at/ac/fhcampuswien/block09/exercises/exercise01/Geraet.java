package at.ac.fhcampuswien.block09.exercises.exercise01;

public class Geraet extends Device {
    private boolean an;

    public Geraet(String name) {
        super(name);
        this.an = false;
    }

    public boolean istAn() {
        return this.an;
    }

    public void einschalten() {
        this.an = true;
        System.out.println(super.getName() + " wurde eingeschaltet.");
    }

    public void ausschalten() {
        this.an = false;
        System.out.println(super.getName() + " wurde ausgeschaltet.");
    }
}