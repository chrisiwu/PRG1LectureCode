package at.ac.fhcampuswien.block09.examples.example01_03;

public class Car {
    protected int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    // base behaviour
    public void accelerate() {
        this.speed += 10;
    }

    @Override
    public String toString() {
        return "I am a " + this.getClass().getSimpleName() + ", speed: " + this.speed;
    }
}