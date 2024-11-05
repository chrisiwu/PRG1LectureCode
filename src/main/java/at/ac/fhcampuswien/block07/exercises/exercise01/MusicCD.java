package at.ac.fhcampuswien.block07.exercises.exercise01;

import java.util.ArrayList;

public class MusicCD {
    private String title;
    private String artist;
    private Date releaseDate;
    private ArrayList<Track> tracks;

    public MusicCD(String title, String artist, String releaseDate) {
        this.title = title;
        this.artist = artist;
        this.releaseDate = new Date(releaseDate);
        this.tracks = new ArrayList<>();
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public Track getTrack(int number) {
        if (number >= 0 && number < this.tracks.size()) {
            return this.tracks.get(number);
        } else {
            return null;
        }
    }

    public int getDuration() {
        int totalLength = 0;

        for (Track track : this.tracks) {
            totalLength += track.getLength();
        }

        return totalLength;
    }

    public Date getReleaseDate() {
        return this.releaseDate;
    }

    public void addTrack(Track track) {
        this.tracks.add(track);
    }
}