package at.ac.hcw.block10.examples.example03;

public class Song implements Comparable<Song> {
    // 3 instance variables for song attributes
    private String title;
    private String artist;
    private int bpm;

    /* constructor that sets variables
         when new Song is created */
    public Song(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    /* we override toString(), because we want
                 to print the title when we do
                  System.out.println(song) */
    @Override
    public String toString() {
        return this.title;
    }

    /* Comparable Interface:
       defines the compareTo method used to compare objects
       compareTo method has the object to which this
         object is compared and returns an integer:
         - negative integer: this comes before
             the object received
         - Positive integer: this comes after
             the object received
         - 0: otherwise */
    @Override
    public int compareTo(Song o) {
        /* we just pass the work on to the title
             String objects, since we know
             Strings have a compareTo() method */
        return title.compareTo(o.title);
    }
}