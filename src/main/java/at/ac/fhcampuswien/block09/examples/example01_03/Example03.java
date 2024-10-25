package at.ac.fhcampuswien.block09.examples.example01_03;

public class Example03 {
    public static void main(String[] args) {
        Car car = new Car(5);
        Car sportsCar = new SportsCar(5);

        // instanceof keyword
        System.out.println(car instanceof Object); // true
        System.out.println(car instanceof Car); // true
        System.out.println(car instanceof SportsCar); // false

        System.out.println(sportsCar instanceof Object); // true
        System.out.println(sportsCar instanceof Car); // true
        System.out.println(sportsCar instanceof SportsCar); // true
    }
}