package at.ac.fhcampuswien.block07.exercises.exercise02;

public class Exercise02 {
    public static void main(String[] args) {
//        Cart cart = new Cart();
        Cart cart;

        Product product1 = new Product("Laptop", 1000, 20, "A123");
        Product product2 = new Product("Smartphone", 500, 20, "B456");
        Product product3 = new Product("Headphones", 100, 20, "C789");

//        cart.addProduct(product1);
//        cart.addProduct(product2);
//        cart.addProduct(product3);

        cart = new Cart(new Product[]{product1, product2});
        cart.addProduct(product3);

        System.out.println("Products in the cart:");
        cart.print();

        cart.removeProduct(product2);
        System.out.println("Products in the cart:");
        cart.print();

        System.out.println("Total: " + cart.getTotal());
        System.out.println("Total incl. Tax: " + cart.getTotalInclusiveTax());
    }
}