package at.ac.fhcampuswien.block03;

public class Example01 {
    public static void myMethod1(String string) {
        System.out.println(string);
    }

    public static int myMethod2(int number) {
        return number * 2 + 1;
    }

    public static void main(String[] args) {
        myMethod1("Hello!");

        int number = myMethod2(5);
        System.out.println("The new number is " + number + ".");
    }
}