package at.ac.fhcampuswien.block10.exercises.exercise01;

public class ShoppingCart {
    public static void main(String[] args) {
//        Cart cart = new Cart();
        Cart cart;

        Product product1 = new Electronics("Laptop", 1000, "31.12.2026");
        Product product2 = new Food("Pizza", 5, "30.11.2024");
        Product product3 = new Book("The Book Thief", 20, "9781784162122");
        Product product4 = new Clothes("Jacket", 100, "Blue");

        cart = new Cart(new Product[]{product1, product2, product3});
        cart.addProduct(product4);

        cart.print();
        System.out.println();

        cart.removeProduct(product2);

        cart.print();
        System.out.println();

        System.out.println("Total: " + cart.getTotal());
    }
}