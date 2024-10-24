package at.ac.fhcampuswien.block09.examples.example04;

public class Example04 {
    public static void main(String[] args) throws BadSizeException {
        Square square = new Square();

        square.setSize(5);
        System.out.println("width: " + square.width + ", height: " + square.height);

        square.setSize(10, 10);
        System.out.println("width: " + square.width + ", height: " + square.height);
    }
}