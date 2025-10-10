package at.ac.hcw.block08.examples.example04.cars;

public class Car {
    protected int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        speed += 5;
    }

    @Override
    public String toString() {
        return "Car with speed " + speed + '.';
    }

    public int getSpeed() {
        return speed;
    }
}