package at.ac.fhcampuswien.block09.exercises.exercise02;

public class Electronics extends Product {
    String warranty;

    public Electronics(String title, double price, String warranty) {
        super(title, price);
        this.warranty = warranty;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Warranty: " + this.warranty);
    }
}