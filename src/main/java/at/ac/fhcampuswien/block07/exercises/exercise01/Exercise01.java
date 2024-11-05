package at.ac.fhcampuswien.block07.exercises.exercise01;

public class Exercise01 {
    public static void main(String[] args) {
        MusicCD cd = new MusicCD("Greatest Hits", "Billy Talent", "11.10.2024");

        cd.addTrack(new Track("Song 1", 240));
        cd.addTrack(new Track("Song 2", 300));
        cd.addTrack(new Track("Song 3", 180));

        System.out.println("Title: " + cd.getTitle());
        System.out.println("Artist: " + cd.getArtist());
        System.out.println("Release Date: " + cd.getReleaseDate());
        System.out.println("Total Duration: " + cd.getDuration() + " seconds");

        for (int i = 0; i < 3; i++) {
            Track track = cd.getTrack(i);
            System.out.println("Track " + (i + 1) + ": " + track.getTitle() + " (" + track.getLength() + " seconds)");
        }
    }
}