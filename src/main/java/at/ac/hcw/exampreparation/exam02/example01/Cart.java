package at.ac.hcw.exampreparation.exam02.example01;

public class Cart {
    private String cartName;
    private Product[] items;
    private int itemCount;
    private static int cartCount;
    private static double revenue;
    private static double revenueInclTax;

    public Cart() {
        this(10);
    }

    public Cart(int numberItems) {
        this.cartName = "Cart " + ++cartCount;
        this.items = new Product[numberItems];
    }

    public Cart(Product[] products) {
        this.cartName = "Cart " + ++cartCount;
        this.items = products;

        for (Product product : products) {
            if (product != null) {
                this.itemCount++;
            }
        }

        revenue = this.getTotal();
        revenueInclTax = this.getTotalInclusiveTax();
    }

    public boolean isFull() {
        return this.items.length == this.itemCount;
    }

    public boolean isEmpty() {
        return this.itemCount == 0;
    }

    public boolean addItem(Product product) {
        if (!isFull()) {
            for (int i = 0; i < this.items.length; i++) {
                if (this.items[i] == null) {
                    this.items[i] = product;

                    this.itemCount++;
                    revenue += product.getPrice();
                    revenueInclTax += product.getPriceInclusiveTax();

                    return true;
                }
            }
        }

        System.out.println("Cart is full. Product cannot be added.");

        return false;
    }

    public boolean removeItem(String articleNumber) {
        if (!isEmpty()) {
            for (int i = 0; i < this.items.length; i++) {
                if (this.items[i].getArticleNumber().equals(articleNumber)) {
                    this.itemCount--;
                    revenue -= this.items[i].getPrice();
                    revenueInclTax -= this.items[i].getPriceInclusiveTax();

                    this.items[i] = null;

                    return true;
                }
            }
        }

        System.out.println("Product not found.");

        return false;
    }

    public void enlargeCart() {
        Product[] newProducts = new Product[this.items.length + 5];

        // copy old products in new array
        for (int i = 0; i < this.items.length; i++) {
            newProducts[i] = this.items[i];
        }

        this.items = newProducts;
    }

    public double getTotal() {
        double total = 0;

        for (Product product : this.items) {
            if (product != null) {
                total += product.getPrice();
            }
        }

        return total;
    }

    public double getTotalInclusiveTax() {
        double total = 0;

        for (Product product : this.items) {
            if (product != null) {
                total += product.getPriceInclusiveTax();
            }
        }

        return total;
    }

    public void printCart() {
        System.out.println("Products in " + this.cartName + " (size: " + this.items.length + "):");

        for (Product product : this.items) {
            if (product != null) {
                System.out.println(product);
            }
        }

        System.out.println("----------");
        System.out.println("Total: " + this.getTotal());
        System.out.println("Total incl. Tax: " + this.getTotalInclusiveTax());
        System.out.println("----------");
    }

    public static void analyzeCarts() {
        System.out.println("Number of carts: " + cartCount);
        System.out.printf("The overall net revenue is %.0f.%n", revenue);
    }
}