package at.ac.fhcampuswien.block09.examples.example04;

public class Square extends Rectangle {
    /* square is not a (true subtype of) rectangle
       - rectangles are expected to have a width and
           height that can be changed independently
       - squares violate that expectation
       rectangle is not a (true subtype of) square
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

    // effect: sets all edges to given size
    public void setSize(int edgeLength) {
        this.width = edgeLength;
        this.height = edgeLength;
    }

    // override:

    // effect: set this.width and this.height to width
//    @Override
//    public void setSize(int width, int height) {
//        this.width = width;
//        this.height = width;
//    }

    // effect: raise an error if w != h
    @Override
    public void setSize(int width, int height) throws BadSizeException {
        if (width != height) {
            throw new BadSizeException("Width and height must be equal for a square.");
        }

        this.width = width;
        this.height = height;
    }
}