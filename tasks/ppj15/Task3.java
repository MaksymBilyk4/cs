package ppj15;

import java.util.Arrays;

// Create and fill (with random values) a two-dimensional rectangular array of int variables.
// Then find the element closest to the (arithmetic) mean of the elements in this array.

public class Task3 {
    public static void main(String[] args) {
        final int matrixLen = (int) (Math.random() * 10 + 1);

        System.out.println();
        System.out.println("Random generated length -> " + matrixLen);

        int[][] matrix = new int[matrixLen][matrixLen];

        double avg = 0;
        int rnd = 0;

        for (int i = 0; i < matrixLen; i++) {
            for (int j = 0; j < matrixLen; j++) {
                rnd = (int) (Math.random() * 11);
                matrix[i][j] = rnd;
                avg += rnd;
            }
            System.out.println("Matrix el " + (i + 1) + " " + Arrays.toString(matrix[i]));
        }

        avg = avg / (matrixLen * matrixLen);

        System.out.println("Average array value -> " + avg);

        double avgNumDiff = Math.abs(avg - matrix[0][0]);
        int closestNum = matrix[0][0];

        for (int i = 0; i < matrixLen; i++){
            for (int j = 0; j < matrixLen; j++){
                if ((Math.abs(avg - matrix[i][j])) < avgNumDiff) {
                    closestNum = matrix[i][j];
                    avgNumDiff = (Math.abs(avg - matrix[i][j]));
                }
            }
        }

        System.out.println("Num from matrix the closest to average number -> " + closestNum);
    }
}
