package at.ac.hcw.block06.examples.example03;

/* To create an object, we will use two classes.
   One class for the type of object we define
     (Cat, AlarmClock etc.) and another class to
     "test" that new class.
   We will put the main method in the "testing" class
     -> from which we will create and access
     objects of our class. */
public class Example03 {
    public static void main(String[] args) {
        Cat cat = new Cat(); // make a Cat object

        cat.setSize(23); // set the size of the Cat
        cat.meow(); // call meow() method

        Cat c = new Cat();
        c.setSize(30);
        c.setName("Garfield");

        Cat c2 = new Cat();
        c2.setSize(23);
        c2.setName("Mrs. Norris");
        c2.setBreed("Maine Coon");
    }
}