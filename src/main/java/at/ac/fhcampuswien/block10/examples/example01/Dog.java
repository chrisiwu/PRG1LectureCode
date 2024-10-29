package at.ac.fhcampuswien.block10.examples.example01;

// class implements interface
public class Dog implements AnimalBehaviour {
    @Override
    public void eat() {
        System.out.println("eating sausage roll");
    }

    @Override
    public int noOfLegs() {
        return 4;
    }
}