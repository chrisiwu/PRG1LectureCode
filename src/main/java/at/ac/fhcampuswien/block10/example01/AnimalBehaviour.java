package at.ac.fhcampuswien.block10.example01;

/* describes a contract between the
     client and the implementation
   when a class implements an interface,
     it signs an agreement that the class
     will implement the methods defined by
     the interface; if those methods are not
     implemented in the class, the program
     will not compile
   interface defines only the names, parameters,
     and return values of the required methods
   they don't include the actual implementations
     of the methods
   a visibility attribute on interfaces is not
     marked explicitly as they're always public */
public interface AnimalBehaviour {
    void eat();

    int noOfLegs();
}