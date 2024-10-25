package at.ac.fhcampuswien.block09.examples.example01_03;

public class Example01 {
    public static void main(String[] args) {
        /* actual type of an object dictates which
             method is executed
           an object's type decides what the methods
             provided by the object are
           if a reference to a Taxi type object is
             stored in a Car type variable, only the
             methods defined in the Car class (and its
             superclass and interfaces) are available */
        Car taxi = new Taxi(5);
        taxi.accelerate();
//        taxi.setOnDuty(true); // DOES NOT WORK!
        System.out.println(taxi);

        Object sportsCar = new SportsCar(200);
        System.out.println(sportsCar);
    }
}