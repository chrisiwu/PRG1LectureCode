package at.ac.fhcampuswien.block09.examples.example01_03;

public class Example01 {
    public static void main(String[] args) {
        Car taxi = new Taxi(5);
        taxi.accelerate();
//        taxi.setOnDuty(true); // DOES NOT WORK!
        System.out.println(taxi);

        Object sportsCar = new SportsCar(200);
        System.out.println(sportsCar);
    }
}