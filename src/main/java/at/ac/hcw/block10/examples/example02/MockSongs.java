package at.ac.hcw.block10.examples.example02;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    /* static because this class does
         not have any instance fields */
    public static List<String> getSongStrings() {
        List<String> songs = new ArrayList<>();

        /* this will be our list of song
             titles to work with */
        songs.add("jingle bells");
        songs.add("master of puppets");
        songs.add("$10");
        songs.add("cassidy");
        songs.add("can't stop me now");
        songs.add("havana");
        songs.add("Cassidy");

        return songs;
    }
}