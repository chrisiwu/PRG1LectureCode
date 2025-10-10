package at.ac.hcw.block08.examples.example05;

import at.ac.hcw.block08.examples.example05.shapes.Rectangle;
import at.ac.hcw.block08.examples.example05.shapes.Square;

public class Example05 {
    public static void main(String[] args) {
        Square s = new Square();

        s.setSize(5, 10); // valid call if method is inherited and not overridden

        System.out.println(s.getWidth()); // 5?
        System.out.println(s.getHeight()); // 10?

        Rectangle r = new Square(); // looks legal - it's a Square-as-a-Rectangle

        r.setSize(4, 5);  // valid for a Rectangle, right?
    }
}