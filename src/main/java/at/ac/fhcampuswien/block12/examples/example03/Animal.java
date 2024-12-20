package at.ac.fhcampuswien.block12.examples.example03;

public class Animal<T> {
    private T myAnimal; // ok
    private T[] myZoo; // ok

    /* You cannot create objects or arrays
         of a parameterised type! */
//    public Animal() {
//        myAnimal = new T(); // error
//        myZoo = new T[10]; // error
//    }

    /* Provide objects of parameterised type
         as parameter.
       Create generic arrays of type Object
         and cast them to the parameterised type.
       This creates a warning,
         since it is not type-safe. */
//    @SuppressWarnings("unchecked")
    public Animal(T param) {
        myAnimal = param; // ok
        myZoo = (T[]) new Object[10]; // ok
    }
}