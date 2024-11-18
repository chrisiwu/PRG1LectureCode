package at.ac.fhcampuswien.block10.exercises.exercise01;

public abstract class Product implements Printable {
    private String name;
    private double price;

    public Product(String title, double price) {
        this.name = title;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(this.name + " (" + this.price + ")");
    }
}