package at.ac.fhcampuswien.block09.exercises.exercise02;

public class Book extends Product {
    String isbn;

    public Book(String title, double price, String isbn) {
        super(title, price);
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("ISBN: " + this.isbn);
    }
}