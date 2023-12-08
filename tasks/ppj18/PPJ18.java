package ppj18;

import java.util.Arrays;

public class PPJ18 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9, 10, 11};
        int[][] matrix = {
                {1, 3, 2},
                {4, 6, 5},
                {8, 7, 9},
                {0, 3, 1},
                {6, 9, 5}
        };

        System.out.println();
        calculateSquares(9, 9, 3);
        System.out.println();
        merge(arr1, arr2);
        System.out.println();
        trans(matrix);
        System.out.println();
    }

    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side) {
        int squaresCount = (screenHeight / side) * (screenWidth / side);
        System.out.println("Squares count on the area -> " + squaresCount);
        int[][] coordinates = new int[squaresCount][2];


        int x = 0;
        int y = 0;

        System.out.println("[x, " + "y]");
        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i] = new int[]{x, y};
            x = x + side;

            if (x >= screenWidth) {
                x = 0;
                y = y + side;
            }

            System.out.println(Arrays.toString(coordinates[i]));
        }

        return coordinates;
    }

    public static int[] merge(int[] tab1, int[] tab2) {


        int[] merged = new int[tab1.length + tab2.length];
        int maxLen = Math.max(tab1.length, tab2.length);

        int mergeIndex = 0;
        for (int i = 0; i < maxLen; i++) {
            if (i < tab1.length) {
                merged[mergeIndex] = tab1[i];
                mergeIndex++;
            }
            if (i < tab2.length) {
                merged[mergeIndex] = tab2[i];
                mergeIndex++;
            }
        }

        System.out.println("Merged arrays ---> " + Arrays.toString(merged));

        return merged;
    }

    public static int[][] trans(int[][] matrix) {
        int[][] reversedMatrix = new int[matrix[0].length][matrix.length];



        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                reversedMatrix[k][i] = matrix[i][k];
            }
        }

        System.out.println("BEFORE:");
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("AFTER:");
        for (int[] ints : reversedMatrix) {
            System.out.println(Arrays.toString(ints));
        }

        return reversedMatrix;
    }

    // TODO.... 4, 5, 6, 7, 8 TASKS

}
