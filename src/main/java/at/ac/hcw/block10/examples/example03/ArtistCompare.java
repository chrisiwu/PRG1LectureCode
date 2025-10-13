package at.ac.hcw.block10.examples.example03;

import java.util.Comparator;

/* Custom Comparator:
   using Comparable interface works only
     for one implementation of compareTo().
   if you want to be able to have different
     views of the song list, one by title
     and one by artist, you need to write
     your own Comparator */
public class ArtistCompare implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getArtist().compareTo(o2.getArtist());
    }
}