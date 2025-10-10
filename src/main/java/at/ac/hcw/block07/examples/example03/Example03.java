package at.ac.hcw.block07.examples.example03;

public class Example03 {
    public static void main(String[] args) {
        Cat a = new Cat("Garfield", 30);

        System.out.println(a); // Cat@53d8d10a

        /* create 2 new Cat objects
           assign objects to the reference variables
           the 2 Cat objects are now living on the heap */
        Cat b = new Cat("Garfield", 30);
        Cat c = new Cat("Mrs. Norris", 24);
        /* declare a new Cat reference variable
           assign the value of c to d
           both c and d refer to the same object!
           c and d hold two different copies of the same value */
        Cat d = c;

        /* object variables actually only store an object reference:
           holds bits that represent a way to access an object
           like a pointer or address */
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        /* assign value of b to c
           the bits inside b are copied and the
             new copy is stuffed into variable c */
        c = b;
        System.out.println(c);

        /* assigning null to c makes it a null reference
           it is still a reference variable, and another
             Cat object can still be assigned to it */
        c = null;
        System.out.println(c);

        /* calling a method on an object that refers
             to nothing throws a NullPointerException */
        c.fight(a);
    }
}