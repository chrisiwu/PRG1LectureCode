package at.ac.fhcampuswien.block07.exercises.exercise02;

public class Cart {
    //    private ArrayList<Product> products;
    private Product[] products;

//    public Cart() {
//        this.products = new ArrayList<>();
//    }

    public Cart(Product[] products) {
        this.products = products;
    }

//    public void addProduct(Product product) {
//        this.products.add(product);
//    }

    public void addProduct(Product product) {
        Product[] newProducts = new Product[this.products.length + 1];

        // copy old products in new array
        for (int i = 0; i < this.products.length; i++) {
            newProducts[i] = this.products[i];
        }

        // add new product
        newProducts[this.products.length] = product;

        this.products = newProducts;
    }

//    public void removeProduct(Product product) {
//        this.products.remove(product);
//    }

    public void removeProduct(Product product) {
        Product[] newProducts = new Product[this.products.length - 1];
        int counter = 0;

        for (int i = 0; i < this.products.length; i++) {
            if (!this.products[i].equals(product)) {
                newProducts[counter] = this.products[i];
                counter++;
            }
        }

        this.products = newProducts;
    }

    public double getTotal() {
        double total = 0;

        for (Product product : this.products) {
            total += product.getPrice();
        }

        return total;
    }

    public double getTotalInclusiveTax() {
        double total = 0;

        for (Product product : this.products) {
            total += product.getPriceInclusiveTax();
        }

        return total;
    }

    public void print() {
        for (Product product : this.products) {
            product.print();
        }
    }
}