package at.ac.hcw.block08.examples.example01;

/* link the classes to the new Button class,
     in a relationship called inheritance
   other classes are called subclasses
     or child classes
   subclasses inherit all attributes and
     methods from superclass
   in Java we say a subclass extends the superclass
   subclasses can add new methods and
     instance variables of its own
   instance variables are not overriden
   subclass can give an inherited instance
     variable any value it chooses
   a class can inherit properties and
     functionality from another class */
public class FabButton extends Button {
    private String icon;
    private int size;

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /* let's say FabButton had a completely
             different click and playSound behavior:
           FabButton can override the methods of Button
           overriding means that a subclass redefines
             one of it's inherited methods */
    @Override
    public void click() {
        System.out.println("Fab-Button clicked.");
    }

    @Override
    public void playSound() {
        System.out.println("Fab-Button plays sound.");
    }
}