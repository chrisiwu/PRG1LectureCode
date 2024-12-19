package at.ac.fhcampuswien.block11.exercises.exercise01;

public class Exercise01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.makeNoise();
        System.out.println();

        Dog fido = new Dog("Fido");
        fido.bark();
        System.out.println();

        Cat cat = new Cat();
        cat.purr();
        cat.eat();
        cat.makeNoise();
        System.out.println();

        Cat garfield = new Cat("Garfield");
        garfield.purr();
        System.out.println();

        Animal[] myPets1 = new Animal[2];
        myPets1[0] = fido;
        myPets1[1] = garfield;
        for (Animal pet : myPets1) {
            System.out.println(pet.getName());
        }
        System.out.println();

        NoiseCapable[] myPets2 = new NoiseCapable[2];
        myPets2[0] = fido;
        myPets2[1] = garfield;
        for (NoiseCapable pet : myPets2) {
            pet.makeNoise();
        }
    }
}