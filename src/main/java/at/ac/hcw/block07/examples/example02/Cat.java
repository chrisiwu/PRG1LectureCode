package at.ac.hcw.block07.examples.example02;

public class Cat {
    private int size;
    private String name;
    private String breed;

    public Cat(String name, int size) {
        this.name = name;
        this.size = size;
        this.breed = "";
    }

    /* setter methods for instance variables:
       build setter methods for all the instance variables
         and find a way to force other code to call the
         setters rather than access the data directly */
    public void setSize(int size) {
        if (size > 8) {
            this.size = size;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    /* getter methods for instance variables:
       a getter is a public method used to retrieve
         the value of a private field in a class */
    public String getName() {
        if (this.name == null || this.name.isEmpty()) {
            return "unnamed cat";
        }

        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public String getBreed() {
        return this.breed;
    }

    /* internal behavior encapsulation:
       suppose your class models a cat's behavior and
         you want to only expose high-level actions like
         meow() or fight() but keep internal logic
         (like how the cat prepares to fight)
         hidden from other classes */
    public void fight(Cat otherCat) {
        prepareForFight();
        System.out.println(this.name + ": fight! *scratches " + otherCat.name + " nose*");
    }

    // private function not callable from other classes
    private void prepareForFight() {
        System.out.println(this.name + " *arches its back and extends its claws*");
    }
}