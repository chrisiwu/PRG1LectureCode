package at.ac.fhcampuswien.block09.exercises.exercise02;

public class Product {
    private String name;
    private double price;

    public Product(String title, double price) {
        this.name = title;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void print() {
        System.out.println(this.name + " (" + this.price + ")");
    }
}