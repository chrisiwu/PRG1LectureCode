package at.ac.hcw.block07.examples.example03;

public class Cat {
    private int size;
    private String name;
    private String breed;

    public Cat(String name, int size) {
        this.name = name;
        this.size = size;
        this.breed = "";
    }

    public void fight(Cat otherCat) {
        prepareForFight();
        System.out.println(this.name + ": fight! *scratches " + otherCat.name + " nose*");
    }

    private void prepareForFight() {
        System.out.println(this.name + " *arches its back and extends its claws*");
    }
}