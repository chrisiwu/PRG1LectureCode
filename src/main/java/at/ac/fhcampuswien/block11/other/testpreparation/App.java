package at.ac.fhcampuswien.block11.other.testpreparation;

public class App {
    // Methode 9
    public static Robot[] generateRobots(int numberOfRobots) {
        Robot[] robots = new Robot[numberOfRobots];

        for (int i = 0; i < numberOfRobots; i++) {
            robots[i] = new Robot("Unknown", "000-0-00-000000-0", 0);
        }

        return robots;
    }

    public static void main(String[] args) {
        // Testen der Implementierung
        Robot r1 = new Robot("Robo1", "123-456-789", 80);
        Robot r2 = new Robot("Robo2", "987-654-321");
        Robot r3 = new Robot(r1);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("Anzahl der Roboter: " + Robot.getCount());

        System.out.println("Robo1 ist betriebsbereit: " + r1.isOperational(50));
        System.out.println("Robo2 ist betriebsbereit: " + Robot.isOperational(r2));

        r1.recharge(30);
        System.out.println("Robo1 nach dem Aufladen: " + r1);

        System.out.println("Robo1 und Robo3 haben die gleiche Seriennummer: " + r1.compareRobots(r3));

        Robot[] robots = generateRobots(5);
        for (Robot robot : robots) {
            System.out.println(robot);
        }
    }
}