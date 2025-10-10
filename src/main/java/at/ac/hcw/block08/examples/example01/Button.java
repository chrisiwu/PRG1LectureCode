package at.ac.hcw.block08.examples.example01;

/* Inheritance by Example:
   they are all Buttons and they all
     share some attributes and behavior
   abstract out the common features and
     put them into a new Button class
   only one copy of attributes and
     methods to maintain
   Button class is called the superclass
   inheritance is fundamental to object
     oriented programming and means
     code reuse
   it is a syntactical relationship
   inheritance enables incremental
     changes to classes */
public class Button {
    private String label;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void click() {
        System.out.println("Button clicked.");
    }

    public void playSound() {
        System.out.println("Play sound.");
    }
}