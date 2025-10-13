package at.ac.hcw.block10.examples.example04;

public class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private int bpm;

    public Song(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getBpm() {
        return this.bpm;
    }

    @Override
    public String toString() {
        return this.title;
    }

    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.title);
    }

    @Override
    public boolean equals(Object aSong) {
        Song other = (Song) aSong;

        /* as title is a String, we can again use
             the overridden equals method it provides */
        return this.title.equals(other.title);
    }

    @Override
    public int hashCode() {
        /* String class has also an
             overridden hashCode method
           notice that hashCode and equals are
             using the SAME instance variable (title) */
        return title.hashCode();
    }
}