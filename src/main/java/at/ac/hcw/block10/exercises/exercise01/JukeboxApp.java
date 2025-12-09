package at.ac.hcw.block10.exercises.exercise01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class JukeboxApp {
    private ArrayList<Song> library = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new JukeboxApp().run();
    }

    public void run() {
        while (true) {
            System.out.println("\nJukebox Menu:");
            System.out.println("1. Add song");
            System.out.println("2. Update song");
            System.out.println("3. Delete song");
            System.out.println("4. List all songs");
            System.out.println("5. Filter songs");
            System.out.println("6. Sort songs");
            System.out.println("0. Exit\n");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addSong();
                    break;
                case 2:
                    updateSong();
                    break;
                case 3:
                    deleteSong();
                    break;
                case 4:
                    listSongs();
                    break;
                case 5:
                    filterSongs();
                    break;
                case 6:
                    sortSongs();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private void addSong() {
        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Artist: ");
        String artist = scanner.nextLine();

        System.out.print("Year: ");
        int year = scanner.nextInt();

        library.add(new Song(title, artist, year));

        System.out.println("Song added.");
    }

    private void updateSong() {
        listSongs();

        System.out.print("Select song number to update: ");
        int idx = scanner.nextInt() - 1;

        if (idx < 0 || idx >= library.size()) {
            System.out.println("Invalid index.");
        } else {
            Song song = library.get(idx);

            System.out.print("New title (" + song.getTitle() + "): ");
            String title = scanner.nextLine();

            System.out.print("New artist (" + song.getArtist() + "): ");
            String artist = scanner.nextLine();

            System.out.print("New year (" + song.getYear() + "): ");
            int year = scanner.nextInt();

            song.setTitle(title);
            song.setArtist(artist);
            song.setYear(year);

            System.out.println("Song updated.");
        }
    }

    private void deleteSong() {
        listSongs();

        System.out.print("Select song number to delete: ");
        int idx = scanner.nextInt() - 1;

        if (idx < 0 || idx >= library.size()) {
            System.out.println("Invalid index.");
        } else {
            library.remove(idx);

            System.out.println("Song removed.");
        }
    }

    private void listSongs() {
        if (library.isEmpty()) {
            System.out.println("No songs in the library.");
        } else {
            for (int i = 0; i < library.size(); i++) {
                System.out.println((i + 1) + ". " + library.get(i));
            }
        }
    }

    private void filterSongs() {
        System.out.print("Filter by (title/artist): ");
        String keyword = scanner.nextLine().toLowerCase();

        for (Song song : library) {
            if (song.getTitle().toLowerCase().equals(keyword) ||
                    song.getArtist().toLowerCase().equals(keyword)) {
                System.out.println(song);
            }
        }
    }

    private void sortSongs() {
        System.out.print("Sort by (title/artist/year): ");
        String field = scanner.nextLine().toLowerCase();

        Comparator<Song> comparator;

        switch (field) {
            case "title":
                comparator = Comparator.comparing(Song::getTitle);
                break;
            case "artist":
                comparator = Comparator.comparing(Song::getArtist);
                break;
            case "year":
                comparator = Comparator.comparingInt(Song::getYear);
                break;
            default:
                System.out.println("Unknown field.");
                return;
        }

        library.sort(comparator);

        System.out.println("Songs sorted by " + field + ".");

        listSongs();
    }
}