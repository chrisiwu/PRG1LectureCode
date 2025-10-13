package at.ac.hcw.block10.examples.example03;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<Song> getSongStrings() {
        List<Song> songs = new ArrayList<>();

        songs.add(new Song("Jingle Bells", "Traditional", 90));
        songs.add(new Song("Master of Puppets", "Metallica", 220));
        songs.add(new Song("$10", "Hitchhiker", 120));
        songs.add(new Song("Cassidy", "The Grateful Dead", 115));
        songs.add(new Song("Can't Stop Me Now", "Queen", 135));
        songs.add(new Song("Havana", "Camila Cabello", 105));
        songs.add(new Song("Cassidy", "The Grateful Dead", 115));

        return songs;
    }
}