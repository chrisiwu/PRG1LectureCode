package at.ac.fhcampuswien.block09.examples.example01_03;

public class SportsCar extends Car {
    public SportsCar(int speed) {
        super(speed);
    }

    @Override
    public void accelerate() {
        this.speed += 15;
    }
}