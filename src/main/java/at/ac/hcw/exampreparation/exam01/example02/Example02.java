package at.ac.hcw.exampreparation.exam01.example02;

public class Example02 {
    public static void main(String[] args) {
        drawPattern(7, 7, 'X', 'O');
        drawPattern(4, 12, '#', '$');
    }

    public static void drawPattern(int height, int width, char char1, char char2) {
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                if (row % 2 == 0) {
                    System.out.print(char1);
                } else {
                    if (column % 2 == 0) {
                        System.out.print(char1);
                    } else {
                        System.out.print(char2);
                    }
                }
            }

            System.out.println();
        }
    }
}