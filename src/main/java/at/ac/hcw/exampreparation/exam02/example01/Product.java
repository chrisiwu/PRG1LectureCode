package at.ac.hcw.exampreparation.exam02.example01;

public class Product {
    private String name;
    private double price;
    private int vat;
    private String articleNumber;

    public Product(String name, double price, int vat, String articleNumber) {
        this.name = name;
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

    public String getArticleNumber() {
        return this.articleNumber;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.articleNumber + "): " + getPriceInclusiveTax();
    }
}