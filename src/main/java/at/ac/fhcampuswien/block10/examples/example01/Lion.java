package at.ac.fhcampuswien.block10.examples.example01;

// class implements interface
public class Lion implements AnimalBehaviour {
    @Override
    public void eat() {
        System.out.println("eating meat");
    }

    @Override
    public int noOfLegs() {
        return 4;
    }
}