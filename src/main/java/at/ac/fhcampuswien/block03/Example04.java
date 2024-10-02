package at.ac.fhcampuswien.block03;

public class Example04 {
    public static void printDiff(int x, int y) {
        System.out.println("The difference is " + (x - y));
    }

    public static void main(String[] args) {
        printDiff(3, 4);
        printDiff(10, 2);
        printDiff(2, 10);
    }
}