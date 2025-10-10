package at.ac.hcw.block07.examples.example06;

public class Cat {
    private int size;
    private String name;
    private String breed = "Main Coon";

    public Cat(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /* the equals method is meant to compare the
         contents of two objects to determine if
         they are logically equivalent
       each class in Java inherits equals from
         base class Object
       default implementation compares the equality
         of the references (like ==)
       if we want to compare objects of our own design,
         we need to override equals in the class
       it returns a boolean type value – which
         indicates whether the objects are equal */

    @Override
    public boolean equals(Object other) {
        // if references are the same they are equal
        if (this == other) {
            return true;
        }

        // if the type is not Cat, they are not equal
        if (!(other instanceof Cat)) {
            return false;
        }

        Cat cat = (Cat) other; // cast Object to Cat object

        // if name and size are equal the objects are too
        return this.name.equals(cat.name) && this.size == cat.size;
    }
}