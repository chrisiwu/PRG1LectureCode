package at.ac.fhcampuswien.block11.examples.example01;

public class SaleProduct extends Product {
    public Product recommend(SaleProduct ref) {
        return null;
    }

    @Override
    public SaleProduct recommend(Product ref) {
        return null;
    }

    public Product recommend(Object ref) {
        return null;
    }

//    public Product recommend(Product ref) throws NoSaleException {
//        return null;
//    }
}