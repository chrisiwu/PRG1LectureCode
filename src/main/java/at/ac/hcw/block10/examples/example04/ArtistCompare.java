package at.ac.hcw.block10.examples.example04;

import java.util.Comparator;

public class ArtistCompare implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getArtist().compareTo(o2.getArtist());
    }
}