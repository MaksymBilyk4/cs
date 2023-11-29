package ppj15;

import java.util.Arrays;

// Create an 8 × 8 two-dimensional float array. Fill it with random values,
// and then count the sum of the elements on the left and right diagonal.

public class Task2 {
    public static void main(String[] args) {
        float[][] matrix = new float[8][8];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (float) (Math.random() * 21);
            }
            System.out.println("Array number " + (i + 1) + ": " + Arrays.toString(matrix[i]));
        }

        float rightDiagonal = 0;
        float leftDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            rightDiagonal += matrix[i][i];
            leftDiagonal += matrix[i][matrix.length - 1 - i];
        }

        System.out.println("Sum of RIGHT diagonal -> " + rightDiagonal);
        System.out.println("Sum of LEFT diagonal -> " + leftDiagonal);
    }
}
