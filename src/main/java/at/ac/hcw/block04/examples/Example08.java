package at.ac.hcw.block04.examples;

public class Example08 {
    public static void main(String[] args) {
        double z = hypotenuse(3, 4); // usage of the method

        System.out.println("The hypotenuse is " + z + ".");
    }

    // method to calculate the hypotenuse of a triangle
    public static double hypotenuse(double side1, double side2) {
        /* each variable that is not a parameter
             must be declared as local variable (side3) */
        double side3;

        side3 = Math.sqrt(side1 * side1 + side2 * side2);

        /* Return Statement:
           The data type of the value must be equal
             to the returnType of the method!
           Execution of a method stops at the return statement.
           A method can have multiple return statements
             in different execution branches
             (e.g. one in the if and one in the else branch). */
        return side3;
    }
}