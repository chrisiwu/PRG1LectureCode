package at.ac.fhcampuswien.block09.examples.example04;

public class Square extends Rectangle {
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