package at.ac.hcw.block06.examples.example06;

public class Cat {
    private int size;
    private String breed;
    private String name;

    public Cat(String name, int size) {
        this.name = name;
        this.size = size;
        this.breed = "";
    }

    /* a method is a named section of source
         code that can be invoked
       in this example the method name
         is preceded by public void,
         since it's visible to the outside
         world and does not return a value */
    public void meow() {
        System.out.println(this.name + ": Meow!");
    }

    // methods can be overloaded like constructors
    public void fight() {
        System.out.println("Cat fight!");
    }

    public void fight(Cat otherCat) {
        System.out.println(this.name +
                ": fight! *scratches " +
                otherCat.name + " nose*");
    }
}