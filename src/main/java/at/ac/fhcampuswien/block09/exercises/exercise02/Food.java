package at.ac.fhcampuswien.block09.exercises.exercise02;

public class Food extends Product {
    String bestBefore;

    public Food(String title, double price, String bestBefore) {
        super(title, price);
        this.bestBefore = bestBefore;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Best Before: " + this.bestBefore);
    }
}