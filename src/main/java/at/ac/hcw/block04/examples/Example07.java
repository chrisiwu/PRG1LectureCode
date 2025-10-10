package at.ac.hcw.block04.examples;

public class Example07 {
    /* function scope (or method scope) refers to
         where a variables can be accessed in your code
       a variable declared inside a method only exists
         within that method – it is not visible outside */
    public static void main(String[] args) {
        int x = 10;

        greet(); // call another method

        System.out.println("x in main: " + x); // this works
    }

    public static void greet() {
        int y = 5;

        System.out.println("y in greet: " + y); // this works
//        System.out.println("x in greet: " + x); // this would cause an error
    }
}