package at.ac.fhcampuswien.block03.examples;

public class example11 {
    public static void main(String[] args) {
        double x = 1, y = 2, z;
        char operator = '*';

        switch (operator) {
            case '+':
                z = x + y;
                System.out.println(z);
                break;
            case '-':
                z = x - y;
                System.out.println(z);
                break;
            case '*':
                z = x * y;
                System.out.println(z);
                break;
            case '/':
                z = x / y;
                System.out.println(z);
                break;
            default:
                System.out.println("invalid operator passed!");
        }
    }
}