package at.ac.hcw.block08.examples.example02;

public class SportsCar extends Car {
    /* modified behaviour
       the argument list must be exactly the same
         as that of the overridden method
       otherwise, it is method overloading rather
         than overriding!
       the return type must be the same or a
         subtype of the return type declared in
         the original overridden method in the
         superclass
       the access level cannot be more restrictive
         than the overridden method's access level
       instance methods can be overridden only
         if they are inherited by the subclass
       a final method cannot be overridden
       a static method cannot be overridden but
         can be re-declared
       if you define a static method in a subclass
         with the same signature you are hiding
         the superclass method (method hiding)
       a subclass within the same package as the
         superclass can override any superclass
         method that is not declared private
         or final
       a subclass in a different package can only
         override the non-final methods declared
         public or protected
       constructors cannot be overridden
       overridden methods shall be annotated
         with @Override */
    @Override
    public void accelerate() {
        speed += 15;
    }
}