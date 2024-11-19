package at.ac.fhcampuswien.block13.examples.example04;

public class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " (" + height + ")";
    }

    @Override
    public int compareTo(Member member) {
        return this.height - member.getHeight();

//        if (this.height == member.getHeight()) {
//            return 0;
//        } else if (this.height > member.getHeight()) {
//            return 1;
//        } else {
//            return -1;
//        }
    }
}