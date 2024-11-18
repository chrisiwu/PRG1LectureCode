package at.ac.fhcampuswien.block10.exercises.exercise01;

public class Clothes extends Product {
    String color;

    public Clothes(String title, double price, String color) {
        super(title, price);
        this.color = color;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Color: " + this.color);
    }
}