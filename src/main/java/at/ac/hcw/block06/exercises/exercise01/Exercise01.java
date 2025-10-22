package at.ac.hcw.block06.exercises.exercise01;

public class Exercise01 {
    public static void main(String[] args) {
        // Create Car objects
        Car car1 = new Car("Tesla", 2022, "electric", 120);
        Car car2 = new Car("BMW", "diesel");

        // use methods
        car1.honk();
        System.out.println("Is " + car1.getBrand() + " electric? " + car1.isElectric());

        car2.honk();
        System.out.println("Is " + car2.getBrand() + " electric? " + car2.isElectric());

        // update speed
        car2.setSpeed(80);
        System.out.println(car2.getBrand() + " speed: " + car2.getSpeed() + " km/h");
    }
}