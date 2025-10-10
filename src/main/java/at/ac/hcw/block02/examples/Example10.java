package at.ac.hcw.block02.examples;

public class Example10 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z;
        char operator = '+';

        switch (operator) {
            case '+':
                z = x + y;
                System.out.println(z);
                break;
            case '-':
                z = x - y;
                System.out.println(z);
                break;
            case '*', 'x':
                z = x * y;
                System.out.println(z);
                break;
            default:
                System.out.println("invalid operator passed!");
        }
    }
}