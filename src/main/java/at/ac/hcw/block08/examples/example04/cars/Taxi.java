package at.ac.hcw.block08.examples.example04.cars;

public class Taxi extends Car {
    private boolean onDuty;

    public Taxi(int speed) {
        super(speed);
    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }
}