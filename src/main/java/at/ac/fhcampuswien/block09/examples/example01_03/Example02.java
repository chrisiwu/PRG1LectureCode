package at.ac.fhcampuswien.block09.examples.example01_03;

public class Example02 {
    public static void main(String[] args) {
        Car car = new Car(5);
        car.accelerate(); // calls Car.accelerate
        System.out.println(car); // I am a Car, speed: 15

        Car sportsCar = new SportsCar(5);
        sportsCar.accelerate(); // calls SportsCar.accelerate
        System.out.println(sportsCar); // I am a SportsCar, speed: 20

        Car taxi = new Taxi(5);
        taxi.accelerate(); // calles Car.accelerate
        System.out.println(taxi); // I am a Taxi, speed: 10
    }
}