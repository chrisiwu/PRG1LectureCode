package at.ac.fhcampuswien.block09.examples.example01_03;

public class SportsCar extends Car {
    public SportsCar(int speed) {
        /* super keyword enables to execute
             the original code of the super class */
        super(speed);
    }

    // modified behaviour
    /* overriding:
       - the argument list must be exactly the same
           as that of the overridden method
       - the return type must be the same or a subtype
           of the return type declared in the original
           overridden method in the superclass
       - the access level cannot be more restrictive
           than the overridden method's access level
       - instance methods can be overridden only if
           they are inherited by the subclass
       - a final method cannot be overridden
       - a static method cannot be overridden
           but can be re-declared
       - a subclass within the same package as the superclass
           can override any superclass method that is
           not declared private or final
       - a subclass in a different package can only override
           the non-final methods declared public or protected
       - constructors cannot be overridden
       - overridden methods shall be annotated with @Override */
    @Override
    public void accelerate() {
        /* super keyword enables to execute
             the original code of the super class */
        super.accelerate();
        this.speed += 5;
    }
}