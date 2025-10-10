package at.ac.hcw.block08.examples.example03;

public class Example03 {
    public static void main(String[] args) {
    /* polymorphism:
       any subclass of a supertype can be
         substituted where the supertype
         is expected
       with polymorphism, the reference
         type and the object type can be
         different
       any object that has the IS-A
         relationship for the type can be
         assigned to that variable */
        Cat cat1 = new Cat();
        Animal cat2 = new Cat();

        // declare array of supertype
        Animal[] animals = new Animal[3];

        // store ANY subclass of supertype
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Bird();

        /* loop through array and call one of
             the Animal class methods and every
             object does the right behavior */
        for (Animal a : animals) {
            a.eat();
            a.sleep();
        }
    }
}