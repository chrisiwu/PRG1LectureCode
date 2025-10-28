package at.ac.hcw.exampreparation.exam02.example01;

public class Exercise01 {
    public static void main(String[] args) {
        // test your implementation here
        Product product1 = new Product("Laptop", 1000, 20, "A123");
        Product product2 = new Product("Smartphone", 500, 20, "B456");
        Product product3 = new Product("Headphones", 100, 20, "C789");

        Cart cart1 = new Cart();
        Cart cart2 = new Cart(5);
        Cart cart3 = new Cart(new Product[]{product1, product2});

        Cart.analyzeCarts();

        cart1.addItem(product1);
        cart2.addItem(product2);
        cart3.addItem(product3);

        Cart.analyzeCarts();

        cart3.enlargeCart();
        cart3.addItem(product3);

        Cart.analyzeCarts();

        cart3.removeItem("A123");

        Cart.analyzeCarts();

        cart1.printCart();
        cart2.printCart();
        cart3.printCart();
    }
}