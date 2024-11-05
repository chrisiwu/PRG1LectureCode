package at.ac.fhcampuswien.block10.examples.example03;

/* abstract classes are similar to interfaces,
     you cannot instantiate them
   contain a mix of methods declared with or
     without an implementation (abstract)
   in contrast to interfaces, you can declare
     instance variables and methods
   an abstract class that implements an
     interface can but need not implement
     all methods of the interface
   if implementations of interface methods
     are missing, all concrete classes must
     implement them */
public abstract class GraphicObject implements Paintable {
    int x, y;

    public void moveTo(int newX, int newY) {
    }

    public abstract void draw();

    public abstract void resize();
}