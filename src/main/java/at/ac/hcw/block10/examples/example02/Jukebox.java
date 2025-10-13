package at.ac.hcw.block10.examples.example02;

import java.util.Collections;
import java.util.List;

public class Jukebox {
    public static void main(String[] args) {
        /* ArrayList elements are placed in
             the order in which they were added */
        new Jukebox().go();
    }

    public void go() {
        // store song title in a List of Strings
        List<String> songList = MockSongs.getSongStrings();

        // print the contents of songList
        System.out.println(songList);

        /* sort list using natural ordering:
           natural ordering is based on Unicode in Java:
             - numbers before uppercase letters
             - uppercase letters before lowercase letters
             - and some special characters before
                 numbers and some sort after */
        Collections.sort(songList);
        System.out.println(songList);
    }
}