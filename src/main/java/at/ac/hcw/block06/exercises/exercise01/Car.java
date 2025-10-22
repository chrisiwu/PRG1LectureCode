package at.ac.hcw.block06.exercises.exercise01;

/* Define a Car class.
   Cars have a brand, a year of permit (Zulassung),
     a type of engine and a speed.
   Write at least two constructors.
   Write getter and setter functions
     for your class properties.
   Write a function honk that writes
     "{brand}: beep beep!" to the console
     and returns nothing.
   Write a function isElectric that returns true
     if the Car object has electric engine
     and false if anything else.
   Create another Class with a main method;
     create Car objects and call their methods. */
public class Car {
    // properties - instance variables
    private String brand;
    private int year;
    private String engineType;
    private int speed;

    // constructors
    public Car(String brand, int year, String engineType, int speed) {
        this.brand = brand;
        this.year = year;
        this.engineType = engineType;
        this.speed = speed;
    }

    public Car(String brand, String engineType) {
        this(brand, 1900, engineType, 100);
//        this.brand = brand;
//        this.engineType = engineType;
//        this.year = 1900; // default year
//        this.speed = 100; // default speed
    }

    // methods
    // getters
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getSpeed() {
        return speed;
    }

    // setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // honk method
    public void honk() {
        System.out.println(brand + ": beep beep!");
    }

    // check if electric
    public boolean isElectric() {
        return engineType.equalsIgnoreCase("electric");
    }

    // accelerate by 10
    public int accelerate() {
        speed += 10;

        return speed;
    }

    // accelerate by custom increment
    public int accelerate(int increment) {
        speed += increment;

        return speed;
    }

    // brake by 10
    public int brake() {
        speed -= 10;

        if (speed < 0) {
            speed = 0;
        }

        return speed;
    }

    // brake by custom decrement
    public int brake(int decrement) {
        speed -= decrement;

        if (speed < 0) {
            speed = 0;
        }

        return speed;
    }
}