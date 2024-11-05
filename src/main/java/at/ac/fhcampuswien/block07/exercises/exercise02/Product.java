package at.ac.fhcampuswien.block07.exercises.exercise02;

public class Product {
    private String title;
    private double price;
    private double vat;
    private String articleNumber;

    public Product(String title, double price, double vat, String articleNumber) {
        this.title = title;
        this.price = price;
        this.vat = vat;
        this.articleNumber = articleNumber;
    }

    public double getPrice() {
        return this.price;
    }

    public double getPriceInclusiveTax() {
        return this.price + (this.price * this.vat / 100);
    }

    public void print() {
        System.out.println(this.title + " (" + this.articleNumber + "): " + getPriceInclusiveTax());
    }
}