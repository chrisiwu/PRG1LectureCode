package at.ac.hcw.block07.examples.example04;

public class Cat {
    /* instance variables are declared inside
         a class but not within a method */
    private int size;
    private String name;
    private String breed = "Main Coon";

    public Cat(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int grow() {
        // local variables are declared within a method
        int grownSize = size * 2;
        return grownSize;
    }

//    public int grow() {
//        /* local variables must be initialized before use!
//           the following won't compile
//           one can declare grownSize without a value,
//             but as soon as you try to use it,
//             the compiler throws an error */
//        int grownSize;
//        int z = grownSize + 3; // variable grownSize might not have been initialized
//        return z;
//    }
}