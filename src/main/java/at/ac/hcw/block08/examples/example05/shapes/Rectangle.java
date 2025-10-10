package at.ac.hcw.block08.examples.example05.shapes;

public class Rectangle {
    protected int width, height;

    public void setSize(int width, int height) throws BadSizeException {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}