package at.ac.fhcampuswien.block11.other.testpreparation;

public class Robot {
    // Eigenschaften 1
    private String name;
    private String serialNumber;
    private int energyLevel;
    private static int count = 0;

    // Konstruktor 2a
    public Robot(String name, String serialNumber, int energyLevel) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.energyLevel = energyLevel;
        count++;
    }

    // Konstruktor 2b
    public Robot(String name, String serialNumber) {
        this(name, serialNumber, 100);
    }

    // Konstruktor 2c
    public Robot(Robot r) {
        this(r.name, r.serialNumber, r.energyLevel);
    }

    // Methode 3a
    public String getName() {
        return this.name;
    }

    // Methode 3b
    public int getEnergyLevel() {
        return this.energyLevel;
    }

    // Methode 4
    public static int getCount() {
        return count;
    }

    // Methode 5a
    public boolean isOperational(int energyThreshold) {
        return this.energyLevel > energyThreshold;
    }

    // Methode 5b
    public static boolean isOperational(Robot r) {
        return r.energyLevel > 50;
    }

    // Methode 6
    @Override
    public String toString() {
        return "Robot (name: " + this.name + ", serialNumber: " + this.serialNumber + ", energyLevel: " + this.energyLevel + ")";
    }

    // Methode 7
    public void recharge(int energy) {
        this.energyLevel = Math.min(this.energyLevel + energy, 100);
    }

    // Methode 8
    public boolean compareRobots(Robot r) {
        return this.serialNumber.equals(r.serialNumber);
    }
}