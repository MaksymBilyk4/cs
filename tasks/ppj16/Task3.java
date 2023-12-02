package ppj16;

// Prepare a rectangular array (with random natural positive dimensions) of int variables and fill it with random values from the interval [0,10].
// Create and display a one-dimensional array containing the maximum (then min, max, ..., alternating) value from each column of the input array.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int length = (int) (Math.random() * 10 + 1);

        int[][] matrix = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int k = 0; k < length; k++) {
                matrix[i][k] = (int) (Math.random() * 11);
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

        int max;
        int min;

        int[] vector = new int[2 * length];
        int vectorIndex = 0;

        for (int i = 0; i < length; i++) {
// тут проблема потому что мы не знаем как поставить на новой итерации максимально и минимальное значение

            max = matrix[i][0];
            min = matrix[i][0];
            for (int k = 0; k < length; k++) {
                if (matrix[k][i] > max) {
                    max = matrix[k][i];
                }
                if (matrix[k][i] < min) {
                    min = matrix[k][i];
                }
            }
            vector[vectorIndex] = min;
            vectorIndex++;
            vector[vectorIndex] = max;
            vectorIndex++;
        }
        System.out.println();
        System.out.println(Arrays.toString(vector));
    }
}
