package at.ac.hcw.block08.examples.example04.cars;

public class SportsCar extends Car {
    public SportsCar(int speed) {
        super(speed);
    }

    @Override
    public void accelerate() {
        speed += 15;
    }
}