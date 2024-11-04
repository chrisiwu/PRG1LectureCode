package at.ac.fhcampuswien.block10.examples.example03;

public abstract class GraphicObject implements Paintable {
    int x, y;

    void moveTo(int newX, int newY) {
    }

    abstract void draw();

    abstract void resize();
}