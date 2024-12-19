package at.ac.fhcampuswien.block06.other;

public class Puzzle {
    public static void printArray2DGray(int[][] array2D) {
        for (int row = 0; row < array2D.length; row++) {
            for (int column = 0; column < array2D[row].length; column++) {
                System.out.print(String.format("%3d ", array2D[row][column]) + " ");
            }

            System.out.println();
        }
    }

    public static int[] getHistogram2DGray(int[][] array2D) {
        int[] hist = new int[256];

        for (int row = 0; row < array2D.length; row++) {
            for (int column = 0; column < array2D[row].length; column++) {
                int value = array2D[row][column];
                hist[value]++;
            }
        }

        return hist;
    }

    public static void printHistogram2DGray(int[] hist) {
        for (int row = 0; row < hist.length; row++) {
            if (hist[row] > 0) {
                System.out.print(String.format("%3d ", row) + " ");
                for (int count = 1; count <= hist[row]; count++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[][] hiddenMessageArray = {
                {183, 0, 20, 220, 113, 220, 157, 0, 113, 255, 220, 157, 255, 157, 220, 0, 79, 220, 0},
                {157, 157, 220, 183, 79, 157, 79, 255, 183, 79, 113, 20, 157, 183, 113, 20, 255, 113, 255},
                {20, 113, 128, 128, 128, 128, 255, 128, 128, 128, 128, 157, 128, 0, 79, 0, 128, 157, 79},
                {79, 157, 128, 0, 255, 128, 20, 157, 183, 113, 128, 220, 128, 79, 255, 79, 128, 20, 20},
                {183, 79, 128, 128, 128, 128, 157, 128, 128, 128, 128, 113, 128, 255, 128, 20, 128, 255, 220},
                {79, 220, 113, 20, 0, 128, 220, 0, 183, 220, 128, 255, 128, 128, 183, 128, 128, 183, 255},
                {20, 255, 128, 128, 128, 128, 79, 128, 128, 128, 128, 220, 128, 0, 113, 79, 128, 157, 113},
                {255, 183, 20, 157, 255, 79, 183, 113, 183, 113, 183, 20, 157, 113, 255, 157, 255, 20, 183},
                {79, 157, 113, 20, 79, 157, 255, 20, 220, 20, 157, 79, 255, 79, 183, 79, 220, 255, 220}
        };

        printArray2DGray(hiddenMessageArray);
        System.out.println();
        printHistogram2DGray(getHistogram2DGray(hiddenMessageArray));
    }
}