package at.ac.hcw.block08.examples.example04;

import at.ac.hcw.block08.examples.example04.cars.Car;
import at.ac.hcw.block08.examples.example04.cars.SportsCar;
import at.ac.hcw.block08.examples.example04.cars.Taxi;

public class Example04 {
    public static void main(String[] args) {
        /* an object's type decides what the
             methods provided by the object are
           if a reference to abTaxitype object
             is stored in a Car type variable,
             only the methods defined in the Car
             class (and its superclass and interfaces)
             are available */
        Car cab = new Taxi(5);

        cab.accelerate();
//        taxi.setOnDuty(true); // DOES NOT WORK!
        System.out.println(cab);

        Car car = new Car(5);
        car.accelerate();   // calls Car.accelerate
        System.out.println(car.getSpeed()); // 10

        Car sportsCar = new SportsCar(5);
        sportsCar.accelerate(); // calls SportsCar.accelerate
        System.out.println(sportsCar.getSpeed()); // 20

        Car taxi = new Taxi(5);
        taxi.accelerate();  // calls Car.accelerate
        System.out.println(taxi.getSpeed()); // 10

        // instanceof returns true or false
        System.out.println(car instanceof Object); // true
        System.out.println(car instanceof Car); // true
        System.out.println(car instanceof SportsCar); // false

        System.out.println(sportsCar instanceof Object); // true
        System.out.println(sportsCar instanceof Car); // true
        System.out.println(sportsCar instanceof SportsCar); // true
    }
}