package at.ac.fhcampuswien.block09.examples.example04;

public class Rectangle {
    protected int width, height;

    public void setSize(int width, int height) throws BadSizeException {
        this.width = width;
        this.height = height;
    }
}