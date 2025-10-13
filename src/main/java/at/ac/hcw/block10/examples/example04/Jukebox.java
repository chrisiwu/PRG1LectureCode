package at.ac.hcw.block10.examples.example04;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jukebox {
    public static void main(String[] args) {
        new Jukebox().go();
    }

    public void go() {
        List<Song> songList = MockSongs.getSongs();

        songList.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
        System.out.println(songList);

        Set<Song> songSet = new HashSet<>(songList);
        System.out.println(songSet);
    }
}