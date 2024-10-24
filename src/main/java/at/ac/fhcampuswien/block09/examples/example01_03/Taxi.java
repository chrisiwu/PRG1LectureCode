package at.ac.fhcampuswien.block09.examples.example01_03;

public class Taxi extends Car {
    private boolean onDuty;

    public Taxi(int speed) {
        super(speed);
    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

    @Override
    public void accelerate() {
        this.speed += 5;
    }
}