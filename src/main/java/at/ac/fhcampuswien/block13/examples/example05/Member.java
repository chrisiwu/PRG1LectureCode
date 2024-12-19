package at.ac.fhcampuswien.block13.examples.example05;

public class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.height + ")";
    }

    /* The compareTo method is used to compare objects.
       If a class implements the Comparable interface,
         objects created from that class can be sorted
         using Java's sorting algorithms.
       compareTo method has the object to which this
         object is compared and returns an integer:
         - negative integer: this comes before the object received
         - positive integer: this comes after the object received
         - 0: otherwise
       Natural ordering */
    @Override
    public int compareTo(Member member) {
//        return this.height - member.getHeight();

        if (this.height == member.getHeight()) {
            return 0;
        } else if (this.height > member.getHeight()) {
            return 1;
        } else {
            return -1;
        }
    }
}