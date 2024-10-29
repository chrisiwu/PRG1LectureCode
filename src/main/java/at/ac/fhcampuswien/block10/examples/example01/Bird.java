package at.ac.fhcampuswien.block10.examples.example01;

// class implements interface
public class Bird implements AnimalBehaviour {
    @Override
    public void eat() {
        System.out.println("eating worms.");
    }

    @Override
    public int noOfLegs() {
        return 2;
    }
}