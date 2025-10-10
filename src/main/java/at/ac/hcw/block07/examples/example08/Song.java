package at.ac.hcw.block07.examples.example08;

public class Song {
    private String title;

    public Song(String title) {
        this.title = title;
    }

    public void play() {
        SoundPlayer player = new SoundPlayer();

        player.playSound(this.title);
    }

//    /* keyword static lets a method run without any instance of the class
//       static methods cannot use non-static (instance) variables!
//       static methods cannot use non-static methods either! */
//    public static void main(String[] args) {
//        // this cannot be referenced from a static context
//        System.out.println("Title of this song is: " + this.title); // compiler error
//
//        play(); // non-static method 'play()' cannot be referenced from a static context
//    }
}