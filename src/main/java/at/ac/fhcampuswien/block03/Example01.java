package at.ac.fhcampuswien.block03;

public class Example01 {
    // methods are declared within a class
    // (but outside of any other method)
    public static void myMethod1(String string) {
        System.out.println(string);
    }

    public static int myMethod2(int number) {
        // return statement indicates which value will be the result of the method
        // (e.g. result of a math function)
        return number * 2 + 1;
    }

    public static void main(String[] args) {
        // usage of the method from within another method
        // (e.g. the main method)
        myMethod1("Hello!");

        int number = myMethod2(5);
        System.out.println("The new number is " + number + ".");
    }
}