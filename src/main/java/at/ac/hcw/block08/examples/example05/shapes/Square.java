package at.ac.hcw.block08.examples.example05.shapes;

public class Square extends Rectangle {
    /* Square is not a (true subtype of) Rectangle
       - rectangles are expected to have a width and
           height that can be changed independently
       - squares violate that expectation
       Rectangle is not a (true subtype of) Square
       - squares are expected to have equal widths
           and heights
       - rectangles violate that expectation
       inheritance isn't always intuitive
       - benefit: it forces clear thinking and
           prevents errors
       solution:
       - just keep them unrelated
       - or make them siblings under a common parent
       - or make them immutable */

    // require: width = height

    /* effect: sets all edges to given size
       does not override anything
       safe addition but Square still inherits
         setSize(int width, int height) from Rectangle
       misuse possible */
//    public void setSize(int edgeLength) {
//        this.width = edgeLength;
//        this.height = edgeLength;
//    }

    /* effect: set this.width and this.height to width
       overrides base behavior
       ignores the h parameter or forces w = h
       breaks expected behavior
       client expecting a Rectangle with different w and h
       now gets a square with both sides equal */
//    @Override
//    public void setSize(int width, int height) {
//        this.width = width;
//        this.height = width;
//    }

    /* effect: raise an error if w != h
       expecting a Rectangle the caller does not
         expect a constraint on the values
       client expects setSize to succeed,
         like with any rectangle
       but it now throws an exception because
         the sides are not equal */
//    @Override
//    public void setSize(int width, int height) throws BadSizeException {
//        if (width != height) {
//            throw new BadSizeException("Width and height must be equal for a square.");
//        }
//
//        this.width = width;
//        this.height = height;
//    }
}