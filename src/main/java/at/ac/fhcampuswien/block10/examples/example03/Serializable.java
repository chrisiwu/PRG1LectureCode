package at.ac.fhcampuswien.block10.examples.example03;

/* tagging interface:
   creates a common parent: for example, when
     an interface extends Serializable, the JVM knows
     that this particular interface is going to be used
     in storing and loading data
   adds a data type to a class (= tagging): a
     class that implements a tagging interface does
     not need to define any methods (since the
     interface does not have any), but the class
     becomes an interface type through
     polymorphism. */
public interface Serializable {
}