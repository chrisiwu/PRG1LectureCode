package at.ac.fhcampuswien.block10.example03;

abstract class GraphicObject implements Paintable {
    int x, y;

    void moveTo(int newX, int newY) {
    }

    abstract void draw();

    abstract void resize();

    public void fill() {
    }

    public void stroke() {
    }
}