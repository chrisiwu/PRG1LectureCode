package at.ac.hcw.block10.examples.example03;

import java.util.Collections;
import java.util.List;

public class Jukebox {
    public static void main(String[] args) {
        new Jukebox().go();
    }

    public void go() {
        List<Song> songList = MockSongs.getSongs();

        System.out.println(songList);

        // sort list using natural ordering
        Collections.sort(songList);
        System.out.println(songList);

        // use Comparator in sort
        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);
        System.out.println(songList);

        // use lambda expressions for sorting
        songList.sort((o1, o2) -> o1.getArtist().compareTo(o2.getArtist()));
        System.out.println(songList);

        songList.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
        System.out.println(songList);
    }
}